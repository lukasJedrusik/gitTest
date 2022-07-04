//4. Napisz aplikację kalkulator BMI. Po uruchomieniu aplikacji widzimy menu:
//	1. Oblicz BMI.
//	2. Przypomnij BMI.
//	3. Exit.
//Po wybraniu 1 użytkownik wpisuje potrzebne dane. Aplikacja oblicza jego wskaźnik BMI (wzór znajdziecie w Internecie),
// podaje informację czy występuje otyłość, niedowaga, nadwaga itd.
// Wraz z wynikiem użytkownik ma dostać również ID swojego BMI.
//Po wybraniu 2 użytkownik wpisuje ID i aplikacja podaje mu wcześniej obliczone BMI.
//W skrócie należy wymyśleć jakiś sposób na generowanie unikalnych ID, może to być np. losowanie.
// Każde obliczenie jest zapamiętywane w tablicy (baza danych) i jak użytkownik chce sobie
// przypomnieć wyliczenie które już zrobił to podaje tylko ID i aplikacja wyświetla jakie parametry (waga, wzrost itd.) był wpisane i jaki był wynik.
// Aplikacja podobna do wypożyczalni samochodów - używamy obiektowości i wszystkiego co ostatnio się uczyliśmy.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();
        //gui.showMainMenu();
        DataBase db = new DataBase();
        Scanner scan = new Scanner(System.in);
        int id_number;

        while (true) {
            gui.showMainMenu();
            switch (scan.next()) {
                case "1":
                    Bmi bmi = new Bmi();
                    // bmi.showBMI();
                    id_number = db.addToDataBase(bmi);
                    System.out.println("Twoje BMI wynosi: " + bmi.countBMI());
                    bmi.checkBMI(bmi.countBMI());
                    System.out.println(bmi.bmiStatus);
                    System.out.println("Twoje id to : " + id_number);
                  //  db.showID(id_number);
                    break;
                case "2":
                    System.out.println("Podaj swoje id: ");
                    id_number = scan.nextInt();
                   // gui.showBMI(db.getBmi(id_number));
                    db.showBMI(id_number);
                    break;

                case "3":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wybierz jedna z dostepnych opcji!. ");
                    break;

            }
            System.out.println();
        }


    }
}
