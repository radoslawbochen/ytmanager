package dwumetrowywuj.configuration.objectmapper;

public class ObjectMapperException extends RuntimeException {

    private String value;

    ObjectMapperException(String message, String value) {
        super(message);
        this.value = value;
    }

    ObjectMapperException(String message) {
        super(message);
    }

    public String getValue() {
        return value;
    }

}
