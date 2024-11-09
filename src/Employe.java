public class Employe extends Personne{
    private float salaire;
    public void setSalaire(float s){
        if (s>0) {
            salaire=s;
        }
        else{
            System.out.println("Error : salaire doit etre positif");
        }
    }
    public float getSalaire(){
        return salaire;
    }
    public Employe(String n,String p,int a,float s){
        super(n, p, a);
        setSalaire(s);
    }
    public String toString(){
        return "le nom:"+getNom()+"\nle prenom:"+getPrenom()+"\nl\'age :"+getAge()+"\nle salaire :"+getSalaire();
    }
    public void afficherDetails(){
        super.afficherDetails();
        System.out.println("le salaire :"+getSalaire());
    }
}
