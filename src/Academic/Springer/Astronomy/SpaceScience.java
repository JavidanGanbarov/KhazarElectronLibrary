package Academic.Springer.Astronomy;

public class SpaceScience extends AstronomyScience{

    @Override
    public void info_message() {
        System.out.println("Springer publishes current research results, journals, books and other publications on space sciences and extraterrestrial physics. " +
                "\nThe physical properties of other stars and planets open up an exciting field of research for astronomers. "+
                "\nIn addition to researchers, students and lecturers will find what they are looking for in the numerous book and journal publications in this field. " +
                "\nOur well-known titles include Space Science Reviews, Solar Physics, Living Reviews in Solar Physics and the Astrophysics and Space Science Library.");
    }

    private String link1 = "https://www.springer.com/journal/11214";
    private String link2 = "https://www.springer.com/journal/11207";
    private String link3 = "https://www.springer.com/journal/41116";
    private String link4 = "https://www.springer.com/series/5664";


    public String getLink1() {
        return link1;
    }

    public String getLink2() {
        return link2;
    }

    public String getLink3() {
        return link3;
    }

    public String getLink4() {
        return link4;
    }
}
