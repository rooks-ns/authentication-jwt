package cara.secure_rest_api_with_jwt.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserDto {

    private String username;
    private String email;
    private String password;
}
