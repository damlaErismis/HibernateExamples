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
@Table(name = "yarismakatilim")
public class YarismaKatilim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "yarismaid", nullable = false)
    private Yarisma yarisma;

    @ManyToOne
    @JoinColumn(name = "katilimciid", nullable = false)
    private Kullanici katilimci;

    private Date katilimTarihi;

    public YarismaKatilim(Yarisma yarisma, Kullanici katilimci, Date katilimTarihi) {
        this.yarisma = yarisma;
        this.katilimci = katilimci;
        this.katilimTarihi = katilimTarihi;
    }



}
