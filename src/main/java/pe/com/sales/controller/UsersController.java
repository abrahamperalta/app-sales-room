package pe.com.sales.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.sales.mapper.UserRequest;
import pe.com.sales.mapper.UserResponse;
import pe.com.sales.mapper.dto.User2Response;
import pe.com.sales.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/demo")
@AllArgsConstructor
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserResponse registrar(@RequestBody UserRequest userRequest) throws Exception {
        return userService.saveUser(userRequest);
    }

    @GetMapping(name = "/all")
    public List<User2Response> getAllUser() throws Exception{
        return   userService.list2();
    }




}
