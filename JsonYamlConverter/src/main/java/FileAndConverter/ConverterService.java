package FileAndConverter;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface ConverterService {
    String convert(String str) throws  JsonProcessingException;

}
