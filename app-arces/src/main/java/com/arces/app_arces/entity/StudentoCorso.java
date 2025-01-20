package com.arces.app_arces.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "studentocorso", schema = "app_arces")
//@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentoCorso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private long id;

    @Column(name = "interes")
    private boolean interes;

    @ManyToOne
    @JoinColumn(name = "corsoId", nullable = false)
    private Corso corso;

    @ManyToOne
    @JoinColumn(name = "studentId", nullable = false)
    private Student student;

    @Column(name = "frequent")
    private Boolean frequent;

    @Column(name = "conclus")
    private boolean conclus;
}
