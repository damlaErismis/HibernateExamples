package com.damla.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "musteriler")
public class Musteri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String ad;
    String soyad;
    String adres;
    String telefon;
    String email;

    @OneToMany(mappedBy = "musteri")
    private List<Kiralama> kiralamaListesi;


}
