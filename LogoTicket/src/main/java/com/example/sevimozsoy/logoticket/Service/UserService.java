package com.example.sevimozsoy.logoticket.Service;

import com.example.sevimozsoy.logoticket.Controller.UserController;
import com.example.sevimozsoy.logoticket.Dto.TicketDto;
import com.example.sevimozsoy.logoticket.Dto.VoyagesDto;
import com.example.sevimozsoy.logoticket.Model.User;
import com.example.sevimozsoy.logoticket.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RabbitMQService rabbitMQService;
    public User createUser(User requestUser) throws NoSuchAlgorithmException {
        rabbitMQService.sendEmail(requestUser.getMail()); //Kullanıcı kayıt olduğunda atılan hoşgeldin maili.
        return userRepository.create(requestUser);
    }

    public User isLoggedIn(User requestCustomer) throws NoSuchAlgorithmException{
        return userRepository.loggedIn(requestCustomer);
    }

    public List<VoyagesDto> listVoyages(UserController.UserAndVoyage requestVoyages) {
        return userRepository.listVoyages(requestVoyages);
    }

    public TicketDto buyTicket(User requestUser) {
        return userRepository.buyTicket(requestUser);
    }


}
