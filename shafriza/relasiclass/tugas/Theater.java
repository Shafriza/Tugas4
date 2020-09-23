
package shafriza.relasiclass.tugas;

public class Theater {
    private String nomor;
    private Film film;
    private Bangku[] arBangku = new Bangku[10];

    public Theater(String nomor, Film film) {
        this.nomor = nomor;
        this.film = film;
        this.initBangku();
    }
        private void initBangku(){
        for(int i = 0; i <arBangku.length; i++){
            this.arBangku[i] = new Bangku (String.valueOf(i+1));
        }
    }
    public String getNomor() {
        return nomor;
    }
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    public Film getFilm() {
        return film;
    }
    public void setFilm(Film film) {
        this.film = film;
    }
    public Bangku[] getBangku() {
        return arBangku;
    }
    public void setBangku(Bangku[] bangku) {
        this.arBangku = bangku;
    }
        public String info(){
        String info ="";
        info +="Studio: " + nomor + "\n";
        info +="Film: " + film.info()+ "\n";
        for(Bangku Bangku : arBangku){
            info += Bangku.info() ;
        }
        return info;
    }
        public void setPenonton(Penonton p,int nomor){
        int temp = nomor - 1;
        
        if(arBangku[temp].getPenonton() != null){
           System.out.println("Kursi telah terisi, silahkan memilih kursi yang lainnya");
        } else {
        this.arBangku[temp].setPenonton(p);
        }
    }
}
