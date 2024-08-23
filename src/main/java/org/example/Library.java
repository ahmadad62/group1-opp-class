package org.example;

import java.util.Arrays;

public class Library {
private Book[] books;

public Library(Book[] books) {
    this.books=books;
}
public Book[] getBooks() {
    return books;
}
public void  setBooks(Book[] books) {
    this.books = books;
}

public void addBook(Book book) {
    Book[] newBooks = new Book[books.length+1];
    for (int i=0;i<books.length;i++) {
        newBooks[i]=books[i];
    }
    newBooks[books.length]=book;
    books=newBooks;
}



@Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}


