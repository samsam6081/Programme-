
		import java.util.Scanner;

public class AgeUtilisateur {
    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);
        
        System.out.print("Entrez votre âge : ");
        int age = clavier.nextInt();
        
        if (age >= 18) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
        }
        
        clavier.close();
    }
}
	