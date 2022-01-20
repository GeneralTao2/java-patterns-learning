package bridge;

public class Message {
    private String author;
    private String image;
    private String text;
    private String video;

    public Message(String author, String image, String text, String video) {
        this.author = author;
        this.image = image;
        this.text = text;
        this.video = video;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
