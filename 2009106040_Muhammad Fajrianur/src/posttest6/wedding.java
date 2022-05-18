package posttest6;

public class wedding implements jadwal{
    String nama,tanggal,jam,tempat,jenis;
    
    public wedding (String nama, String tanggal, String jam, String tempat, String jenis){
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
    }
    

    @Override
    public void order2() {
       System.out.println("nama         :   "+ this.nama);
       System.out.println("tanggal      :   "+ this.tanggal);
       System.out.println("jam          :   "+ this.jam);
       System.out.println("tempat       :   "+ this.tempat);
       System.out.println("Jenis foto   :   "+ this.jenis);
    }
    
}
