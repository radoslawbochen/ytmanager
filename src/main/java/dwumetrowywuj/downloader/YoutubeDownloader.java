package dwumetrowywuj.downloader;

import com.github.axet.vget.VGet;

import java.io.File;
import java.net.URL;

class YoutubeDownloader {

    public static void download(String videoId, String directory) {
        try {
            VGet v = new VGet(new URL(videoId), new File(directory));
            v.download();
        } catch (Exception e) {
            throw new YoutubeDownloaderException(e.getMessage());
        }
    }

}
