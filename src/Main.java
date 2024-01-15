import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        state(23,-33);
        state(45,30);
        state(25,25);
        state(36,10);
        state(47,-27);
        state(randomAge(), randomTemperature());
    }



    public static void state(int age, int temperature) {
        String result = choise(age, temperature);
        System.out.println("Возраст:" + age + "." + "Температура:" + temperature + "." + "Результат:" + result);

    }

    public static int randomAge() {
        Random random = new Random();
        return random.nextInt(45);
    }

    public static int randomTemperature() {
        Random random = new Random();
        return random.nextInt(31);
    }


    public static String choise(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && age >= 0 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)){
            return ("Можно идти гулять");
        }
        else {
            return ("Оставайтесь дома");
        }



    }

}