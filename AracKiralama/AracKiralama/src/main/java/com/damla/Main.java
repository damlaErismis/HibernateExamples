package com.damla;


import com.damla.controller.AracController;
import com.damla.controller.MusteriController;
import com.damla.entity.Arac;
import com.damla.entity.Musteri;


import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    private AracController aracController = new AracController();
    private MusteriController musteriController = new MusteriController();

    public static void main(String[] args) {
        Main main = new Main();
        main.anaMenu();
    }

    private void anaMenu() {
        int input = 0;
        do {
            System.out.println("1- Araç Ekle");
            System.out.println("2- Musteri Ekle");
            System.out.println("3- Araç Ara");

            input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 1:
                    aracEkle();
                case 2:
                    kisiEkle();
                case 3:
                    aracAra();
            }

        } while (input != 0);
    }

    private void aracAra(){

        System.out.println("Araç Markasını girin");
        String marka = scanner.nextLine();
        System.out.println("Araç Modelini girin");
        String model = scanner.nextLine();
        aracController.findByMarkaAndModel(marka,model).forEach(x->
                System.out.println(x.getMarka()+"  --  "+x.getModel()+ "  --  "+ x.getYil()));
    }

    private void kisiEkle() {
        System.out.println("Ad: ");
        String ad = scanner.nextLine();
        System.out.println("SoyAd: ");
        String soyad = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();

        Musteri musteri = Musteri.builder()
                .ad(ad)
                .soyad(soyad)
                .email(email)
                .build();
        musteriController.save(musteri);
    }

    private void aracEkle() {
        System.out.println("Araç Markasını girin");
        String marka = scanner.nextLine();
        System.out.println("Araç Modelini girin");
        String model = scanner.nextLine();
        System.out.println("Araç Yılını girin");
        int yil = Integer.parseInt(scanner.nextLine());

        Arac arac = Arac.builder()
                .marka(marka)
                .model(model)
                .yil(yil)
                .build();
        aracController.save(arac);
    }
}