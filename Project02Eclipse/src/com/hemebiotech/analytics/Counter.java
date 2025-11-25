package com.hemebiotech.analytics;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Counter {

    public Map<String, Integer> countSymptoms(List<String> symptoms) {
        Map<String, Integer> result = new HashMap<>();//création d'une map

        for (String symptom : symptoms) {
            result.put(symptom, result.getOrDefault(symptom, 0) + 1); // cherche si le symptom existe
            //Si non, renourne zero puis monte le compte avec mise à jour de la map
        }

        return result;
    }
}
