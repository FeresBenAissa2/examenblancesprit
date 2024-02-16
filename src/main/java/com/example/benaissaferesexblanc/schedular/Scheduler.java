package com.example.benaissaferesexblanc.schedular;


import com.example.benaissaferesexblanc.dao.entites.CarteFid;
import com.example.benaissaferesexblanc.dao.entites.Client;
import com.example.benaissaferesexblanc.dao.entites.Magasin;
import com.example.benaissaferesexblanc.dao.repositories.MagasinRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Set;

@Component
@AllArgsConstructor
@Slf4j
public class Scheduler {
    MagasinRepository magasinRepository;

    @Scheduled(cron = "0 0 8 * * *")
    public void totalSolde(){
        double somme = 0.0;
        List<Magasin> listMagasin = magasinRepository.findAll();
        for (Magasin magasin : listMagasin) {
            List<Client> clients = magasin.getClients();
            for (Client client : clients) {
                somme += client.getCarteFid().getSolde();
            }
            log.info("Magasin => Bonus Solde " + somme);
            somme=0.0;
        }
    }

}
