public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = true; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p|q) + "\t");
        System.out.print((p ^ q) + "\t" + (!q) + "\t");

    }
}
