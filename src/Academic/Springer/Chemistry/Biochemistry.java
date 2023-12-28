package Academic.Springer.Chemistry;

public class Biochemistry extends ChemistryScience{

    @Override
    public void info_message() {
        System.out.println("Find textbooks, book series or journals in our biochemistry area. " +
                "\nThe well-stocked Springer publishing program includes both renowned reference works for teaching and research as well as current new publications, for example on molecular biology or pathobiochemistry. " +
                "\nOur first-class titles include JBIC Journal of Biological Inorganic Chemistry, Bioanalytical Reviews and the Encyclopedia of Membranes.");
    }

    private String link1 = "https://www.springer.com/journal/775";

    private String link2 = "https://www.springer.com/series/11663";

    private String link3 = "https://www.springer.com/gp/book/9783662443231#otherversion=9783662443255";

    public String getLink1() {
        return link1;
    }

    public String getLink2() {
        return link2;
    }

    public String getLink3() {
        return link3;
    }
}
