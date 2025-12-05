package SymptomeReader;

import com.hemebiotech.analytics.AnalyticsCounter;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *  Code servant uniquement à extraire les données du fichier
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private final String filepath;

	/**
	 *
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

    @Override
    public List<String> GetSymptoms() {

        //liste de symptomes retourner
        ArrayList<String> result = new ArrayList<>();
        //lecture du fichier
        InputStream is = AnalyticsCounter.class.getResourceAsStream("/symptoms.txt");

        //erreur si il n'y a pas de symptoms.txt
        if (is == null) {
            throw new RuntimeException("File symptoms.txt NOT FOUND in classpath!");
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            //lecture ligne par ligne
            String line;
            while ((line = reader.readLine()) != null) {
                //ajout de la ligne à la liste
                result.add(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        //renvoie de la liste complète non trier
        return result;
    }


}
