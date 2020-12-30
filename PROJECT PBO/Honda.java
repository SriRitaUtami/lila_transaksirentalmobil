public class Honda extends Mobil{
	public void tampilkanhonda(){
	String bahanbakar;

	bahanbakar="bensin";
	Mobil m =new Mobil();

	m.inputdata("Honda CR-V", "CVT", "Automatic");
	m.tampildata();
	System.out.println("Bahan Bakar : "+bahanbakar);

	}
	
}