
package shafriza.relasiclass.percobaan4;

public class Kursi {
    private String nomor;
    private Penumpang penumpang;
    
    Kursi(String nomor){
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Penumpang p) {
        this.penumpang = p;
    }
    
    public String info(){
        String info = "";
        info += "Nomor: "+nomor+"\n";
        if(this.penumpang != null){
            info += "penumpang: "+ penumpang.info()+"\n";
        }
        return info;
    }
}
