package Academic.Springer.Chemistry;

public class AnalyticalChemistry extends ChemistryScience{

    @Override
    public void info_message() {
        System.out.println("Analytical chemistry focuses on the identification and quantification of chemical substances. " +
                "\nIn our extensive range for analytical chemistry, you will find many reference works for teaching and research. " +
                "\nThe range of books is supplemented by journals on analytical chemistry. " +
                "\nSpringer's Journal of Analytical Science and Technology is one of the most internationally influential and widely read scientific journals on analytical chemistry. " +
                "\nOther outstanding publications are the journal Analytical and Bioanalytical Chemistry and the textbook Mass Spectrometry.");
    }

    private String link1 = "https://www.springer.com/journal/40543";

    private String link2 = "https://www.springer.com/journal/216";

    private String link3 = "https://www.springer.com/gp/book/9783319543970";

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

