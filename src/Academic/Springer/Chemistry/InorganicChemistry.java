package Academic.Springer.Chemistry;

public class InorganicChemistry extends ChemistryScience{

    @Override
    public void info_message() {
        System.out.println("Springer publishes books and journals on inorganic chemistry, which impart profound knowledge from experts in teaching and research. " +
                "\nIn contrast to organic chemistry, inorganic chemistry deals with elements that do not contain hydrocarbon compounds, including metals, salts, minerals, acids and bases, gases and other chemical compounds. " +
                "\nIn our textbooks and reference books, various elements, processes, and applications of inorganic chemistry are presented in an understandable and descriptive way. " +
                "\nThe review series Structure and Bonding and the journal Silicon are among our particularly well-known titles.");
    }

    private String link1 = "https://www.springer.com/series/430";
    private String link2 = "https://www.springer.com/journal/12633";

    public String getLink1() {
        return link1;
    }

    public String getLink2() {
        return link2;
    }
}
