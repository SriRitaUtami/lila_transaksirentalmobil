public class Toyota extends Mobil{

	public void tampilkanToyota(){
		String bahanBakar;

		bahanBakar = "Pertamax";
		Mobil m = new Mobil();
		m.inputdata("Innova","CVT","Manual");
		m.tampildata();

		System.out.println("Jenis bahan bakar : "+bahanBakar);
	}
}