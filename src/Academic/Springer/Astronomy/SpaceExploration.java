package Academic.Springer.Astronomy;

public class SpaceExploration extends AstronomyScience{

    @Override
    public void info_message() {
        System.out.println("Our books in the discipline Space Exploration & Astronautics illuminate insights from both a historical and a technical perspective. " +
                "\nExperts, scientists, and students will find numerous titles on space probes, space stations, satellites and telescopes as well as publications with the latest research results from space travel at Springer. \n" +
                "Our publications include the book series Space Exploration, Space and Society and The Journal of the Astronautical Sciences.");
    }

    private String link1 = "https://www.springer.com/series/4138";
    private String link2 = "https://www.springer.com/series/11929";
    private String link3 = "https://www.springer.com/journal/40295";

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
