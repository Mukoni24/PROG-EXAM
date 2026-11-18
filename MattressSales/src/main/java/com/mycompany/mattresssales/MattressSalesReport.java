/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;

/**
 *
 * @author Mukoni
 */
public class MattressSalesReport {
    public static void main(String[] args) {

        // Two-dimensional array storing sales data
        int[][] sales = {
                {300, 150, 700}, // Year 1
                {250, 200, 600}  // Year 2
        };

        int total = 0;
        
        int count = 0;

        // Traverse the 2D array once for efficiency
        for (int[] year : sales) {
            for (int value : year) {

                total += value;
                count++;

                if (value > max) {
                    max = value;
                }

                if (value < min) {
                    min = value;
                }
            }
        }

        double average = (double) total / count;

       
    }
}

  