package Academic.Springer;

import Academic.Academic;

public abstract class Springer extends Academic {
    public String publishing_company = "Springer";
    public String founded_year = "10 May, 1842";
    public String founder = "Julius Springer";
    public String country = "Germany";
    public String website = "Website link:www.springer.com";

    public String booksellers = "https://www.springernature.com/gp/booksellers";

    public String subject_link = "https://www.springer.com/gp/subjects";

    public String shop = "https://link.springer.com/shop/springer/titles/en-eu/";

    public abstract void info_message();
}
