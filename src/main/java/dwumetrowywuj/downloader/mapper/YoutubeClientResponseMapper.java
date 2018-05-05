package dwumetrowywuj.downloader.mapper;

import com.google.api.services.youtube.model.PlaylistItem;
import com.google.api.services.youtube.model.PlaylistItemListResponse;
import dwumetrowywuj.downloader.dto.Playlist;
import dwumetrowywuj.downloader.dto.Video;


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

        video.setTitle(youtubeResponseVideo.getSnippet().getTitle());

        return video;
    }

}
