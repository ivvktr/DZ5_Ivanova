package com.example.DZ5_Ivanova;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping
    User getUser() {
        return new User("usr1", "pwd1", "usr1@email.ru");
    }

    @PostMapping
    UserPost postUser(@RequestBody User user){
        LocalDateTime localDate = LocalDateTime.now();
        UserPost userPost = new UserPost(user.getLogin(), localDate.toString());
        return userPost;
    }
}
