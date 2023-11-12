package com.example.lab5.repozitories;

import com.example.lab5.models.SicknessHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SicknessHistoryRepository extends JpaRepository<SicknessHistory, Integer> {
}
