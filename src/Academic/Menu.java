package Academic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    public static void welcome_message() {
        System.out.println("*****Welcome to Khazar Academic Library!*****");
    }

    public static void info_message() {
        System.out.println("*************************************************************" +
                "\nBy using this library you will gain access to academic articles from publishers such as Elsevier, Nature, Springer." +
                "\nYou can read and review them, download them from their websites, or add them to your favourites so that you can easily find them later." +
                "\nWe wish you good research in advance!" +
                "\n**************************************************************");
    }

    public static void main_menu() {
        System.out.println("Main menu:\n1:Collections." +
                "\n2:Information about academic publishing companies and journals." +
                "\n3:Information about Khazar Library." +
                "\n4:Information about Khazar University" +
                "\nPlease choose one of them.(1-4)");

        try {
            System.out.println("Your choice:");
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    journal_collections_menu();
                    break;
                case 2:
                    info_publishing_menu();
                    break;
                case 3:
                    Information.info_message_khazar_library();
                    break;
                case 4:
                    Information.info_message_khazar_university();
                    break;
                default:
                    System.out.println("Enter number in 1-4 interval.");
                    main_menu();
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter integer number.");
            sc.nextLine();
            main_menu();
        }
    }

    public static void journal_collections_menu() {
        try {
            System.out.println("1:Elsevier\n2:Springer\n3:Back to menu");
            System.out.println("Choose one of them: ");

            int journal = sc.nextInt();


            switch (journal) {
                case 1:
                    subject_choice_elsevier();
                    break;
                case 2:
                    subject_choice_springer();
                    break;
                case 3:
                    main_menu();
                    break;
                default:
                    System.out.println("Please enter number in 1-3 interval.");
                    journal_collections_menu();
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter integer number.");
            sc.nextLine();
            journal_collections_menu();
        }
    }

    public static void info_publishing_menu() {
        try {
            System.out.println("Choose publishing company:");
            System.out.println("1:Elsevier.");
            System.out.println("2:Springer.");
            System.out.println("3:Back main menu");
            int infocompany = sc.nextInt();
            switch (infocompany) {
                case 1:
                    Information.info_message_elsevier();
                    break;
                case 2:
                    Information.info_message_springer();
                    break;
                case 3:
                    main_menu();
                    break;
                default:
                    System.out.println("Enter integer in 1-2 interval.");
                    info_publishing_menu();
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter Integer number.");
            sc.nextLine();
            info_publishing_menu();
        }
    }

    public static void subject_choice_elsevier() {
        System.out.println("We have many scientific papers from different journals from these three subjects:" +
                "\n1:Engineering." +
                "\n2:Life Science." +
                "\n3:Physical Engineering.");
        System.out.println("Choose subject:");
        try {
            int subjectnumelsevier = sc.nextInt();
            switch (subjectnumelsevier) {
                case 1:
                    Methods.engineering_elsevier_papers();
                    break;
                case 2:
                    Methods.life_science_elsevier_papers();
                    break;
                case 3:
                    Methods.physical_science_elsevier_papers();
                    break;
                default:
                    System.out.println("Enter number in this interval:1-3");
                    subject_choice_elsevier();
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter integer number.");
            sc.nextLine();
            subject_choice_elsevier();
        }
    }

    public static void subject_choice_springer() {
        System.out.println("There are many subjects from Springer." +
                "\n1:Astronomy." +
                "\n2:Chemistry." +
                "\n3:Energy");
        System.out.println("Choose subject:");
        int subjectnumspringer = sc.nextInt();
        try {
            switch (subjectnumspringer) {
                case 1:
                    Methods.astronomy_springer_subjects();
                    break;
                case 2:
                    Methods.chemistry_springer_subjects();
                    break;
                case 3:
                    Methods.energy_springer_subjects();
                    break;
                default:
                    System.out.println("Enter number between 1-3");
                    subject_choice_springer();
        }
        } catch (InputMismatchException e) {
            System.out.println("Enter integer number.");
            sc.nextLine();
            subject_choice_springer();
        }
    }
}


