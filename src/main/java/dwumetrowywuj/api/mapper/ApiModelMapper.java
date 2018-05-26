package dwumetrowywuj.api.mapper;

import dwumetrowywuj.api.model.Playlist;
import dwumetrowywuj.api.model.Video;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ApiModelMapper {

    Playlist dtoToModel(dwumetrowywuj.youtube.model.dto.Playlist source);

    dwumetrowywuj.youtube.model.dto.Playlist modelToDto(Playlist source);

    Video dtoToModel(dwumetrowywuj.youtube.model.dto.Video source);

    dwumetrowywuj.youtube.model.dto.Video modelToDto(Video source);

}
