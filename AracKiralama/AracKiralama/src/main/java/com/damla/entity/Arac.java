package com.damla.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "araclar")
public class Arac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String marka;
    String model;
    int yil;

    @Enumerated(EnumType.STRING)
    @Column(name = "yakitTuru")
    private EYakitTuru yakitTuru;

    @Enumerated(EnumType.STRING)
    @Column(name = "vitesTipi")
    private EVitesTipi vitesTipi;

    double fiyat;
    boolean is_active;

    @OneToMany(mappedBy = "arac", cascade = CascadeType.ALL)
    private List<Kiralama> kiralamaListesi;



}
