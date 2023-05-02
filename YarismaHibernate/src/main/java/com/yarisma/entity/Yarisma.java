package com.yarisma.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "yarisma")
public class Yarisma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "kullaniciid", referencedColumnName = "id")
    private Kullanici kullanici;

    public Yarisma(Kullanici kullanici){
        this.kullanici = kullanici;
    }

    private String yarismaAdi;

    private Date baslangicTarihi;

    private Date bitisTarihi;

    private String odul;

    private int katilimciSayisi;

    public Yarisma(String yarismaAdi, Date baslangicTarihi, Date bitisTarihi, String odul, int katilimciSayisi) {

        this.yarismaAdi = yarismaAdi;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.odul = odul;
        this.katilimciSayisi = katilimciSayisi;
    }
}
