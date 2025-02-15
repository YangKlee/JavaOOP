/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 7 thg 1, 2025
*/ 
package fa.training.entities;

import java.util.Date;

public abstract class Publication {
	private int publicationYear;
	private String publisher;
	private Date publicationDate;
	public Publication() {};
	public Publication(int publicationYear, String publisher, Date publicationDate) {
		super();
		this.publicationYear = publicationYear;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	abstract public void display();
}
