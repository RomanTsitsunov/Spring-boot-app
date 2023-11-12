package com.example.lab5.models;

import jakarta.persistence.*;

@Entity
@Table(name = "sickness history", schema = "Veterinaria")
public class SicknessHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sick")
    private int idSick;

    @Column(name = "sickname")
    private String sickname;

    @Column(name = "detectdate")
    private String detectDate;

    @OneToOne(mappedBy = "sh")
    private Pets pets;

    public SicknessHistory() {
    }

    public SicknessHistory(String sickname, String detectDate, Pets pets) {
        this.sickname = sickname;
        this.detectDate = detectDate;
        this.pets = pets;
    }

    public SicknessHistory(String sickname, String detectDate) {
        this.sickname = sickname;
        this.detectDate = detectDate;
    }

    public SicknessHistory(int idSick, String sickname, String detectDate) {
        this.idSick = idSick;
        this.sickname = sickname;
        this.detectDate = detectDate;
    }

    public SicknessHistory(int idSick, String sickname, String detectDate, Pets pets) {
        this.idSick = idSick;
        this.sickname = sickname;
        this.detectDate = detectDate;
        this.pets = pets;
    }

    public int getIdSick() {
        return idSick;
    }

    public void setIdSick(int idSick) {
        this.idSick = idSick;
    }

    public String getSickname() {
        return sickname;
    }

    public void setSickname(String sickname) {
        this.sickname = sickname;
    }

    public String getDetectDate() {
        return detectDate;
    }

    public void setDetectDate(String detectDate) {
        this.detectDate = detectDate;
    }

    public Pets getPets() {
        return pets;
    }

    public void setPets(Pets pets) {
        this.pets = pets;
    }
}
