package controller;

import business.UserService;
import data.dto.UserDTO;
import data.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping
    public User postUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @GetMapping("/all")
    public List<User> listAllUsers(){
        return  userService.findAllUsers();
    }


    @PutMapping("/update/{area}/{id}")
    public void updateArea(@PathVariable String area, @PathVariable Long id){
        userService.updateUser(area, id);
    }

    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.findOneById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable Long id){
        userService.eraseUserById(id) ;
    }




}
