/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mdabra.coursera.WEEK1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class MaxPairWise {
    public static void main(String [] args){
//        Scanner input = new Scanner(System.in);
//        int n = Integer.parseInt(input.nextLine());
//        String[] numbers = input.nextLine().split(" ");
//        
//        Integer[] intArr = new Integer[numbers.length];
//        
//        for (int i = 0; i < numbers.length; i++) {
//           String num = numbers[i];
//           intArr[i] = Integer.parseInt(num);
//        }
//        Long startTime = System.nanoTime();
//        System.out.println(maxPairWise(sorted(intArr)));   
//        Long finishTime = System.nanoTime();
//        System.out.println(finishTime-startTime);
        

        
        int count = 3;
        for(int i = 0; i<count; i++){
            Random random = new Random();
            int randN = random.nextInt(500) + 2;
            
            System.out.println("random::"+randN);
            Integer[] integerarray = new Integer[randN];
            
            for(int j = 0; j<randN; j++){
                int next = random.nextInt(100000) + 1;
                System.out.print(next+" ");
                integerarray[j] = next;
            }
            System.out.println("\n"+maxPairWise(sorted(integerarray)));
        }
        System.out.print("--------END--------");
    }
    
    
    public static Integer[] sorted(Integer[] inputs){
        Arrays.sort(inputs);
        return inputs;
    }
    
    public static Integer maxPairWise(Integer[] sortedInputs){
        return sortedInputs[sortedInputs.length-1]*sortedInputs[sortedInputs.length-2];
//        return sortedInputs.length-1;
    }
}
