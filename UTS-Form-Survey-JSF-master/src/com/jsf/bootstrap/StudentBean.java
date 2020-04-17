package com.jsf.bootstrap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean @SessionScoped
public class StudentBean {

	private String firstName;
	private String lastName;
	private String standard;
	private String kota;
	private String provinsi;
	private String negara;
	private String nomorTelepon;
	private String pos;
	private String email;
	private String tanggalSurvey;
	private String rekomendasi;
	private String interest;
	private boolean favorit;
	private String pesan;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}
	
		
	public String getKota() {
		return kota;
	}

	public void setKota(String kota) {
		this.kota = kota;
	}

	public String getProvinsi() {
		return provinsi;
	}

	public void setProvinsi(String provinsi) {
		this.provinsi = provinsi;
	}

	public String getNegara() {
		return negara;
	}

	public void setNegara(String negara) {
		this.negara = negara;
	}

	public String getNomorTelepon() {
		return nomorTelepon;
	}

	public void setNomorTelepon(String nomorTelepon) {
		this.nomorTelepon = nomorTelepon;
	}
	
	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTanggalSurvey() {
		return tanggalSurvey;
	}

	public void setTanggalSurvey(String tanggalSurvey) {
		this.tanggalSurvey = tanggalSurvey;
	}
	
	public String getRekomendasi() {
		return rekomendasi;
	}

	public void setRekomendasi(String rekomendasi) {
		this.rekomendasi = rekomendasi;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public boolean isFavorit() {
		return favorit;
	}

	public void setFavorit(boolean favorit) {
		this.favorit = favorit;
	}

	public String getPesan() {
		return pesan;
	}

	public void setPesan(String pesan) {
		this.pesan = pesan;
	}

	public String createStudentForm() {
		System.out.println("Reading Student Details - Name: " + firstName + " " + lastName + ", Standard: " + standard);
		return "output";
	}
}