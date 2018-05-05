package dwumetrowywuj.api.mapper;

import dwumetrowywuj.api.model.Playlist;
import dwumetrowywuj.api.model.Video;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ApiModelMapper {

    Playlist dtoToModel(dwumetrowywuj.downloader.dto.Playlist source);

    dwumetrowywuj.downloader.dto.Playlist modelToDto(Playlist source);

    Video dtoToModel(dwumetrowywuj.downloader.dto.Video source);

    dwumetrowywuj.downloader.dto.Video modelToDto(Video source);

}
