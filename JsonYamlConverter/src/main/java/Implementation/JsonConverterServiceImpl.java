package Implementation;

import FileAndConverter.ConverterService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class JsonConverterServiceImpl implements ConverterService {
    @Override
    public String convert(String str) {
        try {
            return new Yaml().dump(
                    new ObjectMapper().readValue(str, Map[].class));
        } catch (JsonProcessingException e) {
            System.out.println("can not convert this file");
        }
        return str;
    }
}
