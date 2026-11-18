/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;

/**
 *
 * @author Mukoni
 */
public class ProductCalculations implements IProductCalculations {
   
    @Override
    public double GetVat_WithValidData_ReturnsCorrectValue( String price ,String calculatedVAT,String calculatedCommission, String totalSalesAmount) {
        double VAT = Double.parseDouble(calculatedVAT);
        double enteredPrice = Double.parseDouble(price);
        double commission = Double.parseDouble(calculatedCommission);
        double total = Double.parseDouble(totalSalesAmount);
        
        return VAT * 0.15;
 
    }

    @Override
    public boolean GetTotal_WithValidData_ReturnsCorrectValue(ProductCalculations dataToValidate) {
        // Product and Name cannot be empty
        if (dataToValidate.getProduct() == null
                || dataToValidate.getProduct().trim().isEmpty()) {
            return false;
        }
        if (dataToValidate.getName() == null
                || dataToValidate.getName().trim().isEmpty()) {
            return false;
            
        }
        // Commission and Total must be numbers greater than 0
        try {
            double commission = Double.parseDouble(dataToValidate.getCommission());
            double total = Double.parseDouble(dataToValidate.getTotal());
            return commission > 0 && total > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
    

