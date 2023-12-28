package Academic.Springer.Energy;

public class NuclearEnergy extends EnergyScience{

    @Override
    public void info_message() {
        System.out.println("What is nuclear energy? " +
                "\nHow do nuclear power stations work? " +
                "\nAnd which risks are involved? Our books provide the fundamentals for understanding nuclear energy and power plant technology. " +
                "\nThey are suitable as textbooks for students and serve as reference works for professional practice. " +
                "\nIn addition to imparting physical and technical construction knowledge, the topics of safety, risks, and disposal are also critically considered and controversially discussed in many publications. " +
                "\nNoteworthy publications include the Handbook of Nuclear Engineering, the Nuclear Energy Encyclopedia and the textbook Nuclear Fusion.");
    }
    private String link1 = "https://www.springer.com/gp/book/9780387981505";

    public String getLink1() {
        return link1;
    }
    private String link2 = "https://www.springer.com/gp/book/9781493966172";

    public String getLink2() {
        return link2;
    }
    private String link3 = "https://www.springer.com/gp/book/9783319981703";

    public String getLink3() {
        return link3;
    }
}
