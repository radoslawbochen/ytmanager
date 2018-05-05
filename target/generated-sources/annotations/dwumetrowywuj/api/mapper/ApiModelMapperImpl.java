package dwumetrowywuj.api.mapper;

import dwumetrowywuj.downloader.dto.Playlist;
import dwumetrowywuj.downloader.dto.Video;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-05-05T18:46:58+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 9 (Oracle Corporation)"
)
@Component
public class ApiModelMapperImpl implements ApiModelMapper {

    @Override
    public dwumetrowywuj.api.model.Playlist dtoToModel(Playlist source) {
        if ( source == null ) {
            return null;
        }

        dwumetrowywuj.api.model.Playlist playlist = new dwumetrowywuj.api.model.Playlist();

        playlist.setVideos( videoListToVideoList( source.getVideos() ) );

        return playlist;
    }

    @Override
    public Playlist modelToDto(dwumetrowywuj.api.model.Playlist source) {
        if ( source == null ) {
            return null;
        }

        Playlist playlist = new Playlist();

        playlist.setVideos( videoListToVideoList1( source.getVideos() ) );

        return playlist;
    }

    @Override
    public dwumetrowywuj.api.model.Video dtoToModel(Video source) {
        if ( source == null ) {
            return null;
        }

        dwumetrowywuj.api.model.Video video = new dwumetrowywuj.api.model.Video();

        video.setTitle( source.getTitle() );

        return video;
    }

    @Override
    public Video modelToDto(dwumetrowywuj.api.model.Video source) {
        if ( source == null ) {
            return null;
        }

        Video video = new Video();

        video.setTitle( source.getTitle() );

        return video;
    }

    protected List<dwumetrowywuj.api.model.Video> videoListToVideoList(List<Video> list) {
        if ( list == null ) {
            return null;
        }

        List<dwumetrowywuj.api.model.Video> list1 = new ArrayList<dwumetrowywuj.api.model.Video>( list.size() );
        for ( Video video : list ) {
            list1.add( dtoToModel( video ) );
        }

        return list1;
    }

    protected List<Video> videoListToVideoList1(List<dwumetrowywuj.api.model.Video> list) {
        if ( list == null ) {
            return null;
        }

        List<Video> list1 = new ArrayList<Video>( list.size() );
        for ( dwumetrowywuj.api.model.Video video : list ) {
            list1.add( modelToDto( video ) );
        }

        return list1;
    }
}
