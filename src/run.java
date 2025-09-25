public class run {
    public static void main(String[] args) {
        mobil Bmw = new mobil();
        mobil Sedan = new mobil();
        mobil jeep = new mobil();

        Bmw.warna = "hitam";
        Sedan.warna = "putih";
        jeep.warna = "Grey";
    
        Bmw.tipe = "Bmw";
        jeep.tipe = "jeep";
        Sedan.tipe = "sedan";
        // coba panggil method
        Bmw.info();
        Bmw.nyalakanmesin();
        jeep.info();
        jeep.matikanmesin();
    }
}


