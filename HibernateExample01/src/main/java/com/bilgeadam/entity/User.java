package com.bilgeadam.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

/**
 * name
 * surname
 * username --> unique olsun null olmasın
 * password --> null olmasın uzunluğu da 32 olsun
 *
 * user sınıfın içinde liste içinde interests tutalım
 *
 * AddressType--> Enum Home, Business, Other
 * Address--> street,country,city
 * Hashmap yapısında userin içinde kullanalım
 */

@Entity
@Table(name = "tbluser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(unique = true, nullable = false)
    private String username;

    @Column(length = 32, nullable = false)
    private String password;

    @Embedded
    private Information information;

    @ElementCollection
    private List<String> interests;

    @Column(name = "cinsiyet")
    @Enumerated(EnumType.STRING)
    private EGender eGender;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Map<AddressType,Address> address;

    public User( String username, String password, Information information, EGender eGender,
                 List<String> interests, Map<AddressType,Address> address) {
        this.username = username;
        this.password = password;
        this.information = information;
        this.eGender = eGender;
        this.interests = interests;
        this.address = address;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", eGender=" + eGender +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public EGender geteGender() {
        return eGender;
    }

    public void seteGender(EGender eGender) {
        this.eGender = eGender;
    }

    public Map<AddressType, Address> getAddress() {
        return address;
    }

    public void setAddress(Map<AddressType, Address> address) {
        this.address = address;
    }
}
