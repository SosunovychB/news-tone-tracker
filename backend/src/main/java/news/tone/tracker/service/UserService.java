package news.tone.tracker.service;

import java.util.List;
import news.tone.tracker.dto.CreateUserRequestDto;
import news.tone.tracker.dto.UserDto;

public interface UserService {
    List<UserDto> getAllUsers();

    UserDto registerNewUser(CreateUserRequestDto createUserRequestDto);

    UserDto getUserById(long id);
}
