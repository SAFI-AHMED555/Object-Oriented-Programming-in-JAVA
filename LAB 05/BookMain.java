public class BookMain {
    public static class Book {

        String title;
        String author;
        String ISBN;
        int numPages;

        public Book() {
            System.out.println("Default constructor called");
        }

        public Book(String title, String author, String ISBN, int numPages) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
            this.numPages = numPages;
        }

        public void displayBookInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
            System.out.println("Number of Pages: " + numPages);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Programming in Java ", "SAFI AHMED", "002", 350);

        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}