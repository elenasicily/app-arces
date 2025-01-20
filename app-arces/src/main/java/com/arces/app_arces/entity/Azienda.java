package com.arces.app_arces.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "aziendes", schema = "app_arces")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Azienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idsettore", nullable = false)
    private Settore settore; // Relazione con l'entità Settore

    @Column(name = "name", nullable = false, length = 100)
    private String name;
}