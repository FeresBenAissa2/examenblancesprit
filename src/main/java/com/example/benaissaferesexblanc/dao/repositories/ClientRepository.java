package com.example.benaissaferesexblanc.dao.repositories;

import com.example.benaissaferesexblanc.dao.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
    Client findByCin(long Cin);
}
