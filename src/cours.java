import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cours {
    int courseId;
    String titre;
    String description;
    instructeur inst;


    static Scanner input = new Scanner(System.in);

    public cours(int id, String titre, String description){
        this.courseId = id;
        this.description = description;
        this.titre = titre;
    }


    public void assignerInstructeur(instructeur i){
        inst = i;
        System.out.println("assigner en success!");
    }

    public void afficherDetails(){

    }
}
