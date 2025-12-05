package com.hemebiotech.analytics;

import SymptomeReader.ISymptomReader;
import SymptomWriter.ISymptomWriter;
import SymptomeReader.ReadSymptomDataFromFile;
import SymptomWriter.WriteSymptomDataToFile;

public class Main {

    public static void main(String[] args) {

        ISymptomReader reader =
                new ReadSymptomDataFromFile("F:/Java/salmon_alaxandre-debug-java/Project02Eclipse/src/symptoms.txt");

        ISymptomWriter writer =
                new WriteSymptomDataToFile();

        AnalyticsCounter app = new AnalyticsCounter(reader, writer);

        app.listSymptoms("result.txt");

        System.out.println("✔ Programme terminé !");
    }
}
