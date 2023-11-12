package com.example.lab5.repozitories;

import com.example.lab5.models.Owners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnersRepository extends JpaRepository<Owners, Integer> {
}
