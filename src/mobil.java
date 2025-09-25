public class mobil {
    String warna;
    String tipe;

    public void nyalakanmesin() {
        System.out.println("Mobil " + this.warna + " nyalakan mesin.");
    }
    public void matikanmesin() {
        System.out.println("Mobil " + this.warna + " matikan mesin.");
    }
    public void klakson() {
        System.out.println("Mobil " + this.warna + " membunyikan klakson.");
    }
    public void info() {
        System.out.println("Warna: " + this.warna + ", Merk: " + this.tipe);
    }
}
