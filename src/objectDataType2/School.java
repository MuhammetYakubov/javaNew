package objectDataType2;

public class School {
public static void main(String[] args) {
	
	Student s1 = new Student();
	
	s1.name = "Ibrahim";
	s1.age = 12;
	s1.email = "ibragimmail@.com";
	
	s1.read();
	
	Book b = new Book();
	b.title = "\"Future of SDET\"";
	b.author = "\"JAmes bond\"";
	b.pages = 230;
	
	s1.read(b);
	
//	b--> one full book.That one has title, pahes, author s1.read(b);
	int i = 2;
	s1.read(i);
}
}
