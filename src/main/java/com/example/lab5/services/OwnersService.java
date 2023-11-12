package com.example.lab5.services;

import com.example.lab5.models.Owners;
import com.example.lab5.repozitories.OwnersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class OwnersService {
    private final OwnersRepository ownersRepository;

    @Autowired
    public OwnersService(OwnersRepository ownersRepository) {
        this.ownersRepository = ownersRepository;
    }

    public List<Owners> getAll() {
        return ownersRepository.findAll();
    }

    public Owners getById(int id) {
        return ownersRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Owners owners) {
        ownersRepository.save(owners);
    }
}
