package pub.taotao.controller;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.*;
import pub.taotao.dto.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    @JsonView(User.SimpleView.class)
    public List<User> list(String username){
        System.out.println(username);
        List<User> list = new ArrayList<>();
        list.add(new User());
        list.add(new User());
        list.add(new User());
        return list;
    }

    @GetMapping("/{id:\\d+}")
    @JsonView(User.DetailView.class)
    public User detail(@PathVariable Long id){
        System.out.println(id);
        return new User();
    }

    @PostMapping
    public void add(@RequestBody User user){
        System.out.println(user);
    }

}
