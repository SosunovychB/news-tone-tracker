package news.tone.tracker.service;

import java.util.List;
import news.tone.tracker.dto.UserDto;
import news.tone.tracker.dto.registration.CreateUserRequestDto;

public interface UserService {
    List<UserDto> getAllUsers();

    UserDto registerNewUser(CreateUserRequestDto createUserRequestDto);

    UserDto getUserById(long id);
}
