package com.ilkdeneme.celilsahin.service;


import com.ilkdeneme.celilsahin.entity.Personel;

import java.util.List;
import java.util.Optional;

public interface PersonelService {

    Personel save(Personel personel);
    Personel update(Personel personel);
    void delete(Long id);
    Optional<Personel> findById(Long id);
    List<Personel> findAll();







}
