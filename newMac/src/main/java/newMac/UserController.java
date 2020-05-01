package newMac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//Access with localhost:8080/sun/...
@RestController
@RequestMapping(path = "/sun")
public class UserController {

    @Autowired
    public UserRepository userRepository;

//    To add new data into the database
    @PostMapping(path = "/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam Integer age){
        User n = new User();
        n.setName(name);
        n.setAge(age);
        userRepository.save(n);
        return "Saved";
    }

//    This shows all of the data in the database
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

}
