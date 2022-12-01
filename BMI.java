/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author MOKLET GAMING
 */
public class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        double bmi, tinggibadan, beratbadan;
        String jeniskelamin, jawaban;
        
        boolean ulang = true;
        while (ulang == true){
            
            System.out.println("===========KALKULATOR BMI==========");
            
            System.out.println("Masukkan Berat Badan (Kg)= ");
            beratbadan = in.nextInt();
            System.out.println("Masukkan Tinggi Badan (Cm)= ");
            tinggibadan = in.nextInt();
            System.out.println("Jenis Kelamin (L/P) = ");
            jeniskelamin = in.next();
            tinggibadan /=100;
            bmi = beratbadan / (tinggibadan * tinggibadan);
                    System.out.println("=======================");
                    System.out.println("BMI = "+bmi);
                    
                    //  LAKI-LAKI   
                    if(jeniskelamin.equalsIgnoreCase("1")){
                        if(bmi<17){
                            System.out.println("KURUS");
                        }else if (bmi >= 17 && bmi <23){
                            System.out.println("NORMAL");
                        }else if (bmi >= 23 && bmi <27){
                            System.out.println("KEGEMUKAN");
                        }else{
                            System.out.println("OBESITAS");
                        }
                    }
                    //PEREMPUAN
                    if(jeniskelamin.equalsIgnoreCase("p")){
                        if(bmi < 18){
                            System.out.println("KURUS");
                        }else if (bmi >= 18 && bmi< 25){
                            System.out.println("NORMAL");
                        }else if (bmi >= 25 && bmi <27){
                            System.out.println("KEGEMUKAN");
                        }else{
                            System.out.println("OBESITAS");
                        }
                    }
                    System.out.println("====================");
                    System.out.println("Pengen mengulangi? (y/n)");
                    jawaban = in.next();
                    if(jawaban.equalsIgnoreCase("y")){
                        ulang = true;
                    }else{
                        ulang = false;
                        System.out.println("TERMAKASIH");
                    }
        }
    }
}
