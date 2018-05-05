package dwumetrowywuj.youtube.client;

import com.google.api.client.googleapis.json.GoogleJsonError;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;

import java.util.List;

public class YoutubeClientException extends RuntimeException {

    private List<GoogleJsonError.ErrorInfo> errors;

    YoutubeClientException(Throwable cause) {
        super(cause);
        if (cause instanceof GoogleJsonResponseException) {
            errors = ((GoogleJsonResponseException) cause).getDetails().getErrors();
        }
    }

    public List<GoogleJsonError.ErrorInfo> getErrors() {
        return errors;
    }

}
