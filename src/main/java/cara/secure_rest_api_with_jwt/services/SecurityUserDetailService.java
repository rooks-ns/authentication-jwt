package cara.secure_rest_api_with_jwt.services;

import cara.secure_rest_api_with_jwt.entities.User;
import cara.secure_rest_api_with_jwt.entities.security.SecurityUser;
import cara.secure_rest_api_with_jwt.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class SecurityUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUser(username);

        return user.map(SecurityUser::new).orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
