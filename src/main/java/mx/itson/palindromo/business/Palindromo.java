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
    public static boolean esPalindromo (String word){
        
        String reversedWord = "";
        String cleanWord = word.trim();
        
        for(int i = cleanWord.length() - 1; i >= 0; i--) {
	reversedWord = reversedWord + cleanWord.charAt(i);
        }
        
        if (cleanWord.toLowerCase().equals(reversedWord.toLowerCase())){
            return true;
        }
        else{
            return false;
        }
        
    }
}
