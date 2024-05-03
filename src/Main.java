//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double heightInMeters = 1.75; //метры
        int weightInKg = 60;  //кг

        int Bmi = service.calculate(weightInKg, heightInMeters);
        int bmi = (int) Bmi;

        System.out.println("Ваш индекс массы тела:" + bmi);

    }


}