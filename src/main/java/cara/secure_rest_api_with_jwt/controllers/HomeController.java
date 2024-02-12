package cara.secure_rest_api_with_jwt.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {

    @GetMapping(value = "/user")
    @PreAuthorize(value = "hasAnyAuthority('SCOPE_ADMIN','SCOPE_USER')")
    public String home() {
        return "this is first project towards spring security";
    }

    @GetMapping(value = "/admin")
    @PreAuthorize(value = "hasAuthority('SCOPE_ADMIN')")
    public String adminHome() {
        return "accessed by user with role admin only";
    }
}
