package com.arces.app_arces.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "settores", schema = "app_arces")
@NoArgsConstructor
@AllArgsConstructor

public class Settore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;


    @Column(name = "name")
    private String name;

    @Column(name = "idazienda")
    private Integer idAzienda;

    @OneToMany (mappedBy = "settore")
    private List<Corso> corso;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getIdAzienda() {
        return idAzienda;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdAzienda(Integer idAzienda) {
        this.idAzienda = idAzienda;
    }

    @Override
    public String toString() {
        return "( "+id + " "+name+" "+idAzienda+" )";
    }
}
