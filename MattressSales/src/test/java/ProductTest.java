/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mukoni
 */
public class ProductTest {
    
     private final ProductSales productSales = new ProductSales();

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
    
        double result = Product.getTotal("5000");

        assertEquals(500.0, result, 0.001);
    }

    @Test
    public void() {
        
        double result = Product.getTotal("5000", "10");

        assertNotEquals(50000.0, result, 0.001);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        // Valid data should pass
        ProductSales  valid = new ProductSales ("Joe Bloggs", "", "Cozy Nights Monarch", "3500");
        assertTrue(Product.GetAverage(valid));

        // Empty name should fail
        ProductSales emptyName = new ProductSales("Joe Bloggs", "", "Cozy Nights Monarch", "3500");
        assertFalse(Product.GetAvearge(emptyName));
    }
}
    

    
}
