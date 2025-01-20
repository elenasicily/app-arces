package com.arces.app_arces.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

import java.time.LocalDate;

@Entity
@Table(name = "corses", schema = "app_arces")
//@Data
@NoArgsConstructor
@AllArgsConstructor

public class Corso {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "databegin", nullable = false)
    private LocalDate dataBegin;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "dataend", nullable = false)
    private LocalDate dataEnd;

    @Column(name = "titolo")
    private String titolo;

    //@Column(name = "idsettore")
    //private Long idSettore;

    @OneToMany(mappedBy = "corso")
    private List<StudentoCorso> studentocorsoList;

    @ManyToOne
    @JoinColumn(name = "idsettore", nullable = false)
    private Settore settore;

    @JsonFormat(pattern = "yyyy-MM-dd")
    public LocalDate getDataBegin() {
        return dataBegin;
    }

    @JsonFormat(pattern = "yyyy-MM-dd")
    public LocalDate getDataEnd() {
        return dataEnd;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDataBegin(LocalDate dataBegin) {
        this.dataBegin = dataBegin;
    }

    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDataEnd(LocalDate dataEnd) {
        this.dataEnd = dataEnd;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Settore getSettore() {
        return settore;
    }

    public void setSettore(Settore settore) {
        this.settore = settore;
    }

    @Override
    public String toString(){
        return "( "+id + " "+dataBegin+" "+dataEnd+" "+titolo+" "
                +settore+" )";
    }

}
