package posttest4;

public class Kamera extends Studiofoto{
    public Kamera(String nama, String Jenis_foto, long no_telp, String ukuran){
        super(nama,Jenis_foto, no_telp, ukuran);
        
        
    
    }@Override
    public void lihat(){
        System.out.print("Merk Kamera   : ");
        System.out.println(getnama());
        System.out.print("Jenis Foto    : ");
        System.out.println(getJenis_foto());
        System.out.print("Nomor Telepon : ");
        System.out.println(getno_telp());
        System.out.print("Ukuran Foto   : ");
        System.out.println(getukuran());
        System.out.print("Note! ");
    }
}

