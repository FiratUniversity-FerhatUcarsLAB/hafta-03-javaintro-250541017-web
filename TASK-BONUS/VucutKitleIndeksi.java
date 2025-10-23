public class BMIHesaplama {
    public static void main(String[] args) {
        double kilo = 56;
        double boy = 1.60; 

        double bmi = kilo / (boy * boy);

        System.out.println("Kilo: " + kilo + " kg");
        System.out.println("Boy: " + boy + " m");
        System.out.println("Vücut Kitle İndeksi (BMI): " + bmi);

        if (bmi < 18.5) {
            System.out.println("Durum: Zayıf");
        } else if (bmi < 24.9) {
            System.out.println("Durum: Normal");
        } else if (bmi < 29.9) {
            System.out.println("Durum: Fazla kilolu");
        } else {
            System.out.println("Durum: Obez");
        }
    }
}
