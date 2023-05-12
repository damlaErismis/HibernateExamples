package com.damla.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "kiralama")
public class Kiralama {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "arac_id", referencedColumnName = "id")
    private Arac arac;

    @ManyToOne(fetch = FetchType.LAZY)
    private Musteri musteri;

    private long kiralamaTarihi;
    private long iadeTarihi;
    private double toplamTutar;
}
