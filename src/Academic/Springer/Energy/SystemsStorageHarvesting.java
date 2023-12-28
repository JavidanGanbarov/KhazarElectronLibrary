package Academic.Springer.Energy;

public class SystemsStorageHarvesting extends EnergyScience{

    @Override
    public void info_message() {
        System.out.println("With the growing share of renewable energies in the energy supply, energy storage for electricity and heat is becoming increasingly important. " +
                "\nRenewable energy storage systems are an important building block for a sustainable energy system and thus for the success of the energy revolution. " +
                "\nOur books and professional papers give an overview of the latest developments from research and practice. " +
                "\nThe central question here is in which form of energy and with which technology electricity and heat can be efficiently generated and stored in the future. " +
                "\nWell-known publications include the book series Energy Systems and the Renewable Energy Systems encyclopedia.");
    }
    private String link1 = "https://www.springer.com/series/8368";

    public String getLink1() {
        return link1;
    }
    private String link2 = "https://www.springer.com/gp/book/9781461458623";

    public String getLink2() {
        return link2;
    }
}
