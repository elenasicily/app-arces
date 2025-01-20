package com.arces.app_arces.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "docentcorso", schema = "app_arces")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class DocentCorso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "iddocent", nullable = false)
    private Docent docent; // Relazione con l'entità Docent

    @ManyToOne
    @JoinColumn(name = "idcorso", nullable = false)
    private Corso corso; // Relazione con l'entità Corso
}