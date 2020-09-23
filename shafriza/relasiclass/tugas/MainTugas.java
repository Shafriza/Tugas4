
package shafriza.relasiclass.tugas;
public class MainTugas {
    public static void main(String[] args) {
        Penonton p1 = new Penonton("1001", "M Shafriza ladiyan");
        Penonton p2 = new Penonton("1002", "Chanda");
        Penonton p3 = new Penonton("1003", "Andri");
        Penonton p4 = new Penonton("1004", "Tasya");
        Penonton p5 = new Penonton("1005", "Ananda");
        Penonton p6 = new Penonton("1006", "Budi");
        Penonton p7 = new Penonton("1007", "Bapaknya budi");
        Penonton p8 = new Penonton("1008", "Ibunya budi");
        Penonton p9 = new Penonton("1009", "Kakaknya budi");
        Penonton p10 = new Penonton("10010", "Adeknya budi");
        Film f1 = new Film("Bucin", "Action Comedy");
        Theater t1 = new Theater("1", f1);
        t1.setPenonton(p1, 1);
        t1.setPenonton(p2, 2);
        t1.setPenonton(p3, 3);
        t1.setPenonton(p4, 4);
        t1.setPenonton(p5, 5);
        t1.setPenonton(p6, 6);
        t1.setPenonton(p7, 7);
        t1.setPenonton(p8, 8);
        t1.setPenonton(p9, 9);
        t1.setPenonton(p10, 10);
        System.out.println(t1.info());
    }
}
