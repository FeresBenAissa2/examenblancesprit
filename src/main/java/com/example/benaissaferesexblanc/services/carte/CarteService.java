package com.example.benaissaferesexblanc.services.carte;

import com.example.benaissaferesexblanc.dao.entites.CarteFid;
import com.example.benaissaferesexblanc.dao.entites.Client;
import com.example.benaissaferesexblanc.dao.repositories.CarteFidRepository;
import com.example.benaissaferesexblanc.dao.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class CarteService implements ICarteService{
    ClientRepository clientRepository;
    CarteFidRepository carteFidRepository;
    @Override
    public void ajouterCarteEtAffecterClient(CarteFid carteFid, long cin) {
        carteFid.setSolde(0);
        carteFid.setDateCreation(LocalDate.now());
        CarteFid carte = carteFidRepository.save(carteFid);
        Client client = clientRepository.findByCin(cin);
        client.setCarteFid(carte);
        clientRepository.save(client);
    }

    @Override
    public long effectuerOperation(String typeOperation, long numCarte, int montant) {
        CarteFid carteFid = carteFidRepository.findByNumeroCarte(numCarte);
        long ancienSolde = carteFid.getSolde();
        long nouveauMontant=0;
        if(typeOperation.equals("+")){
             nouveauMontant = ancienSolde+montant;
            carteFid.setSolde(nouveauMontant);
            carteFidRepository.save(carteFid);
            return nouveauMontant;
        }else if (typeOperation.equals("-")){
             nouveauMontant = ancienSolde-montant;
            carteFid.setSolde(nouveauMontant);
            carteFidRepository.save(carteFid);
            return nouveauMontant;
        }
        return nouveauMontant;
    }
}
