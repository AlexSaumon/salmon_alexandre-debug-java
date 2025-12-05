package SymptomWriter;

import java.util.Map;

public interface ISymptomWriter {
    void write(String filepath, Map<String, Integer> symptoms);
}
