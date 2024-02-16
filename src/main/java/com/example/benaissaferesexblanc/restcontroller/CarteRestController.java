package com.example.benaissaferesexblanc.restcontroller;

import com.example.benaissaferesexblanc.dao.entites.CarteFid;
import com.example.benaissaferesexblanc.dao.entites.Client;
import com.example.benaissaferesexblanc.services.carte.ICarteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("carte")
@AllArgsConstructor
public class CarteRestController {
    ICarteService iCarteService;
    @PostMapping("ajouterCarteEtAffecterClient")
    void ajouterCarteEtAffecterClient(@RequestBody CarteFid carteFid,@RequestParam long cin) {
        iCarteService.ajouterCarteEtAffecterClient(carteFid, cin);
    }
}
