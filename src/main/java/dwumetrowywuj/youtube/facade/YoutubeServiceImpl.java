package dwumetrowywuj.youtube.facade;

import dwumetrowywuj.youtube.model.dto.Playlist;
import dwumetrowywuj.youtube.model.mapper.YoutubeClientResponseMapper;
import dwumetrowywuj.youtube.client.YoutubeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YoutubeServiceImpl implements YoutubeService {

    @Autowired
    YoutubeClient youtubeClient;

    private YoutubeClientResponseMapper youtubeClientResponseMapper;

    public YoutubeServiceImpl() {
        youtubeClient = new YoutubeClient();
        youtubeClientResponseMapper = new YoutubeClientResponseMapper();
    }

    public Playlist getPlaylist(String link) {
        Playlist playlist = youtubeClientResponseMapper.map(youtubeClient.getPlaylistById(link));

        return playlist;
    }

}
