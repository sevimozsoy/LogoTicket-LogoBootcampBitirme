package com.example.logoticketpayment.Repository;

import com.example.logoticketpayment.Dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories("com.example.logoticketpayment1.Repository.PaymentRepository")
public interface PaymentRepository extends JpaRepository<UserDto, String> {


}
