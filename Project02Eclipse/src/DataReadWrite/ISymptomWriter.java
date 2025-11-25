package DataReadWrite;

import java.util.List;
import java.util.Map;

public interface ISymptomWriter {
    void write(String filepath, Map<String, Integer> symptoms);
}
