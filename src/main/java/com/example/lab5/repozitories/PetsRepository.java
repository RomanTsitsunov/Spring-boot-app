package com.example.lab5.repozitories;

import com.example.lab5.models.Pets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetsRepository extends JpaRepository<Pets, Integer> {
}
