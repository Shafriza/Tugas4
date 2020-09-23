
package shafriza.relasiclass.tugas;

public class Film {
    private String nama;
    private String genre;

    public Film(String nama, String genre) {
        this.nama = nama;
        this.genre = genre;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String info (){
        String info = "";
        info +="Nama film: " + nama+ "\n";
        info +="Genre: " + genre+ "\n";
        return info;
    }
    
}
