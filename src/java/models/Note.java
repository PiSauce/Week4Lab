package models;

public class Note {
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
    
    
}
