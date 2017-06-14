package com.capgemini.cafey.model;

import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author bu
 */
public class BillTest {

    @Test
    public void testgetEmptyList() {
        String[] purchaseItems = new String[0];
        assertEquals(new BigDecimal("0.00"), new Bill(purchaseItems).getBill());
    }
    

}
