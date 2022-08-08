package com.example.sevimozsoy.logoticket.Client;
import com.example.sevimozsoy.logoticket.Dto.TicketDto;
import com.example.sevimozsoy.logoticket.Dto.VoyagesDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@FeignClient(url = "${admin.url}", value = "LogoTicket-adminPanel")
public interface AdminClient {


    @PostMapping(value = "/voyages/search")
    List<VoyagesDto> listVoyages(VoyagesDto requestVoyages);

    @PostMapping(value = "/voyages/payment")
    void saveBoughtTicket(@RequestBody TicketDto requestTicket);
}
