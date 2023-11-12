package com.example.lab5.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "veterinars", schema = "Veterinaria")
public class Veterinars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_veterinar")
    private int idVeterinar;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "otchestvo")
    private String otchestvo;

    @OneToMany(mappedBy = "veterinar")
    private List<Pets> pets;


    public Veterinars() {
    }

    public Veterinars(String name, String surname, String otchestvo) {
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
    }

    public Veterinars(String name, String surname, String otchestvo, List<Pets> pets) {
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
        this.pets = pets;
    }

    public Veterinars(int idVeterinar, String name, String surname, String otchestvo) {
        this.idVeterinar = idVeterinar;
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
    }

    public Veterinars(int idVeterinar, String name, String surname, String otchestvo, List<Pets> pets) {
        this.idVeterinar = idVeterinar;
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
        this.pets = pets;
    }

    public int getIdVeterinar() {
        return idVeterinar;
    }

    public void setIdVeterinar(int idVeterinar) {
        this.idVeterinar = idVeterinar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public List<Pets> getPets() {
        return pets;
    }

    public void setPets(List<Pets> pets) {
        this.pets = pets;
    }
}
