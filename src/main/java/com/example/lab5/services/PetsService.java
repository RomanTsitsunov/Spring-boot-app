package com.example.lab5.services;

import com.example.lab5.models.Pets;
import com.example.lab5.models.SicknessHistory;
import com.example.lab5.models.Veterinars;
import com.example.lab5.repozitories.PetsRepository;
import com.example.lab5.repozitories.SicknessHistoryRepository;
import com.example.lab5.repozitories.VeterinarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class PetsService {
    private final PetsRepository petsRepository;
    private final VeterinarsRepository veterinarsRepository;
    private final SicknessHistoryRepository sicknessHistoryRepository;

    @Autowired
    public PetsService(PetsRepository petsRepository, VeterinarsRepository veterinarsRepository,
                       SicknessHistoryRepository sicknessHistoryRepository) {
        this.petsRepository = petsRepository;
        this.veterinarsRepository = veterinarsRepository;
        this.sicknessHistoryRepository = sicknessHistoryRepository;
    }

    public List<Pets> getAll() {
        return petsRepository.findAll();
    }

    public Pets getById(int id) {
        return petsRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(String name, int idVeterinar, int idSick) {
        Veterinars veterinars = veterinarsRepository.findById(idVeterinar).orElse(null);
        SicknessHistory sicknessHistory = sicknessHistoryRepository.findById(idSick).orElse(null);
        Pets pets = new Pets(name,veterinars,sicknessHistory);
        petsRepository.save(pets);
    }
}
