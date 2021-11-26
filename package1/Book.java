package package1;

public class Book {
private int id;
private String Title;
private String  publisher;
private String Author;
private int price;
public Book(int id, String title, String publisher, String author, int price) {
	super();
	this.id = id;
	Title = title;
	this.publisher = publisher;
	Author = author;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
