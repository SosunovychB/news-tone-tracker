package news.tone.tracker.service;

import java.util.List;
import news.tone.tracker.dto.UserDto;
import news.tone.tracker.dto.registration.CreateUserRequestDto;

public interface UserService {
    UserDto registerNewUser(CreateUserRequestDto createUserRequestDto);

    UserDto getUserByEmail(String email);

    List<UserDto> getAllUsers();

    UserDto getUserById(long id);
}
