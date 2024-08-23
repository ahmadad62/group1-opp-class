package org.example;

public class Main {
    public static void main(String[] args) {

        Book book1=new Book("Poem","Gutoe","123456789");
        Book book2=new Book("Poem2","Gutoe","123456789444");
        Book book3=new Book("Poem3","Gutoe","123456789444");

        Book[] books={book1,book2};
        Library library=new Library(books);

        System.out.println(library);
        System.out.println(library.getBooks()[0]);
        library.addBook(book3);
        System.out.println("add book3"+library);
    }


}