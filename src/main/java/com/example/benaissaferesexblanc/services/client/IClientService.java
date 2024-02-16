package com.example.benaissaferesexblanc.services.client;

import com.example.benaissaferesexblanc.dao.entites.Client;

public interface IClientService {
    Client ajouterClient(Client c);
    void affecterClientAMagasin(int idClient,int idMagasin);
}
