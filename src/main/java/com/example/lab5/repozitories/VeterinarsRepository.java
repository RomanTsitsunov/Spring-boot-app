package com.example.lab5.repozitories;

import com.example.lab5.models.Veterinars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinarsRepository extends JpaRepository<Veterinars, Integer> {
}
