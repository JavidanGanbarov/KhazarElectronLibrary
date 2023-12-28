package Academic.Elsevier;

import Academic.Academic;

public abstract class Elsevier extends Academic {
    public String publishing_company = "Elsevier";
    public int founded_year = 1890;
    public String ceo = "Kumsal Bayazit (2019-Present)";
    public String parent = "RELX";
    public String website = "Website link:www.elsevier.com";

    public void DataBase() {
        System.out.println("Link of ScienceDirect:https://www.sciencedirect.com");
    }
    public abstract void papers_database_link();

    public void popular_articles() {
        System.out.println("Some popular articles now:https://www.sciencedirect.com/science/article/pii/S2090123221001491, https://www.sciencedirect.com/science/article/pii/S1878535217300990");
    }
    public void recent_articles() {
        System.out.println("Recent publications today:Acta Biomaterialia, Ore Geology Reviews, Journal of Bioscience and Bioengineering");
    }



}
