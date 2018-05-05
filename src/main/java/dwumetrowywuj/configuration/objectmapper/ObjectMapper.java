package dwumetrowywuj.configuration.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Component;

@Component
public class ObjectMapper extends com.fasterxml.jackson.databind.ObjectMapper {

    public String writeValueAsString(String value) {
        try {
            return super.writeValueAsString(value);
        } catch (JsonProcessingException e) {
            throw new ObjectMapperException(e.getMessage(), value);
        }
    }

    public String writeValueAsString(Object value) {
        try {
            return super.writeValueAsString(value);
        } catch (JsonProcessingException e) {
            throw new ObjectMapperException(e.getMessage());
        }
    }

}
