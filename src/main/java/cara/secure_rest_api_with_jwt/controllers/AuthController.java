package cara.secure_rest_api_with_jwt.controllers;

import cara.secure_rest_api_with_jwt.services.TokenService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class AuthController {

    private final TokenService tokenService;


    @PostMapping(value = "/token")
    public String token(Authentication authentication) {
        try {
            return tokenService.generateToken(authentication);
        }
        catch (AuthenticationException exception) {
            return exception.getMessage();
        }
    }
}
