package com.example.lab5.services;

import com.example.lab5.models.Pets;
import com.example.lab5.models.SicknessHistory;
import com.example.lab5.repozitories.PetsRepository;
import com.example.lab5.repozitories.SicknessHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class SicknessHistoryService {
    private final SicknessHistoryRepository sicknessHistoryRepository;

    @Autowired
    public SicknessHistoryService(SicknessHistoryRepository sicknessHistoryRepository) {
        this.sicknessHistoryRepository = sicknessHistoryRepository;
    }

    public List<SicknessHistory> getAll() {
        return sicknessHistoryRepository.findAll();
    }

    public SicknessHistory getById(int id) {
        return sicknessHistoryRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(SicknessHistory sicknessHistory) {
        sicknessHistoryRepository.save(sicknessHistory);
    }
}
