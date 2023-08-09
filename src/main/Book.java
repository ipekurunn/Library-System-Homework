package main;

import java.util.List;

public class Book {
	private String title;
    private String genre;
    private int borrowCount;
    private boolean borrowStatus;
    private String byWhom;

    public Book(String title, String genre, int borrowCount, boolean borrowStatus, String byWhom) {
        this.title = title;
        this.genre = genre;
        this.borrowCount = borrowCount;
        this.borrowStatus = borrowStatus;
        this.byWhom = byWhom;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }
    public int getBorrowCount() {
        return borrowCount;
    }

    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount;
    }
    public boolean isBorrowStatus() {
        return borrowStatus;
    }

    public void setBorrowStatus(boolean borrowStatus) {
        this.borrowStatus = borrowStatus;
    }

    public String getByWhom() {
        return byWhom;
    }

    public void setByWhom(String byWhom) {
        this.byWhom = byWhom;
    }
    public static Book searchByTitle(String title, List<Book> bookList) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
            	return book;
            }
        }
        Book defbook = bookList.get(0) ;
        return defbook;
        
    }
    public void incrementBorrowCount() {
        borrowCount++;
    }

}
