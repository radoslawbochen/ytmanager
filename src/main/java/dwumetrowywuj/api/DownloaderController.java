package dwumetrowywuj.api;

import dwumetrowywuj.api.mapper.ApiMapper;
import dwumetrowywuj.api.model.DownloadRequest;
import dwumetrowywuj.downloader.DownloaderService;
import dwumetrowywuj.youtube.facade.YoutubeService;
import dwumetrowywuj.api.model.PlaylistRequest;
import dwumetrowywuj.api.model.PlaylistResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DownloaderController {

    @Autowired
    private DownloaderService downloaderService;

    @Autowired
    private ApiMapper apiMapper;

    @Autowired
    private YoutubeService youtubeService;

    @GetMapping("/playlist")
    public PlaylistResponse getPlaylist(@RequestParam String playlistId) {
        return apiMapper.map(youtubeService.getPlaylist(playlistId));
    }


    @PostMapping("/playlist/download")
    public void downloadPlaylist(@RequestBody DownloadRequest downloadRequest) {
        downloaderService.downloadAll(downloadRequest.getVideoIdList(), downloadRequest.getDirectory());
    }
}
