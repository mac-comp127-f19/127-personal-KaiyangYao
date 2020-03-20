package D1007_libraryMediaInterface;

public class Video implements Media {

    private String title;
    private String director;
    private int totalCopies;
    private int currentCopies;

    public Video(String title, String director, int numOfCopies) {
        this.title = title;
        this.director = director;
        this.totalCopies = numOfCopies;
        this.currentCopies = numOfCopies;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String toString() {
        return this.title + " conducted by " + this.director + "\n Has " + this.currentCopies + " right now.";
    }

    @Override
    public boolean checkOut() {
        if (currentCopies >= 1) {
            currentCopies -= 1;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkIn() {
        if (currentCopies < totalCopies) {
            currentCopies += 1;
            return true;
        } else {
            return false;
        }
    }
}
