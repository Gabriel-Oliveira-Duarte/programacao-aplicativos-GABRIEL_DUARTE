/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade04_Gabriel_duarte;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Atividade04_Gabriel_duarte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int n;
        System.out.println("digite o numero: ");
       n=entrada.nextInt();
         if (n < 0) {
            System.out.println("Esse número é negativo");
        } else if (n == 0) {
            System.out.println("Esse número é zero");
        } else {
            System.out.println("Esse número é positivo");
        }
        
    }
    
}

