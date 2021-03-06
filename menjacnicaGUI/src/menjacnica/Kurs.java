
package menjacnica;

import java.io.Serializable;

public class Kurs implements Serializable{
	private String naziv;
	private String skraceniNaziv;
	private String sifra;
	private double prodajni;
	private double kupovni;
	private double srednji;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public double getProdajni() {
		return prodajni;
	}

	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}

	public double getKupovni() {
		return kupovni;
	}

	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}

	public double getSrednji() {
		return srednji;
	}

	public void setSrednji(double srednji){
		this.srednji=srednji;
	}
	@Override
	public String toString() {
		
		return "Naziv "+naziv+",\n prodajni: "+prodajni+",\n kupovni: "+kupovni+ ",\n srednji: "+srednji+" \n skraceni naziv: "+skraceniNaziv;
	}

}