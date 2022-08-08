package com.example.sevimozsoy.logoticket.Repository;

import com.example.sevimozsoy.logoticket.Client.AdminClient;
import com.example.sevimozsoy.logoticket.Client.PaymentClient;
import com.example.sevimozsoy.logoticket.Config.PasswordConfig;
import com.example.sevimozsoy.logoticket.Controller.UserController;
import com.example.sevimozsoy.logoticket.Dao.IUserDao;
import com.example.sevimozsoy.logoticket.Dto.TicketDto;
import com.example.sevimozsoy.logoticket.Dto.VoyagesDto;
import com.example.sevimozsoy.logoticket.Model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@Repository
@Slf4j
public class UserRepository {

    @Autowired
    private IUserDao database;

    @Autowired
    private PasswordConfig passwordConfig;

    @Autowired
    private AdminClient adminClient;

    @Autowired
    private PaymentClient paymentClient;

    public User create(User requestUser) throws NoSuchAlgorithmException {
        requestUser.setPassword(passwordConfig.obtainSHA(requestUser.getPassword()));
        database.save(requestUser);
        return requestUser;
    }

    public User loggedIn(User requestUser) throws NoSuchAlgorithmException {
        return database.findByUsernameAndPassword(requestUser.getUsername(), passwordConfig.obtainSHA(requestUser.getPassword()));
    }

    public List<VoyagesDto> listVoyages(UserController.UserAndVoyage requestVoyages) {
        log.info("Feign client is working now!");
        User searchedUser = database.findByUsername(requestVoyages.user.getUsername());
        searchedUser.getVoyagesDto().add(requestVoyages.voyagesDto);
        database.save(searchedUser);
        return adminClient.listVoyages(requestVoyages.voyagesDto);
    }

    public TicketDto buyTicket(User requestUser) {
        return paymentClient.createPayment(requestUser);
    }
}
