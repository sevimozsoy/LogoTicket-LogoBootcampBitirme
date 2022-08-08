package com.sevimozsoy.logoticketasyncemailsms.Service;

import com.sevimozsoy.logoticketasyncemailsms.Dao.IDatabase;
import com.sevimozsoy.logoticketasyncemailsms.Model.Mail;
import com.sevimozsoy.logoticketasyncemailsms.Model.Sms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    @Autowired
    private IDatabase database;

    public void saveMail(Mail mail){
        database.save(mail);
        System.out.println("Mail başarı ile kaydedildi");
    }

//    public void save(Sms sms){
//        database.save(sms.getClass());
//        System.out.println("Sms başarı ile kaydedildi");
//    }
}
