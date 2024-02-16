package com.example.benaissaferesexblanc.restcontroller;

import com.example.benaissaferesexblanc.dao.entites.Client;
import com.example.benaissaferesexblanc.services.client.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("client")
@AllArgsConstructor
public class ClientRestController {
    IClientService iClientService;
    @PostMapping("addOrUpdate")
    Client addOrUpdate(@RequestBody Client c) {
        return iClientService.ajouterClient(c);
    }
    @PostMapping("affecterClientAMagasin")
    void affecterClientAMagasin(@RequestParam  int idClient,@RequestParam int idMagasin){
        iClientService.affecterClientAMagasin(idClient,idMagasin);
    };

}
