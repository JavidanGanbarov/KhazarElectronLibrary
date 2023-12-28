package Academic.Elsevier;
import java.util.Scanner;

public class Engineering extends Elsevier {
    Scanner sc = new Scanner(System.in);
    private String ID;
    private String Journal_Name;
    private String title;
    private String author;

    private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getJournal_Name() {
        return Journal_Name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setJournal_Name(String journal_Name) {
        Journal_Name = journal_Name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void papers_database_link() {
        System.out.println("Engineering papers that at ScienceDirect link :https://www.sciencedirect.com/journal/engineering");
    }
}
