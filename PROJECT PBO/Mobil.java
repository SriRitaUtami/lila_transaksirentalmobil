public class Mobil {
	Private String merk;
	Private String jenis;
	Private String transmisi;

	public String getMerk()
	{
		return merk;
	}

	public String getTransmisi()
	{
		return transmisi;
	}

	public String getJenis()
	{
		return jenis;
	}

	public void setJenis(String jenis)
	{
		this.jenis = jenis;
	}

	public void setMerk(String merk)
	{
		this.merk = merk;
	}

	public void setTransmisi(String transmisi)
	{
		this.transmisi = transmisi;
	}

	public void tampildata()
	{
		System.out.println("Mobil dengan Merk : "+getMerk());
	}

}