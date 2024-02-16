package com.example.benaissaferesexblanc.services.carte;

import com.example.benaissaferesexblanc.dao.entites.CarteFid;

public interface ICarteService {
    void ajouterCarteEtAffecterClient(CarteFid carteFid,long cin);
}
