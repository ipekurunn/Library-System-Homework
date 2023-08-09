package main;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {

    private List<MediaItem> mediaItems;
    private List<Member> members;
    private List<Book> books;
    private List<MusicRecordings> musicRecordings;
    private List<Person> persons;

    public LibrarySystem() {
        mediaItems = new ArrayList<>();
        members = new ArrayList<>();
        persons = new ArrayList<>();
        books = new ArrayList<>();
        musicRecordings = new ArrayList<>();
    }

    public void addBook(String title, String Author, String genre, int borrowCount, boolean borrowStatus, String byWhom) {
        MediaItem book = new MediaItem(title, genre, "Book");
        mediaItems.add(book);
    }
    public void modifyBook(String title, String borrower) {
    	Book foundBook = Book.searchByTitle(title, books);
    	foundBook.setBorrowStatus(true);
    	foundBook.incrementBorrowCount();
    	foundBook.setByWhom(borrower);
    	int index = books.indexOf(foundBook);
    	books.set(index, foundBook);
    }

    public void addMusicRecording(String title, String Producer, String genre, int borrowCount, boolean borrowStatus, String byWhom) {
        MediaItem musicRecording = new MediaItem(title, genre, "Music Recording");
        mediaItems.add(musicRecording);
    }

    public void addMember(String name) {
        Member member = new Member(name);
        members.add(member);
    }
    
    public Member findMemberByName(String name) {
    	for (Member member : members) {
    		if (member.getName().equals(name)) {
    			return member;
    		}
    	}
    	return null;
    }
    
    public Book findBookByTitle(String title) {
    	for (Book book : books) {
    		if (book.getTitle().equals(title)) {
    			return book;
    		}
    	}
    	return null;
    }
    
    public MusicRecordings findMusicRecordingByTitle(String title) {
    	for (MusicRecordings recording : musicRecordings) {
    		if (recording.getTitle().equals(title)) {
    			return recording;
    		}
    	}
    	return null;
    }
    
    public void addBorrowRecord(String borrowerName, String itemTitle, String itemType) {
    	Member member = findMemberByName(borrowerName);
    	if (member == null) {
    		System.out.println("Member not found! Borrow record not added.");
    		return;
    	}
    	
    	if (itemType.equalsIgnoreCase("book")) {
    		Book book = findBookByTitle(itemTitle);
    		if (book == null) {
    			System.out.println("Book not found! Borrow record not added.");
    			return;
    		}
    		
    		book.setBorrowStatus(true);
    		book.setByWhom(member.getName());
    		book.incrementBorrowCount();
    		
    		System.out.println("Borrow record added successfully!");
    	}
    	else if (itemType.equalsIgnoreCase("music")) {
    		MusicRecordings musicRecording = findMusicRecordingByTitle(itemTitle);
    		if (musicRecording == null) {
    			System.out.println("Music recording not found! Borrow record not added.");
    			return;
    		}
    		
    		musicRecording.setBorrowStatus(true);
    		musicRecording.setByWhom(member.getName());
    		musicRecording.incrementBorrowCount();
    		
    		System.out.println("Borrow record added successfully!");
    	}
    	else {
    		System.out.println("Invalid item type. Borrow record not added.");
    	}
    }

    public void displayMediaItemsByGenre(String genre) {
        System.out.println("Media items in the library with genre: " + genre);
        for (MediaItem item : mediaItems) {
            if (item.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(item.getTitle() + " - " + item.getType());
            }
        }
    }
    
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + book.getGenre());
        }
    }

    public void displayMusicRecordings() {
        for (MusicRecordings musicRecording : musicRecordings) {
            System.out.println(musicRecording.getTitle() + " - " + musicRecording.getGenre());
        }
    }
     
    public void viewMostBorrowed() {
    	System.out.println("Most borrowed books:");
        List<MediaItem> mostBorrowedBooks = getMostBorrowedItems("Book");
        displayMediaItems(mostBorrowedBooks);

        System.out.println("Most borrowed music recordings:");
        List<MediaItem> mostBorrowedMusicRecordings = getMostBorrowedItems("Music Recording");
        displayMediaItems(mostBorrowedMusicRecordings);
    }
    
    private List<MediaItem> getMostBorrowedItems(String itemType) {
        List<MediaItem> mostBorrowedItems = new ArrayList<>();
        int maxBorrowCount = 0;

        for (MediaItem item : mediaItems) {
            if (item.getType().equals(itemType) && item.getBorrowCount() > maxBorrowCount) {
                maxBorrowCount = item.getBorrowCount();
            }
        }

        for (MediaItem item : mediaItems) {
            if (item.getType().equals(itemType) && item.getBorrowCount() == maxBorrowCount) {
                mostBorrowedItems.add(item);
            }
        }

        return mostBorrowedItems;
    }

    private void displayMediaItems(List<MediaItem> items) {
        for (MediaItem item : items) {
            System.out.println(item.getTitle() + " - " + item.getType());
        }
    }
    
    public void indicatePersonType(Person person) {
        //System.out.println(member.getName() + " is a " + member.getType());

        if (person.isAuthor()) {
            System.out.println(person.getNameArtist() + " is an author.");
        } else if (person.isProducer()) {
            System.out.println(person.getNameArtist() + " is a producer.");
        } else {
            System.out.println(person.getNameArtist() + "is neither an author nor a producer.");
        }
    }
    
    public Person findPersonByName(String name) {
    	for (Person person : persons) {
    		if (person.getNameArtist().equals(name)) {
    			return person;
    		}
    	}
    	return null;
    }

    public void saveDataToFile() {
        try (FileWriter writer = new FileWriter("library_data.txt")) {
            for (MediaItem item : mediaItems) {
                writer.write(item.getTitle() + "," + item.getGenre() + "," + item.getType() + "\n");
            }
            for (Member member : members) {
                writer.write(member.getName());
            }
            System.out.println("Data saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data to file: " + e.getMessage());
        }
    }

}
