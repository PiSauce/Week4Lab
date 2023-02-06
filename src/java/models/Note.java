package models;

import java.io.Serializable;

public class Note implements Serializable{
    private String title;
    private String contents;

    public Note() { //TODO: I{nitialize with contents of note.txt
        title = "";
        contents = "";
    }

    public Note(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
