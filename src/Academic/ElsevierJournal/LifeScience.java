package Academic.ElsevierJournal;

public class LifeScience extends Elsevier{
    private Integer ID;
    private String Journal_Name;
    private String title;
    private String author;

    public Integer getID() {
        return ID;
    }

    public String getJournal_Name() {
        return Journal_Name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setJournal_Name(String journal_Name) {
        Journal_Name = journal_Name;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Override
    public void papers_database_link() {
        System.out.println("Life Sciences papers that at ScienceDirect link :https://www.sciencedirect.com/journal/life-sciences");
    }
}
