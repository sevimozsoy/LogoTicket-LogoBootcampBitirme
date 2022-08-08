package com.example.logoticketadminpanel.Service;

import com.example.logoticketadminpanel.Model.Ticket;
import com.example.logoticketadminpanel.Model.Voyage;
import com.example.logoticketadminpanel.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Voyage addVoyage(Voyage requestVoyage) {
        return adminRepository.addVoyage(requestVoyage);
    }

    public Voyage cancelVoyage(Voyage requestVoyage) {
        return adminRepository.cancelVoyage(requestVoyage);
    }

    public List<Voyage> listVoyages(Voyage requestVoyage) {
        return adminRepository.listVoyages(requestVoyage);
    }



}
