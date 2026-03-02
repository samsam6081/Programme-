
		import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez la première note : ");
        double note1 = sc.nextDouble();
        
        System.out.print("Entrez la deuxième note : ");
        double note2 = sc.nextDouble();
        
        System.out.print("Entrez la troisième note : ");
        double note3 = sc.nextDouble();
        
        double moyenne = (note1 + note2 + note3) / 3;
        
        System.out.println("La moyenne est : " + moyenne);
        
        if (moyenne >= 10) {
            System.out.println("Admis");
        } else {
            System.out.println("Ajourné");
        }
        
        sc.close();
    }
}
	