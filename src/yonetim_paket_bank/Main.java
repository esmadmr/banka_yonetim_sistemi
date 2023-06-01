package yonetim_paket_bank;

public class Main {
    public static void main(String[] args){

        BankaHesabi bankaHesabi = new BankaHesabi(454343245, 1500);
        double yatirilanMiktar = 100.0; // Yatırılacak miktar
        bankaHesabi.paraYatir(yatirilanMiktar);

        double cekilenMiktar = 50;
        bankaHesabi.paraCek(cekilenMiktar);

        bankaHesabi.bakiyeyiGoruntule();
    }
}
