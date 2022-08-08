package com.sevimozsoy.logoticketasyncemailsms.Dao;

import com.sevimozsoy.logoticketasyncemailsms.Model.Mail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDatabase extends MongoRepository<Mail,String> {


}
