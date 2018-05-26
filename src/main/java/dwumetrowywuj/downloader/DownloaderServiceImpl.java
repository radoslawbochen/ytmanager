package dwumetrowywuj.downloader;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DownloaderServiceImpl implements DownloaderService {

    @Override
    public void downloadAll(Collection<String> videoIds, String directory) {
        videoIds.forEach(videoId ->
                YoutubeDownloader.download(videoId, directory)
        );
    }



}
