package EX4TD;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Competition ISET2015 = new Competition("ISET2015", "12/11/2015");
        
        for (int i = 0; i < 2; i++)
        {
            System.out.print("Entrez le nom et prénom de l'étudiant coureur " + (i + 1) + ": ");
            String nomPrenom = scanner.nextLine();
            Etud_Coureur etudiant = new Etud_Coureur(0, nomPrenom, false, 0);
            System.out.print("Entrez la durée en secondes : ");
            int duree = scanner.nextInt();
            etudiant.setDuree(duree);
            scanner.nextLine(); 
        }
        ISET2015.afficher();
    }
}
