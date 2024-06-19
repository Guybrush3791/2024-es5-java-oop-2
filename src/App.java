public class App {
    public static void main(String[] args) throws Exception {

        /**
         * TODO:
         * 
         * dopo aver completato la classe Rombo i tutti
         * i suoi dettagli
         * 
         * creare tre oggetto di tipo Rombo con lati diversi
         * e stampare i dettagli di ciascuno
         * 
         * BONUS:
         * creare un array con quei 3 rombi creati e trovare
         * il rombo con l'area maggiore ciclando sull'array
         */

        Rombo r1 = new Rombo(5, 10, 15);
        Rombo r2 = new Rombo(10, -1, 30);
        Rombo r3 = new Rombo(0, 30, 45);

        r1.setDiag2(-20);

        System.out.println("--------------------------------");
        System.out.println(r1);
        System.out.println("--------------------------------");
        System.out.println(r2);
        System.out.println("--------------------------------");
        System.out.println(r3);
        System.out.println("--------------------------------");

        Rombo[] rombi = { r1, r2, r3 };

        Rombo maxRombo = null;
        int maxArea = Integer.MIN_VALUE;

        for (Rombo rombo : rombi) {

            if (rombo.getArea() > maxArea) {

                maxArea = rombo.getArea();
                maxRombo = rombo;
            }
        }

        System.out.println("Il rombo con l'area maggiore è:\n" + maxRombo);

        // Rombo maxRombo = rombi[0];
        // // int maxArea = Integer.MIN_VALUE;
        // for (Rombo rombo : rombi) {

        // if (rombo.getArea() > maxRombo.getArea()) {

        // maxRombo = rombo;
        // }
        // // if (rombo.getArea() > maxArea) {
        // // maxArea = rombo.getArea();
        // // }
        // }

        // // System.out.println("Il rombo con l'area maggiore è: " + maxArea);
        // System.out.println("Il rombo con l'area maggiore è:\n" + maxRombo);
    }
}
