public class inscription {
    etudiant e;
    cours c;

    public inscription(etudiant e1, cours c1){
        e = e1;
        c = c1;
    }

    public void affichetd(cours c1){
        if (c1 == c){
            e.affiche_etude();
        }
    }

    public void affichecrs(etudiant e1){
        if(e1 == e) {
            c.affiche_cour();
        }
    }
}
