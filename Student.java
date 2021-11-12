package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long ID;
    private String source;
    private String title;
    private String description;
    private String fullLink;
    private String creator;
    private String date;
    private Integer timeToRead;
    private String image;
    
//    @Transient
//    private Integer age;

    public Student() {
    }


    public Student(String source, String title, String description, String fullLink, String creator, String date,
			Integer timeToRead, String image) {
		//super();
		this.source = source;
		this.title = title;
		this.description = description;
		this.fullLink = fullLink;
		this.creator = creator;
		this.date = date;
		this.timeToRead = timeToRead;
		this.image = image;
	}
    
    





	public Student(Long ID, String source, String title, String description, String fullLink, String creator,
		String date, Integer timeToRead, String image) {
	//super();
	this.ID = ID;
	this.source = source;
	this.title = title;
	this.description = description;
	this.fullLink = fullLink;
	this.creator = creator;
	this.date = date;
	this.timeToRead = timeToRead;
	this.image = image;
}







	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFullLink() {
		return fullLink;
	}

	public void setFullLink(String fullLink) {
		this.fullLink = fullLink;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getTimeToRead() {
		return timeToRead;
	}

	public void setTimeToRead(Integer timeToRead) {
		this.timeToRead = timeToRead;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}



	public Long getID() {
		return ID;
	}



	public void setID(Long ID) {
		this.ID = ID;
	}



	@Override
	public String toString() {
		return "Student [ID=" + ID + ", source=" + source + ", title=" + title + ", description="
				+ description + ", fullLink=" + fullLink + ", creator=" + creator + ", date=" + date + ", timeToRead="
				+ timeToRead + ", image=" + image + "]";
	}
	






}
