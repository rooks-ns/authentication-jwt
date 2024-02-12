package cara.secure_rest_api_with_jwt.repositories;

import cara.secure_rest_api_with_jwt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "select * from users where name = ?1", nativeQuery = true)
    Optional<User> findUser(String username);
}
