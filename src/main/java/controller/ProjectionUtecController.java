package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


import java.security.Principal;

@RestController
public class ProjectionUtecController {
    static final Logger logger = Logger.getLogger(ProjectionUtecController.class.getName());

    @GetMapping
    public String welcome() {
        return "Welcome!";
    }

    @GetMapping("/prueba")
    public Principal userTesting(Principal principal) {
        var output = "username: " + principal.getName();
        logger.info(output);
        return principal;
    }


}
