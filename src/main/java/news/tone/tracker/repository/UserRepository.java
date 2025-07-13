package news.tone.tracker.repository;

import java.util.Optional;
import news.tone.tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("FROM User u LEFT JOIN FETCH u.roles WHERE u.email = :email")
    Optional<User> findUserByEmail(String email);
}
