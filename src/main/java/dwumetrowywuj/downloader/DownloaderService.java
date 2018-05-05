package dwumetrowywuj.downloader;


import dwumetrowywuj.downloader.dto.Playlist;

public interface DownloaderService {

    public Playlist getPlaylist(String link);

}
