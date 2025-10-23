public class SaatDonusturme {
    public static void main(String[] args) {
        int toplamSaniye = 3665; // örnek: 3665 saniye

        int saat = toplamSaniye / 3600;
        int dakika = (toplamSaniye % 3600) / 60;
        int saniye = toplamSaniye % 60;

        // Dakika ve saniyeyi iki basamaklı yapmak için
        String formatliZaman = saat + ":" 
                             + (dakika < 10 ? "0" + dakika : dakika) + ":" 
                             + (saniye < 10 ? "0" + saniye : saniye);

        System.out.println("Dönüştürülen Zaman: " + formatliZaman);
    }
}
