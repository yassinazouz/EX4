
package EX4TD;

public class Etud_Coureur {
    private int numEtud;
    private static int nombre;
    private String nomPrenom;
    private boolean aDejaParticipe;
    private int duree;
    
    public Etud_Coureur(int numEtud, String nomPrenom, boolean aDejaParticipe, int duree)
    {
        nombre++;
        this.numEtud=nombre;
        this.nomPrenom=nomPrenom;
        this.aDejaParticipe=aDejaParticipe;
        this.duree=duree;
        
    }
    public int getDuree()
    {
        return this.duree;
    }
    
    public void setDuree(int duree)
    {
        this.duree=duree;
    }
    
    public boolean getParticipe()
    {
        return this.aDejaParticipe;
    }
    
    public void setParticipe(boolean aDejaParticipe)
    {
        this.aDejaParticipe= aDejaParticipe;
    }
    
    public boolean comparer (Etud_Coureur e)
    {
        return e.duree>this.duree;
    }

    @Override
    public String toString() {
       String ch= "Etud_Coureur{" + "numEtud=" + numEtud + ", nomPrenom=" + nomPrenom + ", duree=" + duree + '}';
       if (this.aDejaParticipe){
           ch=ch+", duree "+duree;
       }
       return ch;
    }

    
}
