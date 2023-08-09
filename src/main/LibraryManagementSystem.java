package main;

import java.util.Scanner;
import main.LibrarySystem;

public class LibraryManagementSystem {
	
    private static LibrarySystem LibrarySystem = new LibrarySystem();
    private static Scanner scanner;
    
    public static void main(String[] args) {
    	
    	//MainLibrary.buildLibrary(LibrarySystem);
    	
    	scanner = new Scanner(System.in);
    	
    	MainLibrary.buildLibrary(LibrarySystem);
    	
    	int choice;

        while (true) {
        	System.out.println("______________________________________________________________");
            System.out.println("|MENU|");
            System.out.println("1. Add new book to the library system");
            System.out.println("2. Add a new music recording to the library system");
            System.out.println("3. Add new member to the library system");
            System.out.println("4. Add borrow record");
            System.out.println("5. Display all media items in the library for a given genre");
            System.out.println("6. View the most borrowed books and music recordings");
            System.out.println("7. Indicate whether a given person is an author or a producer");
            System.out.println("8. Save all new media items and members to a text file");       
            System.out.println("______________________________________________________________");        
            
            scanner = new Scanner(System.in);
            
            if (scanner.hasNextLine()) {
            	choice = scanner.nextInt();
            	if (choice >=0 && choice <=8) {
            		switch (choice) {
            		case 0:
            			System.out.println("Exiting...");
						System.out.println("Goodbye!");
						System.exit(0);
                    case 1:
                        System.out.println("Enter the title of the book:");
                        scanner.nextLine();
                        String bookTitle = scanner.nextLine();
                        
                        System.out.println("Enter the genre of the book: ");
                        scanner.nextLine();
                        String bookGenre = scanner.nextLine();
                        
                        System.out.println("Enter the author of the book: ");
                        scanner.nextLine();
                        String bookAuthor = scanner.nextLine();
                        LibrarySystem.addBook(bookTitle, bookAuthor, bookGenre, 0, false, "");
                        System.out.println("Book added successfully!");
                        break;
                    case 2:
                        System.out.println("Enter the title of the music recording:");
                        scanner.nextLine();
                        String musicTitle = scanner.nextLine();
                        
                        System.out.println("Enter the genre of the music recording:");
                        scanner.nextLine();
                        String musicGenre = scanner.nextLine();
                        
                        System.out.println("Enter the producer of the music recording: ");
                        scanner.nextLine();
                        String musicProducer = scanner.nextLine();
                        LibrarySystem.addMusicRecording(musicTitle, musicProducer, musicGenre, 0, false, "");
                        System.out.println("Music recording added successfully!");
                        break;
                    case 3:
                        System.out.println("Enter the name of the member:");
                        scanner.nextLine();
                        String memberName = scanner.nextLine();
                        LibrarySystem.addMember(memberName);
                        System.out.println("Member added successfully!");
                        break;
                    case 4:
                    	System.out.println("Enter the member name: ");
                    	scanner.nextLine();
                    	String borrowerName = scanner.nextLine();
                    	
                    	System.out.println("Enter 'book' to borrow book\n or\n Enter 'music' to borrow music recording.");
                    	String itemType = scanner.nextLine();
                    	
                    	System.out.println("Enter the item's title: ");
                    	String itemTitle = scanner.nextLine();
                    	
                    	if (itemType.equalsIgnoreCase("book")) {
                    		LibrarySystem.addBorrowRecord(borrowerName,  itemTitle,  "book");
                    	}
                    	else if (itemType.equalsIgnoreCase("music")) {
                    		LibrarySystem.addBorrowRecord(borrowerName, itemTitle, "music");
                    	}
                    	else {
                    		System.out.println("Invalid item type! Borrow record not added.");
                    	}
                    	break;  
                    case 5:
                        System.out.println("Enter the genre to display media items:");
                        String genre = scanner.nextLine();
                        LibrarySystem.displayMediaItemsByGenre(genre);
                        break;
                    case 6:
                        LibrarySystem.viewMostBorrowed();
                        break;
                    case 7:
                        System.out.println("Enter the name of the person:");
                        scanner.nextLine();
                        String personName = scanner.nextLine();
                        
                        Person person = LibrarySystem.findPersonByName(personName);
                        if (person != null) {
                        	LibrarySystem.indicatePersonType(person);
                        }
                        else {
                        	System.out.println("Person not found!");
                        }
                        break;  
                    case 8:
                        LibrarySystem.saveDataToFile();
                        break;
            	}
            }
            	else {
            		System.out.println("\nPlease enter a valid value!");
            		System.out.println("");
            	}
            }
            
            else {
            	System.out.println("\nPlease enter a valid value!");
            }
                 
        }
    }
}
