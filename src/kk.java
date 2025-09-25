public class kk {
    public static void main(String[] args) {
        
        motor Ninja = new motor();
        motor modif = new motor();
        motor vario = new motor();

        Ninja.warna = "hitam";
        modif.warna = "putih";
        vario.warna = "Grey";
    
        Ninja.tipe = "Ninja";
        modif.tipe = "modif";
        vario.tipe = "vario";

        // coba panggil method
        Ninja.info();
        Ninja.nyalakanmesin();
        vario.info();
        vario.matikanmesin();
    }
}
