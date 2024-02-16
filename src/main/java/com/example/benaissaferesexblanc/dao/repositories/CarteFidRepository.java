package com.example.benaissaferesexblanc.dao.repositories;

import com.example.benaissaferesexblanc.dao.entites.CarteFid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteFidRepository extends JpaRepository<CarteFid,Integer> {
    CarteFid findByNumeroCarte(long numeroCarte);
}
