package Academic.Springer.Chemistry;

public class TheoroeticalChemistry extends ChemistryScience{

    @Override
    public void info_message() {
        System.out.println("Springer offers a comprehensive selection of current books and authoritative journals on theoretical chemistry and computational chemistry. " +
                "\nOur popular reference works are basic literature for teachers, students and researchers and introduce theoretical approaches to chemistry. " +
                "\nNotable publications are the Handbook of Computational Chemistry and the series Progress in Theoretical Chemistry and Physics. " +
                "\nAll book are also available online as eBooks via the Springer Shop.");
    }
    private String link1 = "https://www.springer.com/gp/book/9783319272818";
    private String link2 = "https://www.springer.com/series/6464";

    public String getLink2() {
        return link2;
    }

    public String getLink1() {
        return link1;
    }
}
