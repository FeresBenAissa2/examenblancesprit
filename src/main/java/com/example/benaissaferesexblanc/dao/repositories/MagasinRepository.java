package com.example.benaissaferesexblanc.dao.repositories;

import com.example.benaissaferesexblanc.dao.entites.Magasin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MagasinRepository extends JpaRepository<Magasin,Integer> {
    Magasin findMagasinByNomMagasin(String nomMagasin);
}
