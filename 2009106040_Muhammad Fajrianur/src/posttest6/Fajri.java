package posttest6;

public class Fajri implements jadwal{
    static String Photografer = "Fajri";
    String nama,tanggal,jam,tempat,jenis;
    
    public Fajri (String nama, String tanggal, String jam, String tempat, String jenis){
        this.nama = nama;
        this.tanggal = tanggal;
        this.jam = jam;
        this.tempat = tempat;
        this.jenis = jenis;
    }
            
    @Override
    public void order1() {
       System.out.println("nama         :   "+ this.nama);
       System.out.println("tanggal      :   "+ this.tanggal);
       System.out.println("jam          :   "+ this.jam);
       System.out.println("tempat       :   "+ this.tempat);
       System.out.println("Jenis foto   :   "+ this.jenis);
       System.out.println("Photografer "+Photografer);
    }
    

    @Override
    public void order2() {
       System.out.println("nama         :   "+ this.nama);
       System.out.println("tanggal      :   "+ this.tanggal);
       System.out.println("jam          :   "+ this.jam);
       System.out.println("tempat       :   "+ this.tempat);
       System.out.println("Jenis foto   :   "+ this.jenis);
       System.out.println("Photografer "+Photografer);
    }
}
