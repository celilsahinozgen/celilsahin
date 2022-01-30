package com.ilkdeneme.celilsahin.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tblpersonel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String lastname;
    Date birtday;


}
