package com.example.benaissaferesexblanc.schedular;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Component
@AllArgsConstructor
@Slf4j
public class Scheduler {
//    UtilistateurService utilistateurService;
@Scheduled(cron = "0 * * * * *")
//    void service1() {
//        iChambreService.listeChambresParBloc();
//    }
//
//    @Scheduled(fixedRate = 30000)
//// 5 minutes = 300 secondes = 300000 millisecondes
//    void service2() {
//        iChambreService.pourcentageChambreParTypeChambre();
//    }
//
//    @Scheduled(fixedRate = 30000)
//    void service3() {
//        iChambreService.nbPlacesDisponibleParChambreAnneeEnCours();
//    }
//    @Scheduled(cron = "* * * 30 06 *")
//    void service4() {
//        iReservationService.annulerReservations();
//    }
    @Scheduled(cron = "0/5 * * * * *" )
    public String afficher() {
//        List<Utilisateur> utilisateurs= utilistateurService.getAllLecteurs();
//        String userString = "\n List des Lecteurs : \n ";
//        for(Utilisateur u : utilisateurs){
//           if(calculateDayDifference(u.getDateFinAbonnement(),LocalDate.now())<2)
//               userString+=u.getNom()+" "+u.getPrenom()+"\n";
//        }
//        log.info(userString);
//        return userString;
        return null;
    }
    public static long calculateDayDifference(LocalDate date1, LocalDate date2) {
        return ChronoUnit.DAYS.between(date1, date2);
    }
}
