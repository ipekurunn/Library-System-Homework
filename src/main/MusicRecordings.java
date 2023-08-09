package main;
import java.util.List;


public class MusicRecordings {
	
    private String title;
    private String genre;
    private int borrowCount;
    private boolean borrowStatus;
    private String byWhom;

    public MusicRecordings(String title, String genre, int borrowCount, boolean borrowStatus, String byWhom) {
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
    public static MusicRecordings searchByTitle(String title, List<MusicRecordings> musicRecordingList) {
        for (MusicRecordings musicRecording : musicRecordingList) {
            if (musicRecording.getTitle().equals(title)) {
            	return musicRecording;
            }
        }
        MusicRecordings defmusicRecording = musicRecordingList.get(0) ;
        return defmusicRecording;
        
    }
    public void incrementBorrowCount() {
        borrowCount++;
    }
    
}
