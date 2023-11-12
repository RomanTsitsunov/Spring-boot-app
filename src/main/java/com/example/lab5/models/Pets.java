package com.example.lab5.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pets", schema = "Veterinaria")
public class Pets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet")
    private int idPet;

    //@Column(name = "id_veterinar")
    //private int idVeterinar;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_veterinar")
    private Veterinars veterinar;

    @OneToOne
    @JoinColumn(name = "id_sick")
    private SicknessHistory sh;

    @ManyToMany(mappedBy = "pets")
    private List<Owners> owners;

    public Pets() {
    }

    public Pets(String name, Veterinars veterinars, SicknessHistory sh) {
        this.name = name;
        this.veterinar = veterinars;
        this.sh = sh;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Veterinars getVeterinars() {
        return veterinar;
    }

    public void setVeterinars(Veterinars veterinars) {
        this.veterinar = veterinars;
    }

    public SicknessHistory getSh() {
        return sh;
    }

    public void setSh(SicknessHistory sh) {
        this.sh = sh;
    }
}
