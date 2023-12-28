package Academic;

import Academic.Elsevier.*;
import Academic.Springer.Astronomy.*;
import Academic.Springer.Chemistry.*;
import Academic.Springer.Energy.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Methods {
    static Scanner sc = new Scanner(System.in);


    public static void engineering_elsevier_papers() {

        Engineering engineeringelsevier1 = new Engineering();
        Engineering engineeringelsevier2 = new Engineering();
        Engineering engineeringelsevier3 = new Engineering();
        Engineering engineeringelsevier4 = new Engineering();
        Engineering engineeringelsevier5 = new Engineering();

        System.out.println("Database for Engineering journals link:");
        engineeringelsevier1.papers_database_link();

        System.out.println("Engineering journals:" +
                "\n1:Advanced Cement Based Materials." +
                "\n2:Construction and Building Materials.");
        System.out.println("Choose journal name:");
        int engineeringjournalelsevier = sc.nextInt();

        if (engineeringjournalelsevier == 1) {
            Map<String, String> engineeringjour1 = new HashMap<>();

            try {
                BufferedReader engjournal1 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\Engineering\\AdvancedCementBasedMaterials\\0001.txt"));
                String line;

                while ((line = engjournal1.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        engineeringjour1.put(key, value);
                    }
                }
                String id = engineeringjour1.get("ID");
                String title = engineeringjour1.get("Title");
                String author = engineeringjour1.get("Author");
                String link = engineeringjour1.get("Link");
                engineeringelsevier1.setID(id);
                engineeringelsevier1.setTitle(title);
                engineeringelsevier1.setAuthor(author);
                engineeringelsevier1.setLink(link);

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                BufferedReader engjournal1 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\Engineering\\AdvancedCementBasedMaterials\\0002.txt"));
                String line;

                while ((line = engjournal1.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        engineeringjour1.put(key, value);
                    }
                }
                String id = engineeringjour1.get("ID");
                String title = engineeringjour1.get("Title");
                String author = engineeringjour1.get("Author");
                String link = engineeringjour1.get("Link");
                engineeringelsevier2.setID(id);
                engineeringelsevier2.setTitle(title);
                engineeringelsevier2.setAuthor(author);
                engineeringelsevier2.setLink(link);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("\nPaper 1:");
            System.out.println("ID:" + engineeringelsevier1.getID());
            System.out.println("Title:" + engineeringelsevier1.getTitle());
            System.out.println("Author" + engineeringelsevier1.getAuthor());
            System.out.println("You can read this article here: " + engineeringelsevier1.getLink());

            System.out.println("\nPaper 2:");
            System.out.println("ID:" + engineeringelsevier2.getID());
            System.out.println("Title:" + engineeringelsevier2.getTitle());
            System.out.println("Author" + engineeringelsevier2.getAuthor());
            System.out.println("You can read this article here: " + engineeringelsevier2.getLink());

            System.out.println("****************************************************************");

        } else if (engineeringjournalelsevier == 2) {
            Map<String, String> engineeringjour2 = new HashMap<>();

            try {
                BufferedReader engjournal2 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\Engineering\\ConstructionAndBuildingMaterials\\0003.txt"));
                String line;

                while ((line = engjournal2.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        engineeringjour2.put(key, value);
                    }
                }
                String id = engineeringjour2.get("ID");
                String title = engineeringjour2.get("Title");
                String author = engineeringjour2.get("Author");
                String link = engineeringjour2.get("Link");
                engineeringelsevier3.setID(id);
                engineeringelsevier3.setTitle(title);
                engineeringelsevier3.setAuthor(author);
                engineeringelsevier3.setLink(link);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                BufferedReader engjournal2 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\Engineering\\ConstructionAndBuildingMaterials\\0004.txt"));
                String line;

                while ((line = engjournal2.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        engineeringjour2.put(key, value);
                    }
                }
                String id = engineeringjour2.get("ID");
                String title = engineeringjour2.get("Title");
                String author = engineeringjour2.get("Author");
                String link = engineeringjour2.get("Link");
                engineeringelsevier4.setID(id);
                engineeringelsevier4.setTitle(title);
                engineeringelsevier4.setAuthor(author);
                engineeringelsevier4.setLink(link);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                BufferedReader engjournal2 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\Engineering\\ConstructionAndBuildingMaterials\\0005.txt"));
                String line;

                while ((line = engjournal2.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        engineeringjour2.put(key, value);
                    }
                }


                String id = engineeringjour2.get("ID");
                String title = engineeringjour2.get("Title");
                String author = engineeringjour2.get("Author");
                String link = engineeringjour2.get("Link");


                engineeringelsevier5.setID(id);
                engineeringelsevier5.setTitle(title);
                engineeringelsevier5.setAuthor(author);
                engineeringelsevier5.setLink(link);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("\nPaper 3:");
            System.out.println("ID:" + engineeringelsevier3.getID());
            System.out.println("Title:" + engineeringelsevier3.getTitle());
            System.out.println("Author" + engineeringelsevier3.getAuthor());
            System.out.println("You can read this article here: " + engineeringelsevier4.getLink());

            System.out.println("\nPaper 4:");
            System.out.println("ID:" + engineeringelsevier4.getID());
            System.out.println("Title:" + engineeringelsevier4.getTitle());
            System.out.println("Author" + engineeringelsevier4.getAuthor());
            System.out.println("You can read this article here: " + engineeringelsevier4.getLink());

            System.out.println("\nPaper 5:");
            System.out.println("ID:" + engineeringelsevier5.getID());
            System.out.println("Title:" + engineeringelsevier5.getTitle());
            System.out.println("Author" + engineeringelsevier5.getAuthor());
            System.out.println("You can read this article here: " + engineeringelsevier5.getLink());

        }
    }

    public static void life_science_elsevier_papers() {

        LifeScience lifescienceelsevier1 = new LifeScience();
        LifeScience lifescienceelsevier2 = new LifeScience();
        LifeScience lifescienceelsevier3 = new LifeScience();
        LifeScience lifescienceelsevier4 = new LifeScience();
        LifeScience lifescienceelsevier5 = new LifeScience();
        LifeScience lifescienceelsevier6 = new LifeScience();

        System.out.println("Database for Engineering journals link:");
        lifescienceelsevier1.papers_database_link();

        System.out.println("Life Science journals:" +
                "\n1:Cortex." +
                "\n2:Experimential Neurology." +
                "\n3:Advances in Biological and Medical Physics");
        System.out.println("Choose journal name:");

        int life_science_journal_elsevier = sc.nextInt();

        if (life_science_journal_elsevier == 1) {

            Map<String, String> lifesciencejour1 = new HashMap<>();

            try {
                BufferedReader lifescience1 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\LifeScience\\Cortex\\0011.txt"));
                String line;

                while ((line = lifescience1.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        lifesciencejour1.put(key, value);
                    }
                }
                String id = lifesciencejour1.get("ID");
                String title = lifesciencejour1.get("Title");
                String author = lifesciencejour1.get("Author");
                String link = lifesciencejour1.get("Link");
                lifescienceelsevier1.setID(id);
                lifescienceelsevier1.setTitle(title);
                lifescienceelsevier1.setAuthor(author);
                lifescienceelsevier1.setLink(link);

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                BufferedReader lifescience1 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\LifeScience\\Cortex\\0012.txt"));
                String line;

                while ((line = lifescience1.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        lifesciencejour1.put(key, value);
                    }
                }
                String id = lifesciencejour1.get("ID");
                String title = lifesciencejour1.get("Title");
                String author = lifesciencejour1.get("Author");
                String link = lifesciencejour1.get("Link");
                lifescienceelsevier2.setID(id);
                lifescienceelsevier2.setTitle(title);
                lifescienceelsevier2.setAuthor(author);
                lifescienceelsevier2.setLink(link);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("\nPaper 11:");
            System.out.println("ID:" + lifescienceelsevier1.getID());
            System.out.println("Title:" + lifescienceelsevier1.getTitle());
            System.out.println("Author" + lifescienceelsevier1.getAuthor());
            System.out.println("You can read this article here: " + lifescienceelsevier1.getLink());

            System.out.println("\nPaper 12:");
            System.out.println("ID:" + lifescienceelsevier2.getID());
            System.out.println("Title:" + lifescienceelsevier2.getTitle());
            System.out.println("Author" + lifescienceelsevier2.getAuthor());
            System.out.println("You can read this article here: " + lifescienceelsevier2.getLink());
        } else if (life_science_journal_elsevier == 2) {
            Map<String, String> lifesciencejour2 = new HashMap<>();

            try {
                BufferedReader lifesciencejournal2 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\LifeScience\\ExperimentialNeurology\\0013.txt"));
                String line;

                while ((line = lifesciencejournal2.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        lifesciencejour2.put(key, value);
                    }
                }
                String id = lifesciencejour2.get("ID");
                String title = lifesciencejour2.get("Title");
                String author = lifesciencejour2.get("Author");
                String link = lifesciencejour2.get("Link");
                lifescienceelsevier3.setID(id);
                lifescienceelsevier3.setTitle(title);
                lifescienceelsevier3.setAuthor(author);
                lifescienceelsevier3.setLink(link);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                BufferedReader lifesciencejournal2 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\LifeScience\\ExperimentialNeurology\\0014.txt"));
                String line;

                while ((line = lifesciencejournal2.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        lifesciencejour2.put(key, value);
                    }
                }
                String id = lifesciencejour2.get("ID");
                String title = lifesciencejour2.get("Title");
                String author = lifesciencejour2.get("Author");
                String link = lifesciencejour2.get("Link");
                lifescienceelsevier4.setID(id);
                lifescienceelsevier4.setTitle(title);
                lifescienceelsevier4.setAuthor(author);
                lifescienceelsevier4.setLink(link);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                BufferedReader lifesciencejournal2 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\LifeScience\\ExperimentialNeurology\\0015.txt"));
                String line;

                while ((line = lifesciencejournal2.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        lifesciencejour2.put(key, value);
                    }
                }


                String id = lifesciencejour2.get("ID");
                String title = lifesciencejour2.get("Title");
                String author = lifesciencejour2.get("Author");
                String link = lifesciencejour2.get("Link");


                lifescienceelsevier5.setID(id);
                lifescienceelsevier5.setTitle(title);
                lifescienceelsevier5.setAuthor(author);
                lifescienceelsevier5.setLink(link);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("\nPaper 13:");
            System.out.println("ID:" + lifescienceelsevier3.getID());
            System.out.println("Title:" + lifescienceelsevier3.getTitle());
            System.out.println("Author" + lifescienceelsevier3.getAuthor());
            System.out.println("You can read this article here: " + lifescienceelsevier3.getLink());

            System.out.println("\nPaper 14:");
            System.out.println("ID:" + lifescienceelsevier4.getID());
            System.out.println("Title:" + lifescienceelsevier4.getTitle());
            System.out.println("Author" + lifescienceelsevier4.getAuthor());
            System.out.println("You can read this article here: " + lifescienceelsevier4.getLink());

            System.out.println("\nPaper 15:");
            System.out.println("ID:" + lifescienceelsevier5.getID());
            System.out.println("Title:" + lifescienceelsevier5.getTitle());
            System.out.println("Author" + lifescienceelsevier5.getAuthor());
            System.out.println("You can read this article here: " + lifescienceelsevier5.getLink());

        } else if (life_science_journal_elsevier == 3) {
            Map<String, String> lifesciencejour3 = new HashMap<>();

            try {
                BufferedReader lifesciencejournal3 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\LifeScience\\Advances\\0016.txt"));
                String line;

                while ((line = lifesciencejournal3.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        lifesciencejour3.put(key, value);
                    }
                }
                String id = lifesciencejour3.get("ID");
                String title = lifesciencejour3.get("Title");
                String author = lifesciencejour3.get("Author");
                String link = lifesciencejour3.get("Link");
                lifescienceelsevier6.setID(id);
                lifescienceelsevier6.setTitle(title);
                lifescienceelsevier6.setAuthor(author);
                lifescienceelsevier6.setLink(link);

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("\nPaper 16:");
            System.out.println("ID:" + lifescienceelsevier6.getID());
            System.out.println("Title:" + lifescienceelsevier6.getTitle());
            System.out.println("Author" + lifescienceelsevier6.getAuthor());
            System.out.println("You can read this article here: " + lifescienceelsevier6.getLink());

        }

    }

    public static void physical_science_elsevier_papers() {

        PhysicalScience physicalScience1 = new PhysicalScience();
        PhysicalScience physicalScience2 = new PhysicalScience();
        PhysicalScience physicalScience3 = new PhysicalScience();
        PhysicalScience physicalScience4 = new PhysicalScience();
        PhysicalScience physicalScience5 = new PhysicalScience();

        System.out.println("Database for Engineering journals link:");
        physicalScience1.papers_database_link();

        System.out.println("Physical Science journals:" +
                "\n1:Array." +
                "\n2:MaterialsToday." +
                "\n3:Tribology Internetional.");
        System.out.println("Choose journal name:");

        int physical_science_journal_elsevier = sc.nextInt();

        if (physical_science_journal_elsevier == 1) {

            Map<String, String> physicalengineeringjour1 = new HashMap<>();

            try {
                BufferedReader physicalengineeringjournal1 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\PhysicalEngineering\\Array\\0021.txt"));
                String line;

                while ((line = physicalengineeringjournal1.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        physicalengineeringjour1.put(key, value);
                    }
                }
                String id = physicalengineeringjour1.get("ID");
                String title = physicalengineeringjour1.get("Title");
                String author = physicalengineeringjour1.get("Author");
                String link = physicalengineeringjour1.get("Link");
                physicalScience1.setID(id);
                physicalScience1.setTitle(title);
                physicalScience1.setAuthor(author);
                physicalScience1.setLink(link);

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("\nPaper 21:");
            System.out.println("ID:" + physicalScience1.getID());
            System.out.println("Title:" + physicalScience1.getTitle());
            System.out.println("Author" + physicalScience1.getAuthor());
            System.out.println("You can read this article here: " + physicalScience1.getLink());
        } else if (physical_science_journal_elsevier == 2) {

            Map<String, String> physicalengineeringjour2 = new HashMap<>();

            try {
                BufferedReader physicalengineeringjournal2 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\PhysicalEngineering\\MaterialsToday\\0022.txt"));
                String line;

                while ((line = physicalengineeringjournal2.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        physicalengineeringjour2.put(key, value);
                    }
                }
                String id = physicalengineeringjour2.get("ID");
                String title = physicalengineeringjour2.get("Title");
                String author = physicalengineeringjour2.get("Author");
                String link = physicalengineeringjour2.get("Link");
                physicalScience2.setID(id);
                physicalScience2.setTitle(title);
                physicalScience2.setAuthor(author);
                physicalScience2.setLink(link);

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                BufferedReader physicalengineeringjournal2 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\PhysicalEngineering\\MaterialsToday\\0023.txt"));
                String line;

                while ((line = physicalengineeringjournal2.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        physicalengineeringjour2.put(key, value);
                    }
                }
                String id = physicalengineeringjour2.get("ID");
                String title = physicalengineeringjour2.get("Title");
                String author = physicalengineeringjour2.get("Author");
                String link = physicalengineeringjour2.get("Link");
                physicalScience3.setID(id);
                physicalScience3.setTitle(title);
                physicalScience3.setAuthor(author);
                physicalScience3.setLink(link);

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("\nPaper 22:");
            System.out.println("ID:" + physicalScience2.getID());
            System.out.println("Title:" + physicalScience2.getTitle());
            System.out.println("Author" + physicalScience2.getAuthor());
            System.out.println("You can read this article here: " + physicalScience2.getLink());

            System.out.println("\nPaper 23:");
            System.out.println("ID:" + physicalScience3.getID());
            System.out.println("Title:" + physicalScience3.getTitle());
            System.out.println("Author" + physicalScience3.getAuthor());
            System.out.println("You can read this article here: " + physicalScience3.getLink());
        } else if (physical_science_journal_elsevier == 3) {

            Map<String, String> physicalengineeringjour3 = new HashMap<>();

            try {
                BufferedReader physicalengineeringjournal3 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\PhysicalEngineering\\TribologyInternational\\0024.txt"));
                String line;

                while ((line = physicalengineeringjournal3.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        physicalengineeringjour3.put(key, value);
                    }
                }
                String id = physicalengineeringjour3.get("ID");
                String title = physicalengineeringjour3.get("Title");
                String author = physicalengineeringjour3.get("Author");
                String link = physicalengineeringjour3.get("Link");
                physicalScience4.setID(id);
                physicalScience4.setTitle(title);
                physicalScience4.setAuthor(author);
                physicalScience4.setLink(link);

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                BufferedReader physicalengineeringjournal5 = new BufferedReader(new FileReader("C:\\Users\\Comp\\User\\Documents\\GitHub\\KhazarElectronLibrary\\Elsevier\\PhysicalEngineering\\TribologyInternational\\0025.txt"));
                String line;

                while ((line = physicalengineeringjournal5.readLine()) != null) {
                    int index = line.indexOf(":");
                    if (index != -1 && index < line.length() - 1) {
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        physicalengineeringjour3.put(key, value);
                    }
                }
                String id = physicalengineeringjour3.get("ID");
                String title = physicalengineeringjour3.get("Title");
                String author = physicalengineeringjour3.get("Author");
                String link = physicalengineeringjour3.get("Link");
                physicalScience5.setID(id);
                physicalScience5.setTitle(title);
                physicalScience5.setAuthor(author);
                physicalScience5.setLink(link);

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("\nPaper 24:");
            System.out.println("ID:" + physicalScience4.getID());
            System.out.println("Title:" + physicalScience4.getTitle());
            System.out.println("Author" + physicalScience4.getAuthor());
            System.out.println("You can read this article here: " + physicalScience4.getLink());

            System.out.println("\nPaper 25:");
            System.out.println("ID:" + physicalScience4.getID());
            System.out.println("Title:" + physicalScience4.getTitle());
            System.out.println("Author" + physicalScience4.getAuthor());
            System.out.println("You can read this article here: " + physicalScience4.getLink());
        }
    }

    public static void astronomy_springer_subjects() {
        PopularAstronomy info_obj = new PopularAstronomy();
        System.out.println(info_obj.info_message_AstronomyScience);
        System.out.println("Choose subdisciplens:" +
                "\n1:Astronomy, Astrophysics & Cosmology" +
                "\n2:Space Science" +
                "\n3:Astrbiology" +
                "\n4:Space Exploration & Astronautics" +
                "\n5:Popular Astronomy");
        System.out.println("Your choice: ");
        int astro_subject_choice_springer = sc.nextInt();

        switch (astro_subject_choice_springer) {
            case 1:
                AstronomyAstrophysics astro1 = new AstronomyAstrophysics();
                astro1.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Living Reviews in Relativity: " + astro1.getLink1());
                System.out.println("Astronomy and Astrophysics Library: " + astro1.getLink2());
                break;
            case 2:
                SpaceScience astro2 = new SpaceScience();
                astro2.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Space Science Reviews:" + astro2.getLink1());
                System.out.println("Solar Phyisics: " + astro2.getLink2());
                System.out.println("Living Reviews in Solar Physics: " + astro2.getLink3());
                System.out.println("Astrophysics and Space Science Library: " + astro2.getLink4());
                break;
            case 3:
                AstroBiology astro3 = new AstroBiology();
                astro3.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Encyclopedia of Astrobiology:" + astro3.getLink1());
                System.out.println("Living Reviews in Solar Physics: " + astro3.getLink2());
                System.out.println("Advances in Astrobiology and Biogeophysics: " + astro3.getLink3());
                break;
            case 4:
                SpaceExploration astro4 = new SpaceExploration();
                astro4.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Space Exploration:" + astro4.getLink1());
                System.out.println("Space and Society: " + astro4.getLink2());
                System.out.println("The Journal of the Astronautical Sciences: " + astro4.getLink3());
                break;
            case 5:
                PopularAstronomy astro5 = new PopularAstronomy();
                astro5.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("The Patrick Moore Practical Astronomy Series:" + astro5.getLink1());
                System.out.println("Astronomers' Universe: " + astro5.getLink2());
                break;
        }

    }

    public static void chemistry_springer_subjects() {
        AnalyticalChemistry info_obj = new AnalyticalChemistry();
        System.out.println(info_obj.info_message_chemistry);
        System.out.println("Choose subdisciplens:" +
                "\n1:Analytical Chemistry" +
                "\n2:Biochemistry" +
                "\n3:Catalysis" +
                "\n4:Electrochemistry" +
                "\n5:Industrial Chemistry & Chemical Engineering" +
                "\n6:Inorganic Chemistry" +
                "\n7:Organic Chemistry" +
                "\n8:Physical Chemistry" +
                "\n9:Polymer Science" +
                "\n10:Theoretical & Computational Chemistry");
        System.out.println("Your choice: ");
        int chemistry_subject_choice_springer = sc.nextInt();

        switch (chemistry_subject_choice_springer) {
            case 1:
                AnalyticalChemistry chem1 = new AnalyticalChemistry();
                chem1.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Springer's Journal of Analytical Science and Technology:" + chem1.getLink1());
                System.out.println("Analytical and Bioanalytical Chemistry: " + chem1.getLink2());
                System.out.println("Mass Spectrometry: " + chem1.getLink3());
                break;
            case 2:
                Biochemistry chem2 = new Biochemistry();
                chem2.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("JBIC Journal of Biological Inorganic Chemistry:" + chem2.getLink1());
                System.out.println("Bioanalytical Reviews: " + chem2.getLink2());
                System.out.println("Encyclopedia of Membranes: " + chem2.getLink3());
                break;
            case 3:
                Catalysis chem3 = new Catalysis();
                chem3.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Catalysis Letters:" + chem3.getLink1());
                System.out.println("Fundamental and Applied Catalysis: " + chem3.getLink2());
                break;
            case 4:
                ElectroChemistry chem4 = new ElectroChemistry();
                chem4.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Journal of Solid State Electrochemistry: " + chem4.getLink1());
                System.out.println("Encyclopedia of Applied Electrochemistry: " + chem4.getLink2());
                System.out.println("Handbook of Nanoelectrochemistry: " + chem4.getLink3());
                break;
            case 5:
                ChemicalEngineering chem5 = new ChemicalEngineering();
                chem5.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Green Chemistry and Sustainable Technology series: " + chem5.getLink1());
                System.out.println("Handbook of Nuclear Chemistry: " + chem5.getLink2());
                break;
            case 6:
                InorganicChemistry chem6 = new InorganicChemistry();
                chem6.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Structure and Bonding: " + chem6.getLink1());
                System.out.println("Silicon: " + chem6.getLink2());
                break;
            case 7:
                OrganicChemistry chem7 = new OrganicChemistry();
                chem7.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Polysaccharides: " + chem7.getLink1());
                System.out.println("Cellulose: " + chem7.getLink2());
                break;
            case 8:
                PhyisicalChemistry chem8 = new PhyisicalChemistry();
                chem8.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Lecture Notes in Chemistry: " + chem8.getLink1());
                break;
            case 9:
                PolymerScience chem9 = new PolymerScience();
                chem9.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Chinese Journal of Polymer Science: " + chem9.getLink1());
                System.out.println("Encyclopedia of Polymeric Nanomaterials: " + chem9.getLink2());
                System.out.println("Advances in Polymer Science: " + chem9.getLink3());
                break;
            case 10:
                TheoroeticalChemistry chem10 = new TheoroeticalChemistry();
                chem10.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Handbook of Computational Chemistry: " + chem10.getLink1());
                System.out.println("Progress in Theoretical Chemistry and Physics: " + chem10.getLink2());
                break;
        }
    }

    public static void energy_springer_subjects() {
        EnergyEfficiency info_obj = new EnergyEfficiency();
        System.out.println(info_obj.info_message_Energy);
        System.out.println("Choose subdisciplens:" +
                "\n1:Energy Efficiensy" +
                "\n2:Fossil Fuels" +
                "\n3:Nuclear Energy" +
                "\n4:Policy, Economics, Management & Transport" +
                "\n5:Renewable & Green Energy" +
                "\n6:Systems, Storage & Harvesting");
        System.out.println("Your choice: ");
        int energy_subject_choice_springer = sc.nextInt();

        switch (energy_subject_choice_springer) {
            case 1:
                EnergyEfficiency energy1 = new EnergyEfficiency();
                energy1.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Journal Energy Efficiency: " + energy1.getLink1());
                System.out.println("Handbook of Energy Systems in Green Buildings: " + energy1.getLink2());
                break;
            case 2:
                FossilFuels energy2 = new FossilFuels();
                energy2.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Journal Natural Resources Research: " + energy2.getLink1());
                System.out.println("Campbell's Atlas of Oil and Gas Depletion: " + energy2.getLink2());
                break;
            case 3:
                NuclearEnergy energy3 = new NuclearEnergy();
                energy3.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Handbook of Nuclear Engineering: " + energy3.getLink1());
                System.out.println("Nuclear Energy Encyclopedia: " + energy3.getLink2());
                System.out.println("Textbook Nuclear Fusion: " + energy3.getLink3());
                break;
            case 4:
                PolicyEconomicsMenagment energy4 = new PolicyEconomicsMenagment();
                energy4.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Energy Economics: " + energy4.getLink1());
                System.out.println("Encyclopedia on Transportation Technologies for Sustainability: " + energy4.getLink2());
                break;
            case 5:
                RenewableEnergy energy5 = new RenewableEnergy();
                energy5.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Renewable Energy Systems: " + energy5.getLink1());
                System.out.println("Solar Energy: " + energy5.getLink2());
                System.out.println("Book series Green Energy and Technology: " + energy5.getLink3());
                break;
            case 6:
                SystemsStorageHarvesting energy6 = new SystemsStorageHarvesting();
                energy6.info_message();
                System.out.println("You can read well-known titles here: ");
                System.out.println("Book series Energy Systems: " + energy6.getLink1());
                System.out.println("Renewable Energy Systems encyclopedia: " + energy6.getLink2());
                break;
            default:
                energy_springer_subjects();
        }
    }


}