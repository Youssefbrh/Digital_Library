package Model;

public class Media {
    private String title,Author,description;
    private int score,copies;

    public Media(String title, String author, String description, int score, int copies) {
        this.title = title;
        this.Author = author;
        this.description = description;
        this.score = score;
        this.copies = copies;
    }

    public Media(String[] attributes) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}
