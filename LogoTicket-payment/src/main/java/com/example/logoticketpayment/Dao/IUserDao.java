package com.example.logoticketpayment.Dao;

import com.example.logoticketpayment.Dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends JpaRepository<UserDto, String> {
    UserDto findByUsernameAndPassword(String username, String password);
    UserDto findByUsername(String username);
}
