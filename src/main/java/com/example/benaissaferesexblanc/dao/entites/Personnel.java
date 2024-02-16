package com.example.benaissaferesexblanc.dao.entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPersonnel;
    String nomPersonnel;
    String prenomPersonnel;
    LocalDate dateNaissanceP;

    TypePersonnel typePersonnel;
    @OneToOne
    Magasin magasin;

    @ManyToOne
    Magasin magasinC;



}
