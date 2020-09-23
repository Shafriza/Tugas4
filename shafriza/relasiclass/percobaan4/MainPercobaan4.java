
package shafriza.relasiclass.percobaan4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang ("12345","Shafriza ladiyan");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        
        Penumpang budi = new Penumpang("6789", "budi");
        gerbong.setPenumpang(budi, 2);
        System.out.println(gerbong.info());
    }
}
