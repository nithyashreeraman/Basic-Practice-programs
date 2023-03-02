/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sum;
import java.util.*;

import java.util.Scanner;
/**
 *
 * @author nithy
 */
public class Sum {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the target variable: ");
        int t=sc.nextInt();
        int sum;
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++)
        {
            
            sum=a[i]+a[i+1];
            
            if(sum==t)
            {
                System.out.println("\nThe output: [" + i+ "," + (i+1)+"]");
            }
        }
    
    }
}
