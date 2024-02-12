package cara.secure_rest_api_with_jwt.repositories;

import cara.secure_rest_api_with_jwt.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    @Query(value = "select * from roles where id = 2", nativeQuery = true)
    Role findRole();
}
