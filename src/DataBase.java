public class DataBase {
    Bmi[] tabBmi = new Bmi[10];

    int addToDataBase(Bmi bmi){
        for (int i = 0; i < tabBmi.length; i++ ){
            if(tabBmi[i] == null){
                bmi.id = i;
                tabBmi[i] = bmi;
                break;
            }
        }
        return bmi.id;
    }

    Bmi getBmi(int id){
        Bmi object = null;
        for(int i = 0; i < tabBmi.length; i++) {
            if( tabBmi[i] != null){
                if (tabBmi[i].id == id) {
                   object = tabBmi[i];
                }
                }
                }
        return object;
    }
    void showBMI(int id){

            for(int i = 0; i < tabBmi.length; i++) {
                if( tabBmi[i] != null) {
                    if (tabBmi[i].id == id) {
                        System.out.println("Waga: " + tabBmi[i].weight);
                        System.out.println("Wzrost: " + tabBmi[i].hight);
                        System.out.println("BMI: " + tabBmi[i].bmi);
                        System.out.println(tabBmi[i].bmiStatus);
                        break;

                    }
                } else {
                    System.out.println("Nie ma takiego id");
                    break;
                }
            }
    }



}
