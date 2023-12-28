package Academic.Springer.Chemistry;

public class Biotechnology extends ChemistryScience{

    @Override
    public void info_message() {
        System.out.println("Our publishing house offers a wide range of books and journals on the latest developments in biotechnology. " +
                "\nWe cover numerous sub-disciplines of biotechnology: from molecular biotechnology to medical biotechnology, industrial biotechnology, and white biotechnology. " +
                "\nHighlights include the World Journal of Microbiology and Biotechnology and Springer Handbook of Marine Biotechnology. " +
                "\nIn addition to scientific publications, the Springer biotechnology publishing program also offers suitable literature for beginners and undergraduate students.");
    }

    private String link1 = "https://www.springer.com/journal/11274";
    private String link2 = "https://www.springer.com/gp/book/9783642539701";

    public String getLink1() {
        return link1;
    }

    public String getLink2() {
        return link2;
    }
}
