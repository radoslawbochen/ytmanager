package dwumetrowywuj.downloader;

import java.util.Collection;

public interface DownloaderService {

     void downloadAll(Collection<String> videoIds, String directory);

}
