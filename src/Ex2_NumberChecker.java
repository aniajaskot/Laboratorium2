import java.util.Random;

public class Ex2_NumberChecker {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10 - (-10)) - 10;
//        int number = rand.nextInt(-10,10); // metoda może nie dzialac w zaleznosci od wersji Javy

        if(number % 2 == 0){
            System.out.println("Liczba " + number + " jest parzysta");
        } else {
            System.out.println("Liczba " + number + " jest nieparzysta");
        }

        if(number > 0){
            System.out.println("Liczba " + number + " jest dodatnia");
        }else {
            System.out.println("Liczba " + number + " jest niedodatnia");
        }

        int multi9 = number * 9;
        int squareNumber = number * number;
        if (multi9 % 6 == 0) {
            System.out.println(multi9 + " jest podzielna przez 6");
        } else if (squareNumber < 100) {
            System.out.println(squareNumber + " jest mniejsze od 100");
        }
    }
}
