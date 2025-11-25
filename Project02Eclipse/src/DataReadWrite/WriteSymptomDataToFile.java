package DataReadWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile {

    public void write(String filepath, Map<String, Integer> symptoms) {

        try (FileWriter writer = new FileWriter(filepath)) {

            for (Map.Entry<String, Integer> entry : symptoms.entrySet()) { //Boucle pour tout parcourir
                writer.write(entry.getKey() + " : " + entry.getValue() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
