/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.palindromo.business;

/**
 *
 * @author darkheaven
 */
public class Palindromo {
    
    /**
     * Evaluates if a given phrase is a palindrome.
     * @param phrase The phrase to be evaluated.
     * @return Returns true if the phrase is a palindrome, and returns false if
     * it is not a palindrome.
     */
    public static boolean isPalindrome (String phrase){
        
        String reversedPhrase = "";
        String cleanPhrase = phrase.replace(" ","");
        
        for(int i = cleanPhrase.length() - 1; i >= 0; i--) {
	reversedPhrase = reversedPhrase + cleanPhrase.charAt(i);
        }
        
        if (cleanPhrase.toLowerCase().equals(reversedPhrase.toLowerCase())){
            return true;
        }
        else{
            return false;
        }
        
    }
    /**
     * Suma dos numeros enteros.
     * @param a El primer número a sumar.
     * @param b El segundo número a sumar.
     * @return La suma de los dos valores ingresados.
     */
    public int sumar (int a, int b){
     return a + b;   
    }
}
