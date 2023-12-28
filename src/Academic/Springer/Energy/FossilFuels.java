package Academic.Springer.Energy;

public class FossilFuels extends EnergyScience{

    @Override
    public void info_message() {
        System.out.println("Fossil fuels such as crude oil, natural gas, hard coal, lignite and peat are still the most commonly used energy sources today. " +
                "\nDue to the considerable CO2 emissions, fossil energy sources contribute to global climate change. " +
                "\nAgainst the background of the global transformation of energy systems, our publications include current analyses, case studies and critical reviews in all areas of scientific and technical research on non-renewable energies. " +
                "\nThese include the journal Natural Resources Research, Campbell's Atlas of Oil and Gas Depletion and the Handbook of Petroleum Processing.");
    }
    private String link1 = "https://www.springer.com/journal/11053";

    public String getLink1() {
        return link1;
    }
    private String link2 = "https://www.springer.com/gp/book/9781461435754";

    public String getLink2() {
        return link2;
    }
}
