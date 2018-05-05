package dwumetrowywuj.api.exception;

import com.fasterxml.jackson.annotation.JsonRawValue;
import dwumetrowywuj.configuration.objectmapper.ObjectMapper;


public class ExceptionResponse {

    private String exceptionName;
    @JsonRawValue
    private String errorMessage;

    public ExceptionResponse(Throwable exception) {
        exceptionName = exception.getClass().getName();
    }

    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = prettyPrint(errorMessage);
    }

    private String prettyPrint(Object message) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(message);
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getExceptionName() {
        return exceptionName;
    }

    public void setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
    }

}
