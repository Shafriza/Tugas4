
package shafriza.relasiclass.percobaan3;

public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234","Shafriza Ladiyan");
        Pegawai asisten = new Pegawai("4567","Squidward Tentacle");
        
        KeretaApi keretaApi = new KeretaApi("Gaya Baru","Bisnis",masinis,asisten);
        System.out.println(keretaApi.info());
        
        Pegawai masinis1 = new Pegawai("1234", "Spongebob Squarepants"); 
        Pegawai asisten1 = new Pegawai("4567","Squidward Tortelini");
        KeretaApi keretaApi1 = new KeretaApi("Gaya Baru", "Bisnis",masinis1,asisten1);
        System.out.println(keretaApi1.info()); 

    }
}
