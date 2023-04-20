package com.bilgeadam.entity;

import javax.persistence.Embeddable;
import java.util.List;

@Embeddable
public class Information {
    /**
     * Information sınıfını veritabanında tablo olarak kullanmak istemiyorum
     * ama bu sınıfı user sınıfının içinde kullanmak istiyorum
     */
    private String name;
    private String surname;
    private String middleName;

    public Information(String name, String surname, String middleName) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
    }

    public Information() {
    }
}
