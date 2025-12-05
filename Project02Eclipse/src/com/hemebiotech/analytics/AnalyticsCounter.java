package com.hemebiotech.analytics;

import SymptomCounter.Counter;
import SymptomCounter.SortSymptoms;
import SymptomeReader.ISymptomReader;
import SymptomWriter.ISymptomWriter;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
    //initialisation des attributs
    //Mise en place des interface Pour lire le fichier et écrire sur un autre
    private final ISymptomReader reader;
    private final ISymptomWriter writer;
    //Objet ocmptant les symptomes
    private final Counter counter = new Counter();
    //Objet's triant les symptomes
    private final SortSymptoms sorter = new SortSymptoms();

    //constructeur pour injecter les dépendances
    public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    //traitement

    public void listSymptoms(String outputFile) {
        List<String> symptoms = reader.GetSymptoms();//lecture du fichier
        Map<String, Integer> counted = counter.countSymptoms(symptoms);//décomptes des symptomes
        Map<String, Integer> sorted = sorter.sortSymptoms(counted);//Triage des symptomes
        writer.write(outputFile, sorted);//ecriture sur un fichier séparé
    }
}
