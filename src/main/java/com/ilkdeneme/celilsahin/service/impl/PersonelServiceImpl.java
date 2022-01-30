package com.ilkdeneme.celilsahin.service.impl;


import com.ilkdeneme.celilsahin.entity.Personel;
import com.ilkdeneme.celilsahin.repository.PersonelRepository;
import com.ilkdeneme.celilsahin.service.PersonelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PersonelServiceImpl implements PersonelService {

    private final PersonelRepository personelRepository;

    @Override
    public Personel save(Personel personel) {
        return personelRepository.save(personel);
    }

    @Override
    public Personel update(Personel personel) {
        return personelRepository.save(personel);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Optional<Personel> findById(Long id) {
        return personelRepository.findById(id);
    }

    @Override
    public List<Personel> findAll() {
        return personelRepository.findAll();
    }
}
