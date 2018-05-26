package dwumetrowywuj.youtube.model.mapper;

import com.google.api.services.youtube.model.PlaylistItem;
import com.google.api.services.youtube.model.PlaylistItemListResponse;
import dwumetrowywuj.youtube.model.dto.Playlist;
import dwumetrowywuj.youtube.model.dto.Video;

public class YoutubeClientResponseMapper {

    public Playlist map(PlaylistItemListResponse playlistItemListResponse) {
        Playlist playlist = new Playlist();
        playlistItemListResponse.getItems().forEach(youtubeResponseVideo -> {
            Video video = mapVideoData(youtubeResponseVideo);

            playlist.getVideos().add(video);
        }
        );
        return playlist;
    }

    private Video mapVideoData(PlaylistItem youtubeResponseVideo) {
        Video video = new Video();

        video.setId(youtubeResponseVideo.getSnippet().getResourceId().getVideoId());
        video.setTitle(youtubeResponseVideo.getSnippet().getTitle());

        return video;
    }

}
