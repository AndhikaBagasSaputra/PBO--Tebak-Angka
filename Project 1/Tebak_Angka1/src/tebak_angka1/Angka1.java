/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebak_angka1;
import java.util.Scanner;
/**
 *
 * @author Bagas
 */
public class Angka1 {
    int angkaAsli;
    int angkaJawab;
    boolean benar = false;

    void input() {
        Scanner input = new Scanner(System.in);
//membuat angka random antara 1-100        
        angkaAsli = (int) (Math.random() * 101);
        System.out.println("Coba Tebak Angka 1-100");
        
        while (benar == false) {
            System.out.println("Masukan Jawaban Anda : ");
            angkaJawab = input.nextInt();
            if(angkaJawab > angkaAsli){
                System.out.println("Tebakan Anda Terlalu besar");
            }
            if(angkaJawab < angkaAsli){
                System.out.println("Tebakan Anda Terlalu kecil");
            }
            if(angkaJawab == angkaAsli){
                System.out.println("Jawaban Anda Tepat Sekali ");
                benar = true;
            }
        }
    }
    
}