package com.example.benaissaferesexblanc.services.client;

import com.example.benaissaferesexblanc.dao.entites.Client;
import com.example.benaissaferesexblanc.dao.entites.Magasin;
import com.example.benaissaferesexblanc.dao.repositories.ClientRepository;
import com.example.benaissaferesexblanc.dao.repositories.MagasinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService implements IClientService{
    ClientRepository clientRepository;
    MagasinRepository magasinRepository;
    @Override
    public Client ajouterClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public void affecterClientAMagasin(int idClient, int idMagasin) {
        Client client = clientRepository.findById(idClient).orElseThrow();
        Magasin magasin = magasinRepository.findById(idMagasin).orElseThrow();
        client.getMagasins().add(magasin);
        clientRepository.save(client);

    }
}
