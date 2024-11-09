import java.util.ArrayList;
public class Bibliotheque {
    private ArrayList<Livre> livres;
    public Bibliotheque(){
        livres=new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }
    public void supprimerLivre(String titre) {
        for (Livre livre : livres) {
            if (livre.getTitre().equals(titre)) {
                livres.remove(livre);
                break;
            }
        }
    }
    public void trouverLivre(String auteur){
        for (Livre livre : livres) {
            if (livre.getAuteur().equals(auteur)) {
                System.out.println("le livre est trouve :");
                System.out.println(livre.toString());
                break;
            }

        }
    }
    public void afficherLivres() {
        for (Livre livre : livres) {
            System.out.println(livre.toString());
        }
    }
}
