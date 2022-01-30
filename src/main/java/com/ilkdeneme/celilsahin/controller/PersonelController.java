package com.ilkdeneme.celilsahin.controller;


import com.ilkdeneme.celilsahin.entity.Personel;
import com.ilkdeneme.celilsahin.service.PersonelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.RecursiveTask;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class PersonelController {

    private final PersonelService personelService;

    @PostMapping("/savepersonel")
    public ResponseEntity<Personel> save(Personel personel) {
        if(personel.getId() != null){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(personelService.save(personel));
    }

    @PutMapping("/updatepersonel")
    public ResponseEntity<Personel> update(Personel personel) {
        if (personel.getId() == null) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(personelService.update(personel));
    }
    @DeleteMapping("/deletepersonel/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try {
            personelService.delete(id);
           return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
          return   ResponseEntity.notFound().build();
        }
            }


    @GetMapping("/findbyidpersonel/{id}")
    public ResponseEntity<Personel> findById(@PathVariable Long id) {
        Optional<Personel> optionalPersonel;
        try {
            optionalPersonel= personelService.findById(id);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
         return ResponseEntity.ok().body(optionalPersonel.get());
    }
    @GetMapping("/findallpersonel")
    public ResponseEntity<List<Personel>> findAll(){
        return ResponseEntity.ok(personelService.findAll());
    }




}
