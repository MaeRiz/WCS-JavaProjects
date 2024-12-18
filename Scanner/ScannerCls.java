import java.util.Scanner;

class ScannerCls {

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        float[] numbers = new float[3];

        System.out.println("Please enter 3 numbers and I'll calculate the average.");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i+1) +": ");
            numbers[i] = inputObj.nextFloat();
        }
        inputObj.close();

        float somme = 0;
        for(int i = 0; i < numbers.length; i++) {
            somme += numbers[i];
        }

        System.out.println(somme / numbers.length);
    }
}
