package Academic.Elsevier;

public class PhysicalScience extends Elsevier{
    private String ID;
    private String Journal_Name;
    private String title;
    private String author;

    private String link;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJournal_Name() {
        return Journal_Name;
    }

    public void setJournal_Name(String journal_Name) {
        Journal_Name = journal_Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public void papers_database_link() {
        System.out.println("Physical Science papers that at ScienceDirect link :https://www.sciencedirect.com/journal/physical-mesomechanics");
    }
}
