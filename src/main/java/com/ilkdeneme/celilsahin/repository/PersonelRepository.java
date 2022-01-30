package com.ilkdeneme.celilsahin.repository;

import com.ilkdeneme.celilsahin.entity.Personel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonelRepository extends JpaRepository<Personel, Long> {
}
