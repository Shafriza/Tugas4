
package shafriza.relasiclass.percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi(){
        for(int i = 0; i <arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi (String.valueOf(i+1));
        }
    }
    public String info(){
        String info ="";
        info +="kode: " + kode + "\n";
        for(Kursi Kursi : arrayKursi){
            info += Kursi.info();
        }
        return info;
        
    }
    public void setPenumpang(Penumpang p,int nomor){
        int temp = nomor - 1;
        
        if(arrayKursi[temp].getPenumpang() != null){
           System.out.println("Kursi telah terisi, silahkan memilih kursi yang lainnya");
        } else {
        this.arrayKursi[temp].setPenumpang(p);
        }
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    public void setArrayKursi(Kursi[] arrayKursi) {
        this.arrayKursi = arrayKursi;
    }
    
    
}
