class LibraryBook {
String title;
String author;
int bookID;
LibraryBook(String title, String author, int bookID) {
this.title = title;
this.author = author;
this.bookID = bookID;
}
void displayBookInfo() {
System.out.println("Title: " + title);
System.out.println("Author: " + author);
System.out.println("Book ID: " + bookID);
}
}
public class Task2 {
public static void main(String[] args) {
LibraryBook b1 = new LibraryBook("Java Programming", "Tanim", 
1001);
LibraryBook b2 = new LibraryBook("Basic Electric", "Alexender 
Sadiku", 1002);
System.out.println("Book 1 Information:");
b1.displayBookInfo();
System.out.println("\nBook 2 Information:");
b2.displayBookInfo();
}
}
