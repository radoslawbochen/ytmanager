package dwumetrowywuj.youtube.facade;

import dwumetrowywuj.youtube.model.dto.Playlist;

public interface YoutubeService {

    Playlist getPlaylist(String link);

}
