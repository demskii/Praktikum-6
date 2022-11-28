import java.lang.Math;

public class Lingkaran extends BangunDatar {
    private int jariJari;

    public Lingkaran(String warna, int jariJari) {
        super.warna = warna;
        this.jariJari = jariJari;
    }

    @Override
    public void gambar() {
        System.out.println("\n" + getWarna());
        System.out.println("Gambar Lingkaran");

    }

    @Override
    public float getLuas() {
        return (int) (Math.PI * jariJari * jariJari);

    }

}
