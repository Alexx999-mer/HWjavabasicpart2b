import java.util.Scanner;
/*Citit un numar de la tastatura si stocati valoarea lui intr-o variabila.
Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila.
Daca numarul introdus de la tastatura este mai mic decat numarul random generat,afisati mesajul
“Numarul introdus este mai mic decat <numar_random>” (inserati valoarea numarului random generat in textul afisat).
 */
public class hwjbp2ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Alege un numar: ");
        int a = scanner.nextInt();
        System.out.println("Se genereaza numarul: ");
        int min = 1;
        int max = 100;
        int randomNum = (int) (Math.random()*(max-min)) + min;
        System.out.println(randomNum);
        if(a < randomNum) {
            System.out.println("Numarul introdus este mai mic decat " + randomNum);
        } else {
            System.out.println("Numarul introdus este mai mare decat " + randomNum);
        }
    }
}
