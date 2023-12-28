package Academic.Springer.Astronomy;

public class PopularAstronomy extends AstronomyScience{

    @Override
    public void info_message() {
        System.out.println("The fascination for space research extends far beyond the borders of science and inspires laypersons and fans of astronomy all over the world. " +
                "\nIn our online shop, interested readers will find numerous popular science books on the universe and the star, including The Patrick Moore Practical Astronomy Series and Astronomers' Universe. " +
                "\nLet these beautifully illustrated books for armchair and amateur astronomers take you on an informative journey through space.");
    }

    private String link1 = "https://www.springer.com/series/3192";

    private String link2 = "https://www.springer.com/series/6960";

    public String getLink1() {
        return link1;
    }

    public String getLink2() {
        return link2;
    }
}
