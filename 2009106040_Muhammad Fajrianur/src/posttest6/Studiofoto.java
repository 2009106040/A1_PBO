package posttest6;

public class Studiofoto {
    //atribut
    protected String nama;
    protected String Jenis_foto;
    protected long no_telp;
    protected String ukuran;
   
    
    public Studiofoto(String nama, String Jenis_foto, long no_telp, String ukuran){
        this.nama = nama;
        this.Jenis_foto = Jenis_foto;
        this.no_telp = no_telp;
        this.ukuran = ukuran;
    }
    
    protected void setnama(String nama){
        this.nama = nama;
    }
    protected void setJenis_foto(String Jenis_foto){
        this.Jenis_foto = Jenis_foto;
    }
    protected void setno_telp(long no_telp){
        this.no_telp = no_telp;
    }
    protected void setukuran(String ukuran){
        this.ukuran = ukuran;
    }
    protected String getnama(){
        return this.nama;
    }
    protected String getJenis_foto(){
        return this.Jenis_foto;
    }    
    protected long getno_telp(){
        return this.no_telp;
    }
    protected String getukuran(){
        return this.ukuran;
    }    
    
    
    
    public void lihat(){
        System.out.print("Nama          : ");
        System.out.println(getnama());
        System.out.print("Jenis Foto    : ");
        System.out.println(getJenis_foto());
        System.out.print("Nomor Telepon : ");
        System.out.println(getno_telp());
        System.out.print("Ukuran Foto   : ");
        System.out.println(getukuran());
        System.out.print("Note! ");
    }
     
//    Studiofoto(String fajri, String praWedding, int i) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    //method
    void method1(){
        System.out.println("Pelanggan Bisa Merequest Ukuran Foto");
    }
    void method2(){
        System.out.println("Pelanggan Bisa Melihat Hasil Foto");
    }
}

