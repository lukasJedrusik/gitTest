public class GUI {
    void showMainMenu(){
        System.out.println("1. Oblicz BMI.");
        System.out.println("2. Przypomnij BMI.");
        System.out.println("3. Exit.");
    }
   void showBMI(Bmi bmi){
       System.out.println("Waga: " + bmi.weight);
       System.out.println("Wzrost: " + bmi.hight);
       System.out.println("BMI: " + bmi.bmi);
       System.out.println(bmi.bmiStatus);
   }

}
