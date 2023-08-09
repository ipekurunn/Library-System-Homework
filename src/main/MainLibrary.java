package main;

import java.util.ArrayList;
import java.util.List;

public class MainLibrary {	
    
	public static void buildLibrary(LibrarySystem library) {

        // Adding books to the library
		library.addBook("Nutuk", "Mustafa Kemal Atatürk", "History", 0, false, "");
		library.addBook("Sapiens", "Yuval Noah Harari", "History", 0, false, "");
		library.addBook("BirdBox", "Josh Malerman", "Horror", 0, false, "");
		library.addBook("The Shining", "Stephen King", "Horror", 0, false, "");
        library.addBook("1984","George Orwell", "Science Fiction", 0, false, "");
        library.addBook("Frankenstein", "Mary Shelley", "Science Fiction", 0, false, "");
        library.addBook("The Hunger Games", "Suzanne Collins", "Dystopian", 0, false, "");
        library.addBook("The Hanmaid's Tale", "Margaret Atwood", "Dystopian", 0, false, "");
        library.addBook("Pride and Prejudice", "Jane Austen", "Romance", 0, false, "");
        library.addBook("Anna Karenina", "Tolstoy", "Romance", 0, false, "");
        library.addBook("The Lord of the Rings", "William Golding", "Fantasy", 0, false, "");
        library.addBook("The Hobbits", "J.R.R. Tolkien", "Fantasy", 0, false, "");
        library.addBook("The Da Vinci Code","Dan Brown", "Mystery", 0, false, "");
        library.addBook("The Girl with Dragon Tattoo","Stieg Larsson", "Mystery", 0, false, "");
        library.addBook("The Alchemist", "Paulo Colho", "Advanture", 0, false, "");
        library.addBook("20,000 Leagues Under the Sea ","Jules Verne", "Advanture", 0, false, "");
        library.addBook("The Girl on the Train","Paula Hawkins", "Thriller", 0, false, "");
        library.addBook("Going Zero","Anthony McCarten", "Thriller", 0, false, "");
        library.addBook("The Little Prince", "Antonie de Saint-Exupery", "Children Novel", 0, false, "");
        library.addBook("Heart", "Edmondo De Amicis", "Children Novel", 0, false, "");

        // Adding music recordings to the library        
        library.addMusicRecording("When The Smoke is Going Down", "Scorpions", "Rock", 0, false, "");
        library.addMusicRecording("Venus","Shocking Blue", "Rock", 0, false, "");
        library.addMusicRecording("Thai Funk", "Grizzzly Panda", "Instrumental", 0, false, "");
        library.addMusicRecording("Maria Tambien", "Khruangbin", "Instrumental", 0, false, "");
        library.addMusicRecording("Home", "Adriatique", "Electronic", 0, false, "");
        library.addMusicRecording("Running to the Sea", "Röyksopp", "Electronic", 0, false, "");
        library.addMusicRecording("Allein Allein", "Innerverse", "House", 0, false, "");
        library.addMusicRecording("Something Stronger", "Hayden James", "House", 0, false, "");
        library.addMusicRecording("One Love", "Bob Marley", "Reggae", 0, false, "");
        library.addMusicRecording("Love is My Religion", "Ziggy Marley", "Reggae", 0, false, "");
        library.addMusicRecording("Borderline", "Brandy", "R&B", 0, false, "");
        library.addMusicRecording("Love Language", "Crooked Colours", "R&B", 0, false, "");
        library.addMusicRecording("Feel Good Inc.", "Gorillaz", "Pop", 0, false, "");
        library.addMusicRecording("Suddenly I See", "KT Tunstall", "Pop", 0, false, "");
        library.addMusicRecording("I'd Rather Go Blind", "Etta James", "Blues", 0, false, "");
        library.addMusicRecording("Bad News is Coming", "Luther Allison", "Blues", 0, false, "");
        library.addMusicRecording("Summertime", "Sydney Bechet", "Jazz", 0, false, "");
        library.addMusicRecording("I Got Rhythm", "Judy Garland", "Jazz", 0, false, "");
        library.addMusicRecording("Jupiter Symphony No. 41 in C Major, K. 551", "Mozart", "Classic", 0, false, "");
        library.addMusicRecording("Concerto for Two Violins in D minor", "Bach", "Classic", 0, false, "");


        // Displaying all the books in the library
        library.displayBooks();

        // Displaying all the music recordings in the library
        library.displayMusicRecordings();
    }
	
	
}
