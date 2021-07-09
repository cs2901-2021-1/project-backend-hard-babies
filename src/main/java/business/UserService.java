package business;

import data.dto.UserDTO;
import data.entities.User;
import data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    private User getUser(UserDTO input) {
        var user = new User();
        user.setEmail(input.getEmail());
        user.setArea(input.getArea());
        user.setFirstName(input.getFirstName());
        user.setLastName(input.getLastName());
        return user;
    }

    public User saveUser(UserDTO userDTO) {
        try {
            var user =  getUser(userDTO);
            return userRepository.save(user);
        } catch (HttpClientErrorException exception) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Invalid body", exception);
        }
    }

    public User findOneById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) return userOptional.get();
        else throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "User with id " + id + " doesn't exist!");
    }

    public void eraseUserById(Long id){
        userRepository.deleteById(id);
    }

}
