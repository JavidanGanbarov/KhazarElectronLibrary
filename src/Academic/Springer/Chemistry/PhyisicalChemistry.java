package Academic.Springer.Chemistry;

public class PhyisicalChemistry extends ChemistryScience{

    @Override
    public void info_message() {
        System.out.println("Renowned authors and scientists provide information on the basics and interrelationships of physical chemistry, which alongside inorganic chemistry and organic chemistry is a classical yet complex branch of chemistry. " +
                "\nOur textbooks on physical chemistry convey basic knowledge that is accessible to non-chemists in bachelor's degree courses as well as chemistry students in their undergraduate or graduate studies. " +
                "\nIn addition, our publishing house offers current editions of workbooks and journals, such as the series Lecture Notes in Chemistry.");
    }
    private String link1 = "https://www.springer.com/series/632";

    public String getLink1() {
        return link1;
    }
}
