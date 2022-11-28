public class Main {
    public static void main(String[] args) {
        BangunDatar persegi = new Persegi("Ungu", 100, 20);

        BangunDatar lingkaran = new Lingkaran("Putih", 50);

        BangunDatar segitiga = new Segitiga("Biru", 60, 80);
        // memanggil method gambar//
        persegi.gambar();
        lingkaran.gambar();
        segitiga.gambar();

        System.out.println("Luas Persegi: " + persegi.getLuas());
        System.out.println("Luas Lingkaran: " + lingkaran.getLuas());
        System.out.println("Luas Segitiga: " + segitiga.getLuas());

    }

}
