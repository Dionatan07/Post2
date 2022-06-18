package entities;

public class Comment {

    private String text;

    public Comment() {
    }

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(text + "\n");
        return sb.toString();
    }
}
