package Academic.Springer.Astronomy;

import Academic.Springer.Astronomy.AstronomyScience;

public class AstronomyAstrophysics extends AstronomyScience {

    @Override
    public void info_message() {
        System.out.println("As a branch of astronomy, astrophysics explores the physical foundations of astronomical events, while cosmology involves studies into the origin and evolution of the universe. " +
                "\nOn our page, you will find a comprehensive collection of well-known journals, books and book series for students, teachers, researchers and interested readers. " +
                "\nOur well-known titles include Living Reviews in Relativity and the Astronomy and Astrophysics Library.");
    }

    private String link1 = "https://www.springer.com/journal/41114";

    private String link2 = "https://www.springer.com/series/848";


    public String getLink1() {
        return link1;
    }

    public String getLink2() {
        return link2;
    }

}
