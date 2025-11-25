package com.hemebiotech.analytics;

import DataReadWrite.ReadSymptomDataFromFile;
import DataReadWrite.WriteSymptomDataToFile;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

    public static void main(String[] args) {

        // 1. Lire les symptômes
        ReadSymptomDataFromFile reader =
                new ReadSymptomDataFromFile("F:/Java/salmon_alaxandre-debug-java/Project02Eclipse/src/symptoms.txt");

        List<String> symptoms = reader.GetSymptoms();

        // 2. Compter
        Counter counter = new Counter();
        Map<String, Integer> counts = counter.countSymptoms(symptoms);

        SortSymptoms sorter = new SortSymptoms();
        Map<String, Integer> sortedSymptoms = sorter.sortSymptoms(counts);

        // 3. Écrire dans un fichier
        WriteSymptomDataToFile writer = new WriteSymptomDataToFile();
        writer.write("result.txt", sortedSymptoms);

        System.out.println("result.txt créé !");
    }
}
