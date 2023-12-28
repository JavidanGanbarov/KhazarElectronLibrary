package Academic.Springer.Energy;

public class EnergyEfficiency extends EnergyScience{

    @Override
    public void info_message() {
        System.out.println("Our books and journals on energy efficiency focus on the international energy sector. " +
                "\nIn addition to energy efficiency, they place particular emphasis on questions of security of energy supply and pricing. " +
                "\nThe authors - experienced researchers and experts from the energy sector - analyse the current situation in the energy industry and point out possible trends. " +
                "\nParticularly noteworthy publications include the journal Energy Efficiency, the Handbook of Energy Systems in Green Buildings, but also textbooks and proceedings.");
    }
    private String link1 = "https://www.springer.com/journal/12053";
    private String link2 = "https://www.springer.com/gp/book/9783662491195";

    public String getLink2() {
        return link2;
    }

    public String getLink1() {
        return link1;
    }
}
