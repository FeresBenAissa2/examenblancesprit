package com.example.benaissaferesexblanc.services.carte;

import com.example.benaissaferesexblanc.dao.entites.CarteFid;
import com.example.benaissaferesexblanc.dao.entites.Client;
import com.example.benaissaferesexblanc.dao.repositories.CarteFidRepository;
import com.example.benaissaferesexblanc.dao.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarteService implements ICarteService{
    ClientRepository clientRepository;
    CarteFidRepository carteFidRepository;
    @Override
    public void ajouterCarteEtAffecterClient(CarteFid carteFid, long cin) {
        CarteFid carte = carteFidRepository.save(carteFid);
        Client client = clientRepository.findByCin(cin);
        client.setCarteFid(carte);
        clientRepository.save(client);
    }
}