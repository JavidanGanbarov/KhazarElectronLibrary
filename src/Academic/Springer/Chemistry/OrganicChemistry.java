package Academic.Springer.Chemistry;

public class OrganicChemistry extends ChemistryScience{

    @Override
    public void info_message() {
        System.out.println("Get quickly up to date on the latest scientific developments with our selected books and journals on organic chemistry. " +
                "\nAt Springer, scientists, researchers, and students will find all relevant publications and reference works as well as the latest research literature for exam preparation. " +
                "\nParticularly well-known titles are the reference work Polysaccharides, the textbooks Advanced Organic Chemistry A & B and the leading journal Cellulose. Our traditional book portfolio is expanded by a wide range of online materials, which learners at all levels can use to easily deepen their knowledge of organic chemistry.");
    }
    private String link1 = "https://www.springer.com/gp/book/9783319162973";
    private String link2 = "https://www.springer.com/journal/10570";

    public String getLink1() {
        return link1;
    }

    public String getLink2() {
        return link2;
    }
}
