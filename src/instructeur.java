import java.util.Scanner;

public class instructeur {
    private int instructeurId;
    private String nom;
    private String speciality;
    private static Scanner input = new Scanner(System.in);

    public instructeur(int id){
        this.instructeurId = id;
        System.out.println("+ entre le nom: ");
        this.nom = input.nextLine();
        System.out.println("entre spicialite: ");
        this.speciality = input.nextLine();
    }

    public void afficheinst(){
        System.out.println("  ->instructeur id: " + instructeurId + "  -nom: " + nom + "  -specialite: "+ speciality);
    }


}
