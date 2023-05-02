package com.yarisma.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "kulanici")
public class Kullanici {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ad;
    private String soyad;
    private String avatar;
    private String email;
    private String password;

    @OneToMany(mappedBy = "kullanici")
    private List<Yarisma> yarismaList;

    public Kullanici(String ad, String soyad, String avatar, String email, String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.avatar = avatar;
        this.email = email;
        this.password = password;
    }
}
