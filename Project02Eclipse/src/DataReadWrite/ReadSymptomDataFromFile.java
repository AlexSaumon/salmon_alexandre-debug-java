package DataReadWrite;

import com.hemebiotech.analytics.AnalyticsCounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
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
        ArrayList<String> result = new ArrayList<>();

        InputStream is = AnalyticsCounter.class.getResourceAsStream("/symptoms.txt");

        if (is == null) {
            throw new RuntimeException("File symptoms.txt NOT FOUND in classpath!");
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {

            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }


}
