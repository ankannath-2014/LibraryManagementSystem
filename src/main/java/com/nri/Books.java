package com.nri;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Books {
	
	
	@Id
	private int bookid;
	private String bookname;
	private int bookqnty;
	
	
	@ManyToOne
	private Library library;

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getBookqnty() {
		return bookqnty;
	}

	public void setBookqnty(int bookqnty) {
		this.bookqnty = bookqnty;
	}

	



	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", bookname=" + bookname + ", bookqnty=" + bookqnty + ", library=" + library
				+ "]";
	}
	
	

}
