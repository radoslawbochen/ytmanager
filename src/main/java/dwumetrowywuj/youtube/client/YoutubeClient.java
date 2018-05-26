package dwumetrowywuj.youtube.client;

import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.PlaylistItemListResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@PropertySource("classpath:/youtube.properties")
@Component
public class YoutubeClient {

    @Value("${api.key}")
    private String apiKey;

    private static YouTube youtube;

    public YoutubeClient() {
        youtube = new YouTube.Builder(new NetHttpTransport(), new JacksonFactory(), request -> {
            }).setApplicationName("youtube-client").build();
    }

    public PlaylistItemListResponse getPlaylistById(String id) {
        try {
            YouTube.PlaylistItems.List playlistList = youtube.playlistItems()
                    .list("id,snippet")
                    .setKey(apiKey)
                    .setPlaylistId(id);

            return playlistList.execute();
        } catch (IOException e) {
            throw new YoutubeClientException(e);
        }
    }

}
