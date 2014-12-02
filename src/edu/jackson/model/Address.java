package edu.jackson.model;

public class Address {

	private Long id;
	private String namaJalan;
	private String namaKomplek;
	private Integer noRumah;
	
	public Address() {
	}

	public Address(String namaJalan, String namaKomplek, Integer noRumah) {
		super();
		this.namaJalan = namaJalan;
		this.namaKomplek = namaKomplek;
		this.noRumah = noRumah;
	}

	public String getNamaJalan() {
		return namaJalan;
	}

	public void setNamaJalan(String namaJalan) {
		this.namaJalan = namaJalan;
	}

	public String getNamaKomplek() {
		return namaKomplek;
	}

	public void setNamaKomplek(String namaKomplek) {
		this.namaKomplek = namaKomplek;
	}

	public Integer getNoRumah() {
		return noRumah;
	}

	public void setNoRumah(Integer noRumah) {
		this.noRumah = noRumah;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", namaJalan=" + namaJalan + ", namaKomplek=" + namaKomplek + ", noRumah="
				+ noRumah + "]";
	}
	
}
