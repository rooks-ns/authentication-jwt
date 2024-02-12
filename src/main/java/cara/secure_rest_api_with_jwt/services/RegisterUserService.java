package cara.secure_rest_api_with_jwt.services;

import cara.secure_rest_api_with_jwt.entities.Role;
import cara.secure_rest_api_with_jwt.entities.User;
import cara.secure_rest_api_with_jwt.repositories.RoleRepository;
import cara.secure_rest_api_with_jwt.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class RegisterUserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    public User createUser(String username, String email, String password, Set<Role> roles) {
        Set<Role> roleSet = new HashSet<>();
        roleSet.add(roleRepository.findRole());
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setRoles(roleSet);
        user.setPassword(passwordEncoder.encode(password));

        return userRepository.save(user);
    }
}
