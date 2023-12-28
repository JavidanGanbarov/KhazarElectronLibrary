package Academic.Springer.Energy;

public class RenewableEnergy extends EnergyScience{

    @Override
    public void info_message() {
        System.out.println("As a result of global climate change, renewable energy is becoming the focus of public debate. " +
                "\nStay up to date and get a comprehensive overview of the range of renewable energy sources with our publications. " +
                "\nWell-known titles include the encyclopedias on Renewable Energy Systems and Solar Energy and the book series Green Energy and Technology. " +
                "\nFurthermore, our internationally renowned authors present and analyse sustainable energy systems such as photovoltaics, solar energy, wind and hydro power and their potential for the future.");
    }
    private String link1 = "https://www.springer.com/gp/book/9781461458623";

    public String getLink1() {
        return link1;
    }
    private String link2 = "https://www.springer.com/gp/book/9781461458050";

    public String getLink2() {
        return link2;
    }
    private String link3 = "https://www.springer.com/series/8059";

    public String getLink3() {
        return link3;
    }
}
