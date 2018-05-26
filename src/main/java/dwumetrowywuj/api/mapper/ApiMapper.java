package dwumetrowywuj.api.mapper;

import dwumetrowywuj.api.model.PlaylistResponse;
import dwumetrowywuj.youtube.model.dto.Playlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApiMapper {

    @Autowired
    private ApiModelMapper apiModelMapper;

    public PlaylistResponse map(Playlist playlist) {
        PlaylistResponse response = new PlaylistResponse();

        response.setPlaylist(apiModelMapper.dtoToModel(playlist));

        return response;
    }

}
