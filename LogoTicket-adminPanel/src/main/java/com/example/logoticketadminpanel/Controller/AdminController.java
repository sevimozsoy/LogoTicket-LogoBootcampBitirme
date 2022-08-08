package com.example.logoticketadminpanel.Controller;

import com.example.logoticketadminpanel.Model.Ticket;
import com.example.logoticketadminpanel.Model.Voyage;
import com.example.logoticketadminpanel.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/voyages")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping
    private Voyage addVoyage(@RequestBody Voyage requestVoyage){
        return adminService.addVoyage(requestVoyage);
    }

    @PostMapping(value = "/cancel")
    private Voyage cancelVoyage(@RequestBody Voyage requestVoyage){
        return adminService.cancelVoyage(requestVoyage);
    }

    @PostMapping(value = "/search")
    private List<Voyage> listVoyages(@RequestBody Voyage requestVoyage) {
        return adminService.listVoyages(requestVoyage);
    }



}
