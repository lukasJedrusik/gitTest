import java.util.Random;
import java.util.Scanner;

public class Bmi {

    Random random = new Random();
    double weight ;
    double hight;
    int id ;
    double bmi;
    String bmiStatus;



    public Bmi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Poadaj swoją wagę: ");
        this.weight = scan.nextDouble();
        System.out.println("Podaj swój wzrost w cm: ");
        this.hight = scan.nextDouble() / 100;
       // id = random.nextInt(100);


    }


    double countBMI(){
        bmi = weight / (hight * hight);
        return bmi;
    }

    String checkBMI(double bmi){
        if(bmi >= 18.5 && bmi <= 24.99){
           bmiStatus = "Prawidłowa waga";
        } else if (bmi < 18.5){
            bmiStatus = "Niedowaga";
        } else {
            bmiStatus = "Nadwaga";
        }
        return bmiStatus;
    }





}
