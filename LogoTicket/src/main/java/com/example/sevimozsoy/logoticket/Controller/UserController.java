package com.example.sevimozsoy.logoticket.Controller;

import com.example.sevimozsoy.logoticket.Dto.TicketDto;
import com.example.sevimozsoy.logoticket.Dto.VoyagesDto;
import com.example.sevimozsoy.logoticket.Model.User;
import com.example.sevimozsoy.logoticket.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    public static class UserAndVoyage {
        public VoyagesDto voyagesDto;
        public User user;
    }

    @PostMapping
    private User signUp(@RequestBody User requestUser) throws NoSuchAlgorithmException {
        return userService.createUser(requestUser);
    }

    @PostMapping(value = "/loggedIn")
    public User isLoggedIn(@RequestBody User requestCustomer) throws NoSuchAlgorithmException {
        return userService.isLoggedIn(requestCustomer);
    }

    @PostMapping(value = "/search")
    public List<VoyagesDto> listVoyages(@RequestBody UserAndVoyage requestVoyages) {
        return userService.listVoyages(requestVoyages);
    }


    @PostMapping(value = "/payment")
    public TicketDto buyTicket(@RequestBody User requestUser) {
        return userService.buyTicket(requestUser);
    }


}
