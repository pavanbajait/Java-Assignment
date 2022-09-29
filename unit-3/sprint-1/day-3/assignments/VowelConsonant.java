package com.masai.assignment;

public class VowelConsonant {
    public void isVowelConso(char ch){
        if(ch>='a' && ch <= 'z' || ch>='A' && ch<='Z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("character is Vowel");
            } else {
                System.out.println("character is Consonant");
            }
        }else{
            System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args) {
        VowelConsonant obj = new VowelConsonant();
        obj.isVowelConso('x');
        obj.isVowelConso('i');
        obj.isVowelConso('2');
    }
}
