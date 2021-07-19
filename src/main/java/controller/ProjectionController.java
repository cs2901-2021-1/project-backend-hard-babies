package controller;

import business.ParsingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/projection")
public class ProjectionController {
    private static final String JSON_URL = "http://localhost:8000/enrollmentProjection/";

    @Autowired
    private ParsingService parsingService;


    @GetMapping
    @PreAuthorize("hasRole('USER')")
    public Object getProjectionById()  {
       var result =  parsingService.parse(JSON_URL);
       return result;
    }

}
