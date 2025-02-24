package news.tone.tracker.mapper;

import news.tone.tracker.config.MapperConfig;
import news.tone.tracker.dto.CreateUserRequestDto;
import news.tone.tracker.dto.UserDto;
import news.tone.tracker.model.User;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface UserMapper {

    UserDto userToDto(User user);

    User createUserRequestToUser(CreateUserRequestDto createUserRequestDto);
}
