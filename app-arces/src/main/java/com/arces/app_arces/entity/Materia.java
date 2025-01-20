package com.arces.app_arces.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "materies", schema = "app_arces")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "titolo")
    private String titolo;

    @ManyToOne
    @JoinColumn(name = "idcorso")
    private Corso corso; // Relazione con l'entità Corso

    @ManyToOne
    @JoinColumn(name = "iddocente")
    private Docent docente; // Relazione con l'entità Docent
}
