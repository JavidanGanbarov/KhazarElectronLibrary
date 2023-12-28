package Academic.Springer.Chemistry;

public class PolymerScience extends ChemistryScience{

    @Override
    public void info_message() {
        System.out.println("Springer is the first address when it comes to books or journals on polymer science or macromolecular chemistry. " +
                "\nOur range includes all important publications by renowned scientists and industry leaders. " +
                "\nIn addition to textbooks for chemists, physicists, materials scientists and process engineers, we offer introductory books for students and specialist literature for a broader readership. " +
                "\nWell-known publications include the Chinese Journal of Polymer Science, the Encyclopedia of Polymeric Nanomaterials and the series Advances in Polymer Science.");
    }
    private String link1 = "https://www.springer.com/journal/10118";
    private String link2 = "https://www.springer.com/gp/book/9783642296499";
    private String link3 = "https://www.springer.com/series/12";

    public String getLink1() {
        return link1;
    }

    public String getLink3() {
        return link3;
    }

    public String getLink2() {
        return link2;
    }
}
