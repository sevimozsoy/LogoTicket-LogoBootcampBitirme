package com.example.logoticketadminpanel.Dao;

import com.example.logoticketadminpanel.Model.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;


public interface IVoyageDao extends JpaRepository<Voyage, String> {
    Optional<Voyage> findById(Long id);

    Voyage findByTransportTypeAndDateAndArrival(Enum transportType, LocalDate date, String arrival);

}
