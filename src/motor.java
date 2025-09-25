class motor {
    String warna;
    String tipe;

    public void nyalakanmesin() {
        System.out.println("Motor " + tipe + " warna " + warna + " menyala.");
    }

    public void matikanmesin() {
        System.out.println("Motor " + tipe + " warna " + warna + " mati.");
    }

    public void info() {
        System.out.println("Tipe: " + tipe + ", Warna: " + warna);
    }
}

