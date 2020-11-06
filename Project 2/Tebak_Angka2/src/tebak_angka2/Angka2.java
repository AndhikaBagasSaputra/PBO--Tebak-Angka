/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebak_angka2;

import java.util.Scanner;
/**
 *
 * @author Bagas
 */
public class Angka2 {
    int score = 100;
    int angkaAsli;
    int angkaJawab;
    boolean benar = false;
    
    void input(){
        angkaAsli = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Tebak Angka Dari 1 Sampai 100 : ");
        
        while (benar == false){
            System.out.println("Coba Tebak Angka : ");
            angkaJawab = input.nextInt();
            
            if(angkaJawab > angkaAsli){
                System.out.println("Tebakan Anda Terlalu Besar");
                score -=2;
            }
            if(angkaJawab < angkaAsli){
                System.out.println("Tebakan Anda Terlalu Kecil");
                score -=2;
            }
            if (score == 0){
                System.out.println("Kesempatan Anda Telah Habis");
                break;
            }
            if (angkaJawab == angkaAsli){
                System.out.println("Hebat Tebakan Kamu Tepat");
                benar = true;
            }
        }
    }
    void output(){
        System.out.println("Score Kamu : "+score);
        if (score >= 92){
            score += 50;
            System.out.println("Kamu Mendapatkan Bonus Score 50 !!!");
            System.out.println("Total Score Kamu : "+score);
        }
    }
}
