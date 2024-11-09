public class Personne {
    private String nom;
    private String prenom;
    private int age;

    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public int getAge(){
        return age;
    }
    public void setNom(String lname){
        nom=lname;
    }
    public void setPrenom(String fname){
        prenom=fname;
    }
    public void setAge(int ag){
        if(ag>0){
            age=ag;
        }
        else{
            System.out.println("Error : Age doit etre positif");
        }
    }
    public Personne(String n,String p,int a){
        setNom(n);
        setPrenom(p);
        setAge(a);
    }
    public void afficherDetails(){
        System.out.println("le nom complet : "+getNom()+" "+getPrenom()+" et l\'age = "+getAge());
    }
    
}

