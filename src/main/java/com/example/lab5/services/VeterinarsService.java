package com.example.lab5.services;

import com.example.lab5.models.Pets;
import com.example.lab5.models.Veterinars;
import com.example.lab5.repozitories.PetsRepository;
import com.example.lab5.repozitories.VeterinarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class VeterinarsService {
    private final VeterinarsRepository veterinarsRepository;

    @Autowired
    public VeterinarsService(VeterinarsRepository veterinarsRepository) {
        this.veterinarsRepository = veterinarsRepository;
    }

    public List<Veterinars> getAll() {
        return veterinarsRepository.findAll();
    }

    //public List<Veterinars> getByName() {
        //return veterinarsRepository.findBy(, "");
    //}

    public Veterinars getById(int id) {
        return veterinarsRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Veterinars veterinars) {
        veterinarsRepository.save(veterinars);
    }
}
