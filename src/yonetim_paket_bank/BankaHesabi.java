package yonetim_paket_bank;

import java.util.List;

public class BankaHesabi extends GenelHesap {


    public BankaHesabi(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Getter ve Setter metotları
    // paraYatir(double miktar): Hesaba belirtilen miktarı yatıran bir metot.
    public void paraYatir(double miktar) {
        balance += miktar;
        islemGecmisiGoruntule.add("Yatırma: " + miktar);
        System.out.println("BANKAYA YATIRILAN PARA MİKTARI: " + miktar);
    }

    // paraCek(double miktar): Hesaptan belirtilen miktarı çeken bir metot.
    public void paraCek(double miktar) {
        if (miktar <= balance) {
            balance -= miktar;
            islemGecmisiGoruntule.add("Çekme : " + miktar);
            System.out.println("BANKADAN ÇEKİLEN PARA MİKTARI: " + miktar);
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    // bakiyeyiGoruntule(): Mevcut hesap bakiyesini döndüren bir metot.
    public void bakiyeyiGoruntule() {
        System.out.println("BANKADAKİ BAKİYENİZ: " + balance);
    }

    public List<String> islemGecmisiGoruntule() {
        // İşlem geçmişini görüntüleme
        System.out.println("İşlem Geçmişi:");
        for (String islem : islemGecmisiGoruntule) {
            System.out.println(islem);
        }
        return islemGecmisiGoruntule;
    }

}