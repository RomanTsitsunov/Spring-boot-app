package com.example.lab5.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "owners", schema = "Veterinaria")
public class Owners {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_owner")
    private int idOwner;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "otchestvo")
    private String otchestvo;

    @ManyToMany
    @JoinTable(
            name = "Owner_Pet",
            schema = "Veterinaria",
            joinColumns = @JoinColumn(name = "id_owner"),
            inverseJoinColumns = @JoinColumn(name = "id_pet")
    )
    private List<Pets> pets;



    public Owners() {
    }

    public Owners(String name, String surname, String otchestvo) {
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
    }

    public Owners(String name, String surname, String otchestvo, List<Pets> pets) {
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
        this.pets = pets;
    }

    public Owners(int idOwner, String name, String surname, String otchestvo) {
        this.idOwner = idOwner;
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
    }

    public Owners(int idOwner, String name, String surname, String otchestvo, List<Pets> pets) {
        this.idOwner = idOwner;
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
        this.pets = pets;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
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
