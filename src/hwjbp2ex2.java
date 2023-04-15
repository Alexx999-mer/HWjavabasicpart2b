import java.util.Scanner;
/*Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile. Folosind structura switch, daca s-a introdus un caracter anume, realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
-‘a’: adaugare
-‘s’: scadere
-‘i’: inmultire
-‘p’: impartire
-‘m’: modul
Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.*/
public class hwjbp2ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alege un caracter: ");
        String operatia = scanner.nextLine();

        System.out.println("Alege 2 numere: ");
        Double a = scanner.nextDouble();
        Double b  = scanner.nextDouble();

        double adunare = a + b;
        double scadere = a - b;
        double inmultire = a * b;
        double impartire = a / b;
        double modul = a % b;
        switch (operatia) {
     case "a":
         System.out.println("Rezultatul adunarii este: " + adunare);
         break;
     case "s":
         System.out.println("Rezultatul scaderii este: " + scadere);
         break;
     case "i":
         System.out.println("Rezultatul inmultirii este: " + inmultire);
         break;
     case "p":
         System.out.println("Rezultatul impartirii este: " + impartire);
         break;
     case "m":
         System.out.println("Modulul este: " + modul);
         break;
     default:
         System.out.println("CARACTER INTRODUS NECUNOSCUT!");
         break;
         }
    }
}

