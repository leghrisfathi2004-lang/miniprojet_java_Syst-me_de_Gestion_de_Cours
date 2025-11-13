import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<inscription> inscriptions = new ArrayList<>();
    static ArrayList<etudiant> etudiants = new ArrayList<>();
    static ArrayList<cours> courss = new ArrayList<>();
    static ArrayList<instructeur> instructeurs = new ArrayList<>();

    public static int menu(){
        int c;
        System.out.println("--> GESTION DES COURS...");
        System.out.println(" 1 -> ajoute un cours." +
                " 2 -> suppreme un cour." +
                " 3 -> affiche les cours." );
        System.out.println("--> GESTION DES etudiants...");
        System.out.println(" 4 -> ajoute un etudiant." +
                " 5 -> affiche les etudiants." +
                " 6 -> assigne etudiant en cour." +
                " 7 -> suppreme un etudiant." );
        System.out.println("--> GESTION DES instructeur...");
        System.out.println(" 8 -> ajoute un instructeur." +
                " 9 -> affiche les instructeur." +
                " 10 -> assigne instructeur en cour." );
        System.out.println(" 0 -> quite!");

        System.out.println("votre choi: ");
        return input.nextInt();
    }

    public static void sup_cour(){
        courss.remove(find_cour());
        System.out.println("==== cour suppreme en succes =====");
    }

    public static cours find_cour(){
        System.out.println("entre id de cour: ");
        int id = input.nextInt();
        if (( id < 0 )||( id >= courss.size() )) {
            System.out.println("invalid! id n exis pas");
            return null;
        }
        return courss.get(id);
    }

    public static void sup_etd(){
        etudiants.remove(find_etd());
        System.out.println("==== etudiant suppreme en succes =====");
    }

    public static etudiant find_etd(){
        System.out.println("entre id de etudiant: ");
        int id = input.nextInt();
        if (( id < 0 )||( id >= etudiants.size() )) {
            System.out.println("invalid! id n exis pas");
            return null;
        }
        return etudiants.get(id);
    }

    public static instructeur find_inst(){
        System.out.println("entre id de instructeur: ");
        int id = input.nextInt();
        if (( id < 0 )||( id >= instructeurs.size() )) {
            System.out.println("invalid! id nexis pas");
            return null;
        }
        return instructeurs.get(id);
    }

    public static void main(String[] args) {
        int choi;
        do {

            choi = menu();
            switch (choi){
                case 1:
                    cours c = new cours(courss.size());
                    courss.add(c);
                    System.out.println("==== cour ajoute en succes =====");
                    break;
                case 2:
                    sup_cour();
                    break;
                case 3:
                    System.out.println("1 -> affiche tous les cours\n2 -> affiche cours d’un étudiant");
                    int a = input.nextInt();
                    switch (a){
                        case 1:
                            System.out.println("----- List des cours-----");
                            for (cours element : courss)
                                element.affiche_cour();
                            break;
                        case 2:
                            etudiant e1 = find_etd();
                            if (e1 != null){
                                System.out.println("----- List des cours-----");
                                for (inscription element : inscriptions)
                                    element.affichecrs(e1);
                                break;
                            }
                            break;
                        default:
                            System.out.println("invalid! entre valid affichage");
                            break;
                    }
                    break;
                case 4:
                    etudiant e = new etudiant(etudiants.size());
                    etudiants.add(e);
                    System.out.println("==== etudiant ajoute en succes =====");
                    break;
                case 5:
                    System.out.println("1 -> affiche tous les etudiants\n2 -> affiche etudiants d’un cour");
                    int ch = input.nextInt();
                    switch (ch) {
                        case 1:
                            System.out.println("----- List des etudiants-----");
                            for (etudiant element : etudiants)
                                element.affiche_etude();
                            break;
                        case 2:
                            cours c1 = find_cour();
                            if (c1 != null) {
                                System.out.println("----- List des etudiants-----");
                                for (inscription element : inscriptions)
                                    element.affichetd(c1);
                                break;
                            }
                            break;
                        default:
                            System.out.println("invalid! entre valid affichage");
                            break;
                    }
                    break;
                case 6:
                    inscription i = new inscription(find_etd(), find_cour());
                    inscriptions.add(i);
                    break;
                case 7:
                    sup_etd();
                    break;
                case 8:
                    instructeur ins = new instructeur(instructeurs.size());
                    instructeurs.add(ins);
                    break;
                case 9:
                    for(instructeur elmnt : instructeurs)
                        elmnt.afficheinst();
                    break;
                case 10:
                    Objects.requireNonNull(find_cour()).assignerIns(find_inst());
                    break;
            }

        }while(choi != 0);

    }
}