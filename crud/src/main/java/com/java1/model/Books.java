package com.java1.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books
{
@Id
@Column
private int id;
@Column
private String name;
@Column
private String author;
@Column
private Date publish_year;
public int getId() 
{
return id;
}
public void setId(int id) 
{
this.id = id;
}
public String getName()
{
return name;
}
public void setName(String name) 
{
this.name = name;
}
public String getAuthor() 
{
return author;
}
public void setAuthor(String author) 
{
this.author = author;
}
public Date getPublish_year(Date date) 
{
return date;
}
public void setPublish_year(Date publish_year) 
{
this.publish_year = publish_year;
}
}