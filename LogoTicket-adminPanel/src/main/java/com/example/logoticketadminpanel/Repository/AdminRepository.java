package com.example.logoticketadminpanel.Repository;

import com.example.logoticketadminpanel.Dao.IVoyageDao;
import com.example.logoticketadminpanel.Model.Ticket;
import com.example.logoticketadminpanel.Model.Voyage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Slf4j
public class AdminRepository {

    @Autowired
    private IVoyageDao database;

    public Voyage addVoyage(Voyage requestVoyage) {
        return database.save(requestVoyage);
    }

    public Voyage cancelVoyage(Voyage requestVoyage) {
        Voyage foundVoyage = database.findById(requestVoyage.getId()).orElse(null);
        if (foundVoyage == null) {
            throw new NullPointerException();
        } else {
            foundVoyage.setActive(false);
            database.save(foundVoyage);
        }
        return foundVoyage;
    }

    public List<Voyage> listVoyages(Voyage requestVoyage) {
        List<Voyage> allVoyage = database.findAll();
        List<Voyage> activeVoyage = new ArrayList<>();
        allVoyage.forEach(voyage -> {
            if (voyage.getActive() && voyage.getDate().equals(requestVoyage.getDate()) && voyage.getArrival().equals(requestVoyage.getArrival())
            && voyage.getDeparture().equals(requestVoyage.getDeparture()) && voyage.getTransportType().equals(requestVoyage.getTransportType()))
            {
                activeVoyage.add(voyage);
            }
        });
        return activeVoyage;
    }

}
