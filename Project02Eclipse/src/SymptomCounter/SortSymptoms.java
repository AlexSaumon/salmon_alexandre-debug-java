package SymptomCounter;

import java.util.Map;
import java.util.TreeMap;

public class SortSymptoms {
    //fonction pour faire un triage alphabétique
    public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
        return new TreeMap<>(symptoms);
}
}

