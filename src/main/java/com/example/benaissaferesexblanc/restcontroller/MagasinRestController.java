package com.example.benaissaferesexblanc.restcontroller;

import com.example.benaissaferesexblanc.dao.entites.Client;
import com.example.benaissaferesexblanc.dao.entites.Magasin;
import com.example.benaissaferesexblanc.services.magasin.IMagasinService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("magasin")
@AllArgsConstructor
public class MagasinRestController {
    IMagasinService iMagasinService;
    @PostMapping("addMagasinEtPersonnels")
    Magasin addMagasinEtPersonnel(@RequestBody Magasin m) {
        return iMagasinService.ajouterMagasinEtPersonnels(m);
    }
}
