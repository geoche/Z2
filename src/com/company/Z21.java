package com.company;
import java.util.Scanner;

/**
 * Napisać program prostego kalkulatora realizującego 4 podstawowe operacje arytmetyczne.
 * Program powinien umożliwiać wybranie operacji, jaka będzie realizowana, pobrać dane niezbędne do realizacji operacji a następnie wyświetlić wynik.
 * Program powinien sprawdzać w co najmniej jednym przypadku poprawność danych
 * (np. dla dzielnika równego 0 - zwracać informację o błędzie i proponować ponowne wprowadzenie wartości).
 */
public class Z21 {
    protected  static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray(); // Defining alphabet with lower- and uppercase letters + numbers
    // and it is protected, so it cannot be changed

    // Ceasar's cypher

    public static void main(String[] args) {

        System.out.println("Enter a sentence below:\n");
        Scanner scn = new Scanner(System.in);
        String sentence = scn.nextLine(); // enter new line
        //sentence.toUpperCase(); // all characters to uppercase. We can use it if alphabet defined only with uppercase letters.
        char[] arrSent = sentence.toCharArray(); // making array from line
        int[] arrInd = new int[arrSent.length]; // array with indexes of equal symbols
        char ii;
        char jj;
        for (int i = 0; i < arrSent.length; i++){ // Comparing indexes of "alphabet" with entered string
            for (int j = 0; j < alphabet.length; j ++){
                ii = arrSent[i];
                jj = alphabet[j];
                if (ii == jj){
                    arrInd[i] = j;
                }
            }
        }
        System.out.println("Enter a value to encrypt your sentence:\n"); // Here we can enter any value of step on which each element of array will be moved according to indexes
        int x = scn.nextInt();
        if (x >= 62){ // Here, if your value is more than total amount of letters in defined alphabet, it will pass 62
            x %= 62;
            System.out.println("Your key is:" + x);
        }
        for (int i = 0; i < arrInd.length; i++){ // Here is a loop in which we are moving every character to our value's step
            if (arrInd[i] == 0){
                System.out.print(" ");
            }
            else {
                arrInd[i] = arrInd[i] + x; // Here we are adding a step value to every index of our array
                if (arrInd[i] >= 62){
                    int res = arrInd[i]%62;
                    arrInd[i] = res;
                }
                char s = alphabet[arrInd[i]]; //If we don't have this character declared, than we copy only link of elements to array
                arrSent[i] = s;
            }
        }
        System.out.println(arrSent);
    }
}
