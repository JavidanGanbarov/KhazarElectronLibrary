package Academic.Springer.Astronomy;

public class AstroBiology extends AstronomyScience{

    @Override
    public void info_message() {
        System.out.println("Theories and scientific findings on the origin and development of life forms in space form the basis of astrobiology, whereas planetary sciences study the planets, moons and planetary systems as well as the processes that form them. " +
                "\nThe specialist literature on these fields published by Springer reflect their interdisciplinarity and offers a wide range of titles including our well-known Encyclopedia of Astrobiology, Living Reviews in Solar Physics and the series Advances in Astrobiology and Biogeophysics.");
    }

    private String link1 = "https://www.springer.com/de/book/9783642112744";

    private String link2 = "https://www.springer.com/journal/41116";

    private String link3 = "https://www.springer.com/series/5118";

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
