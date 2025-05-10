package Odev_4;

import java.util.Scanner;

public class D_01_Dongü {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000; // Başlangıç bakiyesi

        System.out.println("Hoş geldiniz!");
        System.out.println("Hesabınızdaki mevcut bakiye: " + bakiye + " TL");

        /*
        While (true) döngüsü seçildi.
        Çünkü , kaç kez tekrarlanacaı belli değil. bu yüzden belirli olmayan durumlar için while döngüsü seçilir.
        Koşul tabanlı, kullanıcı girdisi gibi belirsiz tekrarlar için uygundur.
        Koşul doğru olduğu sürece dön" anlamı nettir görüldüğü üzere
        Kullanıcıdan veri almak için en yaygın durumdur.

        for (;;) sonsuz döngüyü anlarız ancak ne yaptığı net değildir.
         */

        while (true) {
            System.out.print("Çekmek istediğiniz tutarı girin: ");
            int cekilecekTutar = scanner.nextInt();

            // Negatif veya sıfır kontrolü
            if (cekilecekTutar <= 0) {
                System.out.println("Tutar sıfırdan büyük olmalı. Lütfen geçerli bir tutar girin.");
            }
            // Bakiye kontrolü
            else if (cekilecekTutar > bakiye) {
                System.out.println("Yetersiz bakiye! En fazla " + bakiye + " TL çekebilirsiniz.");
            }
            // Geçerli giriş
            else {
                bakiye -= cekilecekTutar;
                System.out.println("" + cekilecekTutar + " TL başarıyla çekildi. Kalan bakiye: " + bakiye + " TL");
                break;
            }
        }
        scanner.close();
    }
}