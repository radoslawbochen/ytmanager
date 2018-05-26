package dwumetrowywuj.api.exception;

import dwumetrowywuj.configuration.objectmapper.ObjectMapperException;
import dwumetrowywuj.downloader.YoutubeDownloaderException;
import dwumetrowywuj.youtube.client.YoutubeClientException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;

@ControllerAdvice
public class DownloaderControllerAdvice {

    @ExceptionHandler(YoutubeClientException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ExceptionResponse handleYoutubeClientException(YoutubeClientException e) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(e);

        if (e.getErrors() != null) {
            exceptionResponse.setErrorMessage(e.getErrors());
        } else {
            exceptionResponse.setErrorMessage(e.getCause().getMessage());
        }

        return exceptionResponse;
    }

    @ExceptionHandler({YoutubeDownloaderException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ExceptionResponse handleYoutubeDownloaderException(YoutubeDownloaderException e) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(e);

        exceptionResponse.setErrorMessage(e.getMessage());

        return exceptionResponse;
    }

    @ExceptionHandler(ObjectMapperException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ExceptionResponse handleMappingException(ObjectMapperException e) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(e);

        if (e.getValue() != null) {
            HashMap<String, String> objectMappingErrorDetails = new HashMap<>();
            objectMappingErrorDetails.put("value", String.format("Error while mapping value: '%s' ", e.getValue()));
            objectMappingErrorDetails.put("exceptionMessage", e.getMessage());

            exceptionResponse.setErrorMessage(objectMappingErrorDetails);
        } else {
            exceptionResponse.setErrorMessage(e.getMessage());
        }

        return exceptionResponse;
    }

}
