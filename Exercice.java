
		import java.util.Scanner;

public class ComparaisonEntiers {
    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);
        
        // Saisie des deux entiers
        System.out.print("Entrez le premier entier : ");
        int a = clavier.nextInt();
        
        System.out.print("Entrez le deuxième entier : ");
        int b = clavier.nextInt();
        
        // Comparaison et message
        if (a > b) {
            System.out.println("Le premier entier est plus grand que le deuxième.");
        } else if (a < b) {
            System.out.println("Le premier entier est plus petit que le deuxième.");
        } else {
            System.out.println("Les deux entiers sont égaux.");
        }
        
        clavier.close();
    }
}
	
