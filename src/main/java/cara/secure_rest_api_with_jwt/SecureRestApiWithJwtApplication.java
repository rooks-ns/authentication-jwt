package cara.secure_rest_api_with_jwt;

import cara.secure_rest_api_with_jwt.configurations.RSAKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RSAKeyProperties.class)
public class SecureRestApiWithJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecureRestApiWithJwtApplication.class, args);
    }

}
