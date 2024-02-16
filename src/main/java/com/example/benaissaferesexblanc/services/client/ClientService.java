package com.example.benaissaferesexblanc.services.client;

import com.example.benaissaferesexblanc.dao.entites.Client;
import com.example.benaissaferesexblanc.dao.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService implements IClientService{
    ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client c) {
        return clientRepository.save(c);
    }
}
