/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;

/**
 *
 * @author Mukoni
 */
public class Product {
    public class Product implements IProduct {

    /**
     * Calculates total sales from all years and quarters.
     * @param productSales
     * @return 
     */
    @Override
    public int TotalSales(int[][] productSales) {

        int total = 0;

        for (int[] year : productSales) {
            for (int sale : year) {
                total += sale;
            }
        }

        return total;
    }

    /**
     * Calculates average sales.
     * @param productSales
     * @return 
     */
    @Override
    public double AverageSales(int[][] productSales) {

        int total = 0;
        int count = 0;

        for (int[] year : productSales) {
            for (int sale : year) {
                total += sale;
                count++;
            }
        }

        return (double) total / count;
    }

    /**
     * Finds the highest sale value.
     */
    @Override
    public int MaxSale(int[][] productSales) {

        int max = productSales[0][0];

        for (int[] year : productSales) {
            for (int sale : year) {

                if (sale > max) {
                    max = sale;
                }
            }
        }

        return max;
    }

    /**
     * Finds the lowest sale value.
     * @param productSales
     * @return 
     */
    @Override
    public int MinSale(int[][] productSales) {

        int min = productSales[0][0];

        for (int[] year : productSales) {
            for (int sale : year) {

                if (sale < min) {
                    min = sale;
                }
            }
        }

        return min;
    }
}
    
}
