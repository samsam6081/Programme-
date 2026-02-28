
		import java.util.Scanner;

public class BienvenueUtilisateur {
    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);
        
        // Demander le nom
        System.out.print("Entrez votre nom : ");
        String nom = clavier.nextLine();
        
        // Demander l'âge
        System.out.print("Entrez votre âge : ");
        int age = clavier.nextInt();
        
        // Affichage du message
        System.out.println("Bienvenue " + nom);
        
        clavier.close();
    }
}
	