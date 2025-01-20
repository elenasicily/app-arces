package com.arces.app_arces.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "students", schema = "app_arces")
//@Data
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;


    @Column(name = "lastname")
    private String lastName;

    @Column(name = "firstname")
    private String firstName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @OneToMany (mappedBy = "student")
    private List<StudentoCorso> studentocorsoList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /*public List<StudentoCorso> getStudentocorsoList() {
        return studentocorsoList;
    }

    public void setStudentocorsoList(List<StudentoCorso> studentocorsoList) {
        this.studentocorsoList = studentocorsoList;
    }
    */

    @Override
    public String toString(){
      return "( "+id + " "+lastName+" "+firstName+" "+birthday+" "
              +address+" "+email+" "+telefono+" )";
    }
}



