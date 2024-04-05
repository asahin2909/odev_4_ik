package org.example;

import java.util.ArrayList;
import java.util.List;

// Personel sinifi
class Personel {
    private String ad;
    private String soyad;
    private String pozisyon;

    public Personel(String ad, String soyad, String pozisyon) {
        this.ad = ad;
        this.soyad = soyad;
        this.pozisyon = pozisyon;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getPozisyon() {
        return pozisyon;
    }
}

// IK sinifi
class IK {
    private String departmanAdi;
    private List<Personel> personelListesi;

    public IK(String departmanAdi) {
        this.departmanAdi = departmanAdi;
        personelListesi = new ArrayList<>();
    }

    public void personelEkle(Personel personel) {
        personelListesi.add(personel);
    }

    public List<Personel> getPersonelListesi() {
        return personelListesi;
    }
}

public class Main {
    public static void main(String[] args) {
        // Ornek bir IK departmani olusturulmasi
        IK insanKaynaklari = new IK("Insan Kaynaklari");

        // Personellerin olusturulmasi ve IK departmanina eklenmesi
        Personel personel1 = new Personel("Abdullah", "Şahin", "IK Uzmani");
        Personel personel2 = new Personel("Merve", "Şahin", "IK Asistani");
        Personel personel3 = new Personel("Gökçe", "Şahin", "IK Muduru");

        insanKaynaklari.personelEkle(personel1);
        insanKaynaklari.personelEkle(personel2);
        insanKaynaklari.personelEkle(personel3);

        // Departmandaki personellerin listelenmesi
        List<Personel> personelListesi = insanKaynaklari.getPersonelListesi();
        System.out.println("Departmandaki Personeller:");
        for (Personel personel : personelListesi) {
            System.out.println("Adi: " + personel.getAd() + ", Soyadi: " + personel.getSoyad() + ", Pozisyon: " + personel.getPozisyon());
        }
    }
}
