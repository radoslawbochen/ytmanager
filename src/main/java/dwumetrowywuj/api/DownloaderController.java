package dwumetrowywuj.api;

import dwumetrowywuj.api.mapper.ApiMapper;
import dwumetrowywuj.downloader.DownloaderServiceImpl;
import dwumetrowywuj.api.model.PlaylistRequest;
import dwumetrowywuj.api.model.PlaylistResponse;
import dwumetrowywuj.youtube.client.YoutubeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DownloaderController {

    @Autowired
    private ApiMapper apiMapper;

    @Autowired
    private DownloaderServiceImpl downloaderService;

    @Autowired
    private YoutubeClient client;

    @PostMapping("/download")
    public PlaylistResponse downloadPlaylist(@RequestBody PlaylistRequest playlistRequest) {
        PlaylistResponse response =
                apiMapper.map(downloaderService.getPlaylist(playlistRequest.getPlaylistId()));

        return response;
    }

}
