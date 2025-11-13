import java.nio.file.LinkPermission;
import java.util.Scanner;

public class etudiant {
    private static Scanner input = new Scanner(System.in);
    private int studentId;
    private String nom;
    private String email;

    public etudiant(int id){
        this.studentId = id;
        System.out.println("entre le nom: ");
        this.nom = input.nextLine();
        System.out.println("entre l email: ");
        this.email = input.nextLine();
    }

    public void affiche_etude(){
        System.out.println(" -etudiant id: " + studentId + "  -nom: " + nom + "  -email: "+ email);
    }
}
