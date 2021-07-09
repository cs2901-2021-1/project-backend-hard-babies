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
    private UserService usersService;


    @PostMapping
    public User postUser(@RequestBody UserDTO userDTO){
        return usersService.saveUser(userDTO);
    }

    @GetMapping("/all")
    public List<User> listAllUsers(){
        return  usersService.findAllUsers();
    }

    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable Long id) {
        return usersService.findOneById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable Long id){
        usersService.eraseUserById(id);
    }



}
