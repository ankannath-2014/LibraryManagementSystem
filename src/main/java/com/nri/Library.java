package com.nri;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Library {
	
	
	@Id
	private int libid;
	private String libname;
	private double libfees;
	
	
	@OneToMany(fetch = FetchType.EAGER,cascade =CascadeType.ALL)
	private List<Books> book;

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLibid() {
		return libid;
	}

	public void setLibid(int libid) {
		this.libid = libid;
	}

	public String getLibname() {
		return libname;
	}

	public void setLibname(String libname) {
		this.libname = libname;
	}

	public double getLibfees() {
		return libfees;
	}

	public void setLibfees(double libfees) {
		this.libfees = libfees;
	}

	

	public List<Books> getBook() {
		return book;
	}

	public void setBook(List<Books> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Library [libid=" + libid + ", libname=" + libname + ", libfees=" + libfees + ", book=" + book + "]";
	}
	
	
	

}
