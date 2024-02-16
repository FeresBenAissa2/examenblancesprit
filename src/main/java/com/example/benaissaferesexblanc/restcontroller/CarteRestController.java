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
    void ajouterCarteEtAffecterClient(@RequestBody CarteFid carteFid, @RequestParam long cin) {
        iCarteService.ajouterCarteEtAffecterClient(carteFid, cin);
    }

    @PostMapping("effectuerOperation")
    long effectuerOperation(@RequestParam String typeOperation, @RequestParam long numCarte,@RequestParam  int montant) {
        return iCarteService.effectuerOperation(typeOperation, numCarte, montant);
    }
}
