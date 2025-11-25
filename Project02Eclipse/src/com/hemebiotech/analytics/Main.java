package com.hemebiotech.analytics;

import DataReadWrite.ISymptomReader;
import DataReadWrite.ISymptomWriter;
import DataReadWrite.ReadSymptomDataFromFile;
import DataReadWrite.WriteSymptomDataToFile;

public class Main {

    public static void main(String[] args) {

        ISymptomReader reader =
                new ReadSymptomDataFromFile("F:/Java/salmon_alaxandre-debug-java/Project02Eclipse/src/symptoms.txt");

        ISymptomWriter writer =
                new WriteSymptomDataToFile();

        AnalyticsCounter app = new AnalyticsCounter(reader, writer);

        app.run("result.txt");

        System.out.println("✔ Programme terminé !");
    }
}
