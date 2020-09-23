
package shafriza.relasiclass.tugas;

public class Penonton {
    private String ktp;
    private String nama;

    public Penonton(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String kode) {
        this.ktp = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String info(){
        String info = "";
        info += "ktp: "+ktp+"\n";
        info += "Nama: "+nama+"\n";
        return info;
    }
}
