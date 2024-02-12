package cara.secure_rest_api_with_jwt.controllers;

import cara.secure_rest_api_with_jwt.entities.User;
import cara.secure_rest_api_with_jwt.models.RegisterUserDto;
import cara.secure_rest_api_with_jwt.services.RegisterUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private final RegisterUserService registerUserService;

    @PostMapping(value = "/users")
    public User registerUser(@RequestBody RegisterUserDto userDto) {

       return registerUserService.createUser(userDto.getUsername(),
                userDto.getEmail(),
                userDto.getPassword(),
                null
        );
    }
}
