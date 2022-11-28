public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    public Segitiga(String warna, int alas, int tinggi) {
        super.warna = warna;
        this.alas = alas;
        this.tinggi = tinggi;

    }

    @Override
    public void gambar() {
        System.out.println("\n" + getWarna());
        System.out.println("Gambar Segitiga");

    }

    public float getLuas() {
        return this.alas * this.tinggi;

    }

}
