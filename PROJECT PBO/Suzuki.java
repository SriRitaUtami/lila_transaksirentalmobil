public class Suzuki extends Mobil{
    public void tampilkansuzuki(){
        String BahanBakar;
        
        BahanBakar = "Pertalite";
        Mobil m = new Mobil();
        m.inputdata("Celerio","APV","Carry Pick Up");
        m.tampildata();
        
        System.out.println("Jenis bahan bakar : "+BahanBakar);
   } 
}