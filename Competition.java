
package EX4TD;

public class Competition {
    private String designationComp;
    private String dateComp;
    private final int RECORD_A_BATTRE = 132;
    private  Etud_Coureur [] E;
    private int nombreCoureur;

    public Competition(String designationComp, String dateComp)
    {
        this.designationComp = designationComp;
        this.dateComp = dateComp;
        this.E= new Etud_Coureur[20];
        this.nombreCoureur = 0;
    }
    
    public boolean ajouterCoureur(Etud_Coureur e)
        {
         if (!e.getParticipe() && nombreCoureur < 20)
         {
        E[nombreCoureur] = e;
        E[nombreCoureur].setParticipe(true);
        nombreCoureur++;
        return true;
    } else {
        return false;
    }
}

    
    public Etud_Coureur getMedailleOr() 
    {
        Etud_Coureur Tab_win = E[0];
        for (int i = 1; i < nombreCoureur; i++)
        {
            if (E[i].comparer(Tab_win))
            {
                Tab_win = E[i];
            }
        }
        return Tab_win;
    }
    
    public boolean recordBattu()
    {
        return getMedailleOr().getDuree() < RECORD_A_BATTRE;
    }
     public void afficher() 
     {
        System.out.println("Compétition : " + this.designationComp);
        System.out.println("Date de la compétition : " + this.dateComp);
        Etud_Coureur Tab_Win = getMedailleOr();
        System.out.println("Étudiant coureur qui a gagné : " + Tab_Win);
        if (recordBattu()) 
        {
            System.out.println("Le record a été battu !");
        } else 
        {
            System.out.println("Le record n'a pas été battu.");
        }
    }
}
    
 
