public class Toyota extends Mobil{
	public void tampilkanToyota(){
		String BahanBakar;

		BahanBakar = 'Pertamax';
		Mobil m = new Mobil();
		m.inputdata('Innova','CVT','Manual');
		m.tampildata();

		System.out.println("jenis bahan bakar : "+BahanBakar)
	}
}