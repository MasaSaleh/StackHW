package javaapplication1;

import java.util.Scanner;
import java.util.Stack;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Stack<Character> ss1 = new Stack();
        Stack<Character> ss2 = new Stack();
        Stack<Character> ss3 = new Stack();
        Stack<Character> ss4 = new Stack();
        String s1 = "abcdefgh";
        String s2 = "*+-/";
        char letter = 'z';
        System.out.println("Masa Rafiq Saleh:::202211397");
        System.out.println("**********************************");
        System.out.println("Enter the arithmetic expression : ");
        String s=in.nextLine();
         s = s.replaceAll("\\s+"," ");
        System.out.println("**********************************");

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i % 2 == 0 && !s1.contains(ch + "") || i % 2 == 1 && !s2.contains(ch + "") || s.length() % 2 == 0) {
                System.out.println("not valid");
                break; }
            if (i % 2 == 0) {
                ss1.push(ch); }
            else {
                ss2.push(ch);
                if (ch == '*' || ch == '/') {
                    char m = ss1.pop();
                    char a = s.charAt(++i);
                    System.out.println(ch + "\t" + m + "\t" + a + "\t" + letter);
                    ss2.pop();
                    ss1.push(letter--);}}}
                
        while (!ss1.isEmpty()) {
            ss3.push(ss1.pop());}

        while (!ss2.isEmpty()) {
            ss4.push(ss2.pop());}
        
        while (!ss4.isEmpty()) {
            System.out.println(ss4.pop() + "\t" + ss3.pop() + "\t" + ss3.pop()+"\t"+letter);
            ss3.push(letter--);}}}
        