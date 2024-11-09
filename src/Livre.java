public class Livre {
    private String titre;
    private String auteur;
    private int anneePublication;
    public String getTitre(){
        return titre;
    }
    public String getAuteur(){
        return auteur;
    }
    public int getAnneePublication(){
        return anneePublication;
    }
    public void setTitre(String t){
        if (t!=null) {
            titre=t;
        }
        else{
            System.out.println("le titre ne doit pas etre null");
        }
    }
    public void setAuteur(String a){
        if (a!=null) {
            auteur=a;
        }
        else{
            System.out.println("l'auteur ne doit pas etre null");
        }

    }
    public void setAnneePublication(int x){
        if(x!=0){
            anneePublication=x;
        }
        else{
            System.out.println("l\'annee de publication ne peut pas etre null ");
        }
    }
    public Livre(String title,String author,int year){
        setTitre(title);
        setAuteur(author);
        setAnneePublication(year);
    }
    public String toString(){
        return "titre: "+titre+" auteur: "+auteur+" annee de publication: "+anneePublication;
    }

}
