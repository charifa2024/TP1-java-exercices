public class Main {
    public static void main(String[] args){
        /*
        Personne A = new Personne("fax", "charifa", 18);
        A.afficherDetails();
        A.setAge(19);
        A.afficherDetails();
        Personne B=new Personne("kamboua", "farah", 19);
        Employe C=new Employe("elaasri", "laila", 19, 30000);
       System.out.println(C.toString());
       A.afficherDetails();
       B.afficherDetails();
       C.afficherDetails();
       
      Chat mimi=new Chat();
      Chien bobi=new Chien();
      System.out.println(mimi.emettreSon());
      System.out.println(bobi.emettreSon());
      Animal[] animaux=new Animal[2];
      animaux[0]=mimi;
      animaux[1]=bobi;
      for(Animal a:animaux){
        System.out.println(a.emettreSon());
      }
    }*/
    Bibliotheque bibliotheque=new Bibliotheque();
    Livre livre1=new Livre("les miserables","victor hugo",1862);
    Livre livre2=new Livre("le petit prince","antoine de saint-exupery",1943);
    Livre livre3=new Livre("la petite fille qui aimait les oiseaux","katherine paterson",1999);
    bibliotheque.ajouterLivre(livre1);
    bibliotheque.ajouterLivre(livre2);
    bibliotheque.ajouterLivre(livre3);
    bibliotheque.afficherLivres();
    bibliotheque.supprimerLivre("le petit prince");
    bibliotheque.afficherLivres();
    bibliotheque.trouverLivre("antoine de saint-exupery");
    }
}
