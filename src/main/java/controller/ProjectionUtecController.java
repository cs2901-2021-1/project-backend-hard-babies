package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.json.JSONArray;

import java.security.Principal;

@RestController
public class ProjectionUtecController {

    @GetMapping
    public String welcome(){
        return "Welcome!";
    }

    @GetMapping("/prueba")
    public  Principal user_(Principal principal){
        System.out.println("username: "+ principal.getName());
        return  principal;
    }

    @GetMapping("/prueba-user")
    public  Principal prueba(Principal principal) throws JsonProcessingException, JSONException {
        ObjectMapper mapper = new ObjectMapper();
        String user = mapper.writeValueAsString(principal);
        var json = new JSONObject(user);
        json = json.getJSONArray("authorities").getJSONObject(0).getJSONObject("attributes");
        var firstName  = json.get("given_name");
        var lastName  = json.get("family_name");
        var email  = json.get("email");
        var imageUrl  = json.get("picture");
        return  principal;
    }
}
