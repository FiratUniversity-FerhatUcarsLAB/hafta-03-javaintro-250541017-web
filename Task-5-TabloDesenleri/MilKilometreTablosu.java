class MilKilometreTablosu {
    public static void main(String[] args) {
        System.out.println("Mil    Kilometre");
        System.out.println("==========================");
        int mil1 = 1;
        int mil2 = 5;
        int mil3 = 10;
        int mil4 = 20;
        int mil5 = 50;

        double km1 = mil1 * 1.609;
        double km2 = mil2 * 1.609;
        double km3 = mil3 * 1.609;
        double km4 = mil4 * 1.609;
        double km5 = mil5 * 1.609;

        System.out.println(mil1 + "      " + km1);
        System.out.println(mil2 + "      " + km2);
        System.out.println(mil3 + "     " + km3);
        System.out.println(mil4 + "     " + km4);
        System.out.println(mil5 + "     " + km5);
    }
}
