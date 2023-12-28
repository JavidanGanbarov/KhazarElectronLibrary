package Academic.Springer.Chemistry;

public class ElectroChemistry extends ChemistryScience{

    @Override
    public void info_message() {
        System.out.println("Springer publishes renowned journals and book series on the interdisciplinary science of electrochemistry. " +
                "\nIn our online shop, students, scientists, and specialists will find the right specialist literature. " +
                "\nThe range includes publications that convey both basic and expert knowledge, such as the Journal of Solid State Electrochemistry, the Encyclopedia of Applied Electrochemistry and the Handbook of Nanoelectrochemistry. " +
                "\nBrowse our products and take advantage of our convenient services, such as free and worldwide shipping.");
    }
    private String link1 = "https://www.springer.com/journal/10008";
    private String link2 = "https://www.springer.com/gp/book/9781441969958#otherversion=9781441969972";
    private String link3 = "https://www.springer.com/gp/book/9783319152677";

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
