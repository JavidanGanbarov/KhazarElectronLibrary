package Academic.Springer.Energy;

public class PolicyEconomicsMenagment extends EnergyScience{

    @Override
    public void info_message() {
        System.out.println("Converting the energy supply of electricity, heat, and mobility to renewable energies poses major challenges for both the economy and the political sector. " +
                "\nOur books and scientific publications address these challenges and deal with energy and climate policy on a national, European and international level. " +
                "\nElectromobility as an environmentally and climate-friendly transport option is one of the current topics discussed in our publications, including the Energy Economics textbooks and the Encyclopedia on Transportation Technologies for Sustainability.");
    }
    private String link1 = "https://www.springer.com/de/book/9783662530207";

    public String getLink1() {
        return link1;
    }
    private String link2 = "https://www.springer.com/gp/book/9781461458456";

    public String getLink2() {
        return link2;
    }
}
