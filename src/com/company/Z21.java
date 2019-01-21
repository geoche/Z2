package com.company;
import java.util.Scanner;


/**
 * Napisać program prostego kalkulatora realizującego 4 podstawowe operacje arytmetyczne.
 * Program powinien umożliwiać wybranie operacji, jaka będzie realizowana,
 * pobrać dane niezbędne do realizacji operacji a następnie wyświetlić wynik.
 * Program powinien sprawdzać w co najmniej jednym przypadku poprawność danych
 * (np. dla dzielnika równego 0 - zwracać informację o błędzie i proponować ponowne wprowadzenie wartości).
 */

public class Z21 {

    public static double add(double a, double b){ // Method for addition
        double result = a + b;
        return result;
    }
    public static double sub(double a, double b) { // Method for substraction
        double result = a - b;
        return result;
    }
    public static double mult(double a, double b) { //Method for multiplication
        double result = a * b;
        return result;
    }
    public static double div(double a, double b) { // Method for division
        double result = a / b;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first value:");
        double x = scanner.nextDouble();
        System.out.println("Please enter second value:");
        double y = scanner.nextDouble();
        System.out.println("Choose the operation: \n 1 for + \n 2 for - \n 3 for * \n 4 for / \n For exit press 0"); // Choises of operations we need to do with entered values
        double i = scanner.nextDouble();
        while (i != 0){
            if (i == 1){
                System.out.println(add(x,y)); // If entered 1, than addition
                break;
            }
            else if (i == 2){
                System.out.println(sub(x,y)); // If entered 2, than substraction
                break;
            }
            else if (i == 3){
                System.out.println(mult(x,y)); // If entered 3, than multiplication
                break;
            }
            else if (i == 4){
                System.out.println(div(x,y)); // // If entered 4, than division
                break;
            }
            else {
                System.out.println("Please choose the exact operation fro 1 to 4."); // If choice is not from 1 to 4, you will be able to choose again.
                i = scanner.nextDouble();
            }
        }
    }
}
