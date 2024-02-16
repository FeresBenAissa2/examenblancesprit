package com.example.benaissaferesexblanc.services.magasin;

import com.example.benaissaferesexblanc.dao.entites.Magasin;
import com.example.benaissaferesexblanc.dao.repositories.MagasinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MagasinService implements IMagasinService {
    MagasinRepository magasinRepository;
    @Override
    public Magasin ajouterMagasinEtPersonnels(Magasin magasin) {
        return magasinRepository.save(magasin);
    }
}
