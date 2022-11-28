public class Persegi extends BangunDatar {
    private float tinggi;
    private float lebar;

    public Persegi(String warna, float lebar, float tinggi) {
        super.warna = warna;
        this.tinggi = tinggi;
        this.lebar = lebar;
    }

    @Override
    public void gambar() {
        System.out.println("\n" + getWarna());
        System.out.println("Gambar Persegi");

    }

    @Override
    public float getLuas() {
        return this.lebar * this.tinggi;

    }

}
