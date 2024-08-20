

public class Main {

    public static void main(String[] args) {

        int result =max(10, 5);
        System.out.println("Maxvärde: " + result);

        float averageValue = average(15.4f, 4.3f, 3.2f);
        System.out.println("Medelvärde: " + averageValue);

        averageValue = average(15.9f, 4.6f, 3.5f);
        System.out.println("Medelvärde: " + averageValue);

        float[] values = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f};
        System.out.println("Nytt medelvärde: " + average(values));
    }

    static int max(int tal1, int tal2) {

        if (tal1 > tal2) {
            return tal1;
        } else {
            return tal2;
        }
    }

    static float average(int number1, int number2) {
        return (number1 + number2) / 2.0f;
    }

    static float average(float number1, float number2) {
        return (number1 + number2) / 2;
    }

    static float average(float number1, float number2, float number3) {
        return (number1 + number2 + number3) / 3;
    }


    static float average(float[] numbers) {
        float sum = 0;
        for (int i = 0; i <numbers.length ; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }
}



