package Academic.ElsevierJournal;

public abstract class Elsevier {
    public String journal_name = "Elsevier.";
    public int founded_year = 1890;
    public String ceo = "Kumsal Bayazit (2019-Present)";
    public String parent = "RELX";
    public String website = "www.elsevier.com";

    public void DataBase() {
        System.out.println("Link of ScienceDirect:https://www.sciencedirect.com");
    }
    public abstract void papers_database_link();



}
