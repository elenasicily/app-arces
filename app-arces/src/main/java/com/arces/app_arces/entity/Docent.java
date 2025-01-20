package com.arces.app_arces.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "docents", schema = "app_arces")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Docent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "lastname", nullable = false, length = 60)
    private String lastName;


 //   @ManyToOne
  //  @JoinColumn(name = "idmateria")
     // Relazione opzionale con l'entità Materia
}
