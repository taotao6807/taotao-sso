package pub.taotao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pub.taotao.dto.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public List<User> getUsers(){
        List<User> list = new ArrayList<>();
        list.add(new User());
        list.add(new User());
        return list;
    }

}
