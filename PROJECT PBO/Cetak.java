public class Cetak {
    
    public static void main(String[] args) {
        System.out.println("\nMobil Honda");
        Honda h = new Honda();
        h.tampilkanhonda();

        System.out.println("\nMobil Toyota");
        Toyota t = new Toyota();
        t.tampilkanToyota();

        System.out.println("\nMobil Suzuki");
        Suzuki s = new Suzuki();
        s.tampilkansuzuki();
    }
}
