package Implementation;

import FileAndConverter.ConverterService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.util.Map;


public class YamlConverterServiceImpl implements ConverterService {

    @Override
    public String convert(String str){
        Yaml yaml = new Yaml(new Constructor(Map[].class));
        Map[] obj = yaml.load(str);
        try {
            return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            System.out.println("can not convert this file");
            throw new RuntimeException(e);
        }
    }
}
