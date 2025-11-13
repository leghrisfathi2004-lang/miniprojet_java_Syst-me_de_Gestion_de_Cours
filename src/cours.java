import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cours {
    static Scanner input = new Scanner(System.in);

    private int courseId;
    private String titre;
    private String description;
    private instructeur inst;

    public cours(int id){
        this.courseId = id;
        System.out.println(" entre la titre de cour: ");
        this.titre = input.nextLine();
        System.out.println(" entre la description: ");
        this.description = input.nextLine();
    }

    public void assignerIns(instructeur i){
        if (i != null){
            inst = i;
            System.out.println("assigner en success!");
            return;
        }
        System.out.println("");

    }

    public void affiche_cour(){
        System.out.println(" -cour id: "+courseId+"  -titre: "+titre+"  -decription: "+description);
        if (inst != null) inst.afficheinst();
    }
}
