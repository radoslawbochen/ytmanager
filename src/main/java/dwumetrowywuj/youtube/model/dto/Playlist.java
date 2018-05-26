package dwumetrowywuj.youtube.model.dto;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Video> videos;

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
