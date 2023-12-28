package Academic;

import Academic.Elsevier.Engineering;
import Academic.Springer.Astronomy.PopularAstronomy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Information {

    static Scanner sc = new Scanner(System.in);

    public static void info_message_elsevier() {

        try {
        Engineering info = new Engineering();

        System.out.println("Elsevier is a global information analytics company specializing in science, health, and technology research. " +
                "\nIt's one of the largest and most prominent publishers of scientific, technical, and medical literature globally.");
        System.out.println("Publishing company name:" + info.publishing_company);
        System.out.println("Elsevier founded year:" + info.founded_year);
        System.out.println("Current CEO of Elsevier is:" + info.ceo);
        System.out.println("Parent company:" + info.parent);
        System.out.println("Official website link:" + info.website);
        info.DataBase();
        info.popular_articles();
        info.recent_articles();

        System.out.println("For backing main menu enter 0");
        int back = sc.nextInt();
            switch (back) {
                case 0:
                    Menu.main_menu();
                    break;
                default:
                    System.out.println("Enter number 0.");
                    info_message_elsevier();
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter Integer number.");
            sc.nextLine();
            info_message_elsevier();
        }
    }

    public static void info_message_springer() {

        PopularAstronomy info = new PopularAstronomy();

        System.out.println("\n" +
                "Springer is a well-known global publishing company that primarily focuses on academic publications, especially in the fields of science, technology, engineering, mathematics (STEM), and medicine. " +
                "\nIt's one of the largest publishers of scientific journals and books worldwide.");
        System.out.println("Publishing company name:" + info.publishing_company);
        System.out.println("Springer founded year is: " + info.founded_year);
        System.out.println("Founder of Springer is: " + info.founder);
        System.out.println("Country: " + info.country);
        System.out.println("Website of Springer: " + info.website);
        System.out.println("Booksellers of Springer: " + info.booksellers);
        System.out.println("You can check subjects here: " + info.subject_link);
        System.out.println("Shop link of the Springer: " + info.shop);

        System.out.println("For backing main menu enter 0");
        int back = sc.nextInt();
        try {
            switch (back) {
                case 0:
                    Menu.main_menu();
                    break;
                default:
                    System.out.println("Enter number 0 for backing main menu.");
                    info_message_springer();
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter Integer number.");
            sc.nextLine();
            info_message_springer();
        }
    }

    public static void info_message_khazar_library() {
        System.out.println("Website link: https://khazar.org/en/item/1187");
        System.out.println("Welcome to the Khazar University Library & Information Center (LIC)!");
        System.out.println("**************************************************************************************");
        System.out.println("LIC provides myriad services, technologies, and spaces central to and in support of the educational mission of the Khazar University.");
        System.out.println("Top Ten Things to Know About Your Library:" +
                "\n10:Take the video tour below of LIC website homepage – it’s filled with various resources and spaces!" +
                "\n9:Your Khazar University ID card is your library card. Use it to check out books, DVDs and other materials from the Library." +
                "\n8:The Library is open 61 hours a week, Including Saturday." +
                "\n7:Readings assigned for your classes will be placed on electronic Course Reserves, available 24/7!" +
                "\n6:You are responsible for ensuring that he or she uses electronic products solely for noncommercial, educational, scholarly or research use." +
                "\n5:If you need study space, there are a quiet places in the Library, but if you are working on a group project, reserve a collaboration room." +
                "\n4:The Library has three remote branches: The Downtown Campus Library, Dunya School Library and Sumqayit Dunya School Library." +
                "\n3:Access e-books, e-journals and e-newspapers and, research databases 24/7 from anywhere! Plus we have thousands of print books and DVDs, and rare books and archival material, too. Just search for it in OPAC and DSpace." +
                "\n2:Can’t find the resource you need?. Alternatively, our Interlibrary Loan Services (ILLS) help you to order books and journals articles for you from other libraries." +
                "\n1:Need help with your research? All of our libraries have a full-time staff member who you can contact directly with questions. Feel free to call or email your library for assistance on your research-based assignments");
        System.out.println("*********************************************************************************************");
        System.out.println("For backing main menu enter 0");
        int back = sc.nextInt();
        try {
            switch (back) {
                case 0:
                    Menu.main_menu();
                    break;
                default:
                    System.out.println("Enter number 0 for backing main menu.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter Integer number.");
            sc.nextLine();
            info_message_khazar_library();
        }
    }
        public static void info_message_khazar_university() {
            System.out.println("Always leading the way!");
            System.out.println("*******************************************");
            System.out.println("Khazar University is a private educational institution for undergraduate, graduate and professional studies promoting advanced study and research, educational policy and development in the Republic of Azerbaijan.");
            System.out.println("Khazar University is the first University in Azerbaijan composed of multiple independent schools united by the same academic policy and principles, which offer a wide scope of diverse majors in Arts, Humanities and Social Sciences, Architecture, Engineering and Applied Sciences, Economics, Management and Business Administration, Education. ");
            System.out.println("Khazar also one of the leading universities in Azerbaijan in terms of its relations with industry. ");
            System.out.println("Today the University has established effective relations with the leading local and international companies. ");
            System.out.println("Professors of Khazar have earned recognition and leadership in their professional fields or are business leaders, artists and lawyers with national and international reputations. ");
            System.out.println("Graduate studies including Professional, Ph.D., Master programs and the most extensive MBA program in Azerbaijan have an important place in the University's education profile. ");
            System.out.println("*******************************************************************************8");
            System.out.println("For backing main menu enter 0");

            int back3 = sc.nextInt();
            try {
                switch (back3) {
                    case 0:
                        Menu.main_menu();
                        break;
                    default:
                        System.out.println("Enter number 0");
                        info_message_khazar_university();
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter Integer number.");
                sc.nextLine();
                info_message_khazar_university();
            }
        }
    }

