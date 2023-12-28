package Academic.Springer.Chemistry;

public class ChemicalEngineering extends ChemistryScience{

    @Override
        public void info_message() {
        System.out.println("At Springer you can find more than 300 books and journals in the fields of Industrial Chemistry & Chemical Engineering, from which you can choose the most suitable and up-to-date titles for your specialist or research interests. " +
                "\nOur publications include the Green Chemistry and Sustainable Technology series and the well-known Handbook of Nuclear Chemistry. " +
                "\nThese are just a few examples of the numerous special fields in which our specialist books, manuals and monographs present detailed knowledge and application examples of chemical engineering and process engineering to a wide readership in an understandable way.");
    }
    private String link1 = "https://www.springer.com/series/11661";
    private String link2 = "https://www.springer.com/gp/book/9781441907219";

    public String getLink1() {
        return link1;
    }

    public String getLink2() {
        return link2;
    }
}
