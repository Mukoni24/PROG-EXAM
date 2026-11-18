/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mukoni
 */
public class MattressSalesTest {
    
    private final ProductCalculations productCalculations = new ProductCalculations();

    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
    
        double result = ProductCalculations.getVat("5000");

        assertEquals(500.0, result, 0.001);
    }

    @Test
    public void() {
        // 50000 is what the old, incorrect calculation produced (cost * rate).
        // The correct method must NOT return this value.
        double result = ProductCalculations.getVat("5000", "10");

        assertNotEquals(50000.0, result, 0.001);
    }

    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        // Valid data should pass
        MattressSales valid = new MattressSales("Joe Bloggs", "", "Cozy Nights Monarch", "3500");
        assertTrue(ProductCalculations.GetTotal(valid));

        // Empty name should fail
        MattressSales emptyName = new MattressSales("Joe Bloggs", "", "Cozy Nights Monarch", "3500");
        assertFalse(ProductCalculations.GetTotal(emptyName));
    }
}
    
