package Perulangan;

public class DoWhile {
    public static void main(String[] args) {

        int isiGelas = 0;
        int penuh = 225;

        System.out.println("Isi gelas sekarang  ; " + isiGelas + "ml");
        System.out.println("Isi gelas ketika penuh  ; " + penuh + "ml");

        do {
            isiGelas++;
            System.out.println("Sedang mengisi gelas..");
            System.out.println("Isi gealas sekarang : " + isiGelas + "ml");
        } while (isiGelas != penuh);


        System.out.println();
    }
}