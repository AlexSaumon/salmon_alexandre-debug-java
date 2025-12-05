package com.hemebiotech.analytics;

import SymptomeReader.ISymptomReader;
import SymptomWriter.ISymptomWriter;
import SymptomeReader.ReadSymptomDataFromFile;
import SymptomWriter.WriteSymptomDataToFile;

public class Main {

    public static void main(String[] args) {
        //Objet de lecture des symptomes. On peut changer ici l'origine du fichier
        ISymptomReader reader =
                new ReadSymptomDataFromFile("/src/symptoms.txt");

        //Objet d'écriture de la listes des symptomes
        ISymptomWriter writer =
                new WriteSymptomDataToFile();

        //Injection des objets pour assembler les programme
        AnalyticsCounter app = new AnalyticsCounter(reader, writer);

        //Lancement du programme
        app.listSymptoms("result.txt");

        System.out.println("✔ Programme terminé !");
    }
}
