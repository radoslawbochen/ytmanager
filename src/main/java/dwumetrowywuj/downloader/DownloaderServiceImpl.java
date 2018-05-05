package dwumetrowywuj.downloader;

import dwumetrowywuj.downloader.dto.Playlist;
import dwumetrowywuj.downloader.mapper.YoutubeClientResponseMapper;
import dwumetrowywuj.youtube.client.YoutubeClient;
import org.springframework.stereotype.Service;

@Service
public class DownloaderServiceImpl implements DownloaderService {

    private YoutubeClient youtubeClient;

    private YoutubeClientResponseMapper youtubeClientResponseMapper;

    public DownloaderServiceImpl() {
        youtubeClient = new YoutubeClient();
        youtubeClientResponseMapper = new YoutubeClientResponseMapper();
    }

    public Playlist getPlaylist(String link) {
        Playlist playlist = youtubeClientResponseMapper.map(youtubeClient.getPlaylistById(link));

        return playlist;
    }

}
