package Perulangan;

public class For {
    public static void main(String[] args) {
        int isigelas = 0;
        int penuh = 225;

        System.out.println("Isi gelas sekarang  ; " + isigelas + "ml");
        System.out.println("Isi gelas ketika penuh  ; " + penuh + "ml");

        for (isigelas = 0; isigelas <= penuh; isigelas++){
            System.out.println("Sedang mengisi gelas..");
            System.out.println("Isi gealas sekarang : " + isigelas + "ml");
        }

        System.out.println("Filnale : Isi gelas sekarang : " + penuh + "ml");
    }
}
