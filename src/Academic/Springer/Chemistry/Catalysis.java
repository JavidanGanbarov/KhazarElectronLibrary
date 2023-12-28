package Academic.Springer.Chemistry;

public class Catalysis extends ChemistryScience {

    @Override
    public void info_message() {
        System.out.println("Springer publishes current research results, journals, books and other publications on the special field of catalysis within chemistry. " +
                "\nHere you will find accessible book series and journals for teachers, researchers and interested readers from the industry." +
                "\nChoose from our catalysis textbooks, professional books and the latest monographs on the subject. " +
                "\nOur major titles include Catalysis Letters and the book series Fundamental and Applied Catalysis. " +
                "\nAll Catalysis titles are available as hardcover and eBooks for direct download.");
    }

    private String link1 = "https://www.springer.com/journal/10562";
    private String link2 = "https://www.springer.com/series/5964";

    public String getLink1() {
        return link1;
    }

    public String getLink2() {
        return link2;
    }
}
