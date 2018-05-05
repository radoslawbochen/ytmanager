package dwumetrowywuj.youtube.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    List<Video> videos;

    public List<Video> getVideos() {
        if (videos == null) {
            videos = new ArrayList<>();
        }
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}
