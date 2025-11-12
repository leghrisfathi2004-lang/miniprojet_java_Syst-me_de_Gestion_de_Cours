public class inscription {
    etudiant e;
    cours c;

    public inscription(etudiant e1, cours c1){
        e = e1;
        c = c1;
    }

    public void afficheParCour(cours c1){
        if (c1 == c){
            System.out.println(" -etudiant id: " + e.studentId + "  -nom: " + e.nom + "  -email: "+ e.email);
        }
    }
}
