public class ParaBozma {
    public static void main(String[] args) {
        int miktar = 488;

        // 200 TL
        int ikiyuzluk = miktar / 200;
        miktar = miktar % 200;

        // 100 TL
        int yuzluk = miktar / 100;
        miktar = miktar % 100;

        // 50 TL
        int ellilik = miktar / 50;
        miktar = miktar % 50;

        // 20 TL
        int yirmilik = miktar / 20;
        miktar = miktar % 20;

        // 10 TL
        int onluk = miktar / 10;
        miktar = miktar % 10;

        // 5 TL
        int beslik = miktar / 5;
        miktar = miktar % 5;

        // 2 TL
        int ikilik = miktar / 2;
        miktar = miktar % 2;

        // 1 TL
        int birlik = miktar;

        // Sonuçları yazdır
        System.out.println("Para bozma işlemi:");
        System.out.println(ikiyuzluk + " x 200 TL");
        System.out.println(yuzluk + " x 100 TL");
        System.out.println(ellilik + " x 50 TL");
        System.out.println(yirmilik + " x 20 TL");
        System.out.println(onluk + " x 10 TL");
        System.out.println(beslik + " x 5 TL");
        System.out.println(ikilik + " x 2 TL");
        System.out.println(birlik + " x 1 TL");
        
    }
}
