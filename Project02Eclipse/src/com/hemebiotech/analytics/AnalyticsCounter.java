package com.hemebiotech.analytics;

import DataReadWrite.ISymptomReader;
import DataReadWrite.ISymptomWriter;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

    private final ISymptomReader reader;
    private final ISymptomWriter writer;
    private final Counter counter = new Counter();
    private final SortSymptoms sorter = new SortSymptoms();

    public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void run(String outputFile) {
        List<String> symptoms = reader.GetSymptoms();
        Map<String, Integer> counted = counter.countSymptoms(symptoms);
        Map<String, Integer> sorted = sorter.sortSymptoms(counted);
        writer.write(outputFile, sorted);
    }
}
