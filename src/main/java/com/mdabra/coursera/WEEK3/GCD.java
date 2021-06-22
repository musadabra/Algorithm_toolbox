/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mdabra.coursera.WEEK3;

/**
 *
 * @author dell
 */
import java.util.*;

public class GCD {
  private static int gcd_naive(int a, int b) {
    int remender = a;
    int result = 1;
    
    if(a == 0)
        return b;
    
    while(remender > 0){
        remender = b % a;
        b = a;
        result = a;
        a = remender;
        
    }

    return result;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_naive(a, b));
  }
}

