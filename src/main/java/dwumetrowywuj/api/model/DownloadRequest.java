package dwumetrowywuj.api.model;

import java.util.List;

public class DownloadRequest {

    private List<String> videoIdList;

    private String directory;

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public List<String> getVideoIdList() {
        return videoIdList;
    }

    public void setVideoIdList(List<String> videoIdList) {
        this.videoIdList = videoIdList;
    }
}
