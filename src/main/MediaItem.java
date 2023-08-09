package main;

public class MediaItem {
	 private String title;
	    private String genre;
	    private String type;
	    private int borrowCount;

	    public  MediaItem(String title, String genre, String type) {
	        this.title = title;
	        this.genre = genre;
	        this.type = type;
	        this.borrowCount = 0;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getGenre() {
	        return genre;
	    }

	    public String getType() {
	        return type;
	    }
	    
	    public int getBorrowCount() {
	        return borrowCount;
	    }
	    
	    public void incrementBorrowCount() {
	        borrowCount++;
	    }
}
