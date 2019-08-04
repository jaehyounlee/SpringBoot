package com.jhyoun.BoardExample.RestController;

import com.jhyoun.BoardExample.model.ResponseVO;
import com.jhyoun.BoardExample.model.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public ResponseVO<?> getUsers(){

        ResponseVO<List<UserVO>> resp = new ResponseVO<>();

        List<UserVO> users = new ArrayList<>();
        users.add(new UserVO("Test", "01012341244"));
        users.add(new UserVO("Test2", "01029293939"));
        users.add(new UserVO("LJH", "01033973329"));

        resp.setResponse(users);

        return resp;
    }

    @GetMapping("/{id}")
    public ResponseVO<?> getUser(@PathVariable int id){

        ResponseVO<UserVO> resp = new ResponseVO<>();

        List<UserVO> users = new ArrayList<>();
        users.add(new UserVO("Test", "01012341244"));
        users.add(new UserVO("Test2", "01029293939"));
        users.add(new UserVO("LJH", "01033973329"));

        resp.setResponse(users.get(id));

        return resp;
    }
}
