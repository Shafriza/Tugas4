
package shafriza.relasiclass.tugas;

public class Bangku {
    private String nomor;
    private Penonton penonton;

    Bangku(String nomor) {
        this.nomor = nomor;
    }
    public String getNomor() {
        return nomor;
    }
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    public Penonton getPenonton() {
        return penonton;
    }
    public void setPenonton(Penonton penonton) {
        this.penonton = penonton;
    }
    public String info(){
        String info = "";
        info += "Nomor Bangku: "+nomor+"\n";
        if(this.penonton != null){
            info += "Penonton: \n"+ penonton.info()+"\n";
        }
        return info;
    }
}
