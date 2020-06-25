package com.shoppingcart.cdk.junit.testcase;

import org.junit.Test;

import com.shoppingcart.cdk.Customer;
import com.shoppingcart.cdk.CustomerFactory;

import junit.framework.TestCase;

public class ShoppingCartCustomerTestCase extends TestCase {
	
	/*
	 * Test cases for regular customers according to test cases begins
	 * Actual : $5000
	 * Expected : $5000
	 */
	@Test
	public void testPurchaseAmountRegularCustomerSlab1() {
		Double expectedResult = 5000.00;
		Double input = 5000.00;
		testRegularCustomerCommonCodeBlock(expectedResult, input);
	}
	
	/*
	 * Actual : $10000
	 * Expected : $9500
	 */
	@Test
	public void testPurchaseAmountRegularCustomerSlab2() {
		Double expectedResult = 9500.00;
		Double input = 10000.00;
		testRegularCustomerCommonCodeBlock(expectedResult, input);
	}
	
	/*
	 * Test cases for regular customers according to test cases ends
	 * Actual : $15000
	 * Expected : $13500
	 */
	@Test
	public void testPurchaseAmountRegularCustomerSlab3() {
		Double expectedResult = 13500.00;
		Double input = 15000.00;
		testRegularCustomerCommonCodeBlock(expectedResult, input);
	}
	
	
	/*
	 * Test cases for Premium customers according to test cases begins
	 * Actual : $4000
	 * Expected : $3600
	 */
	@Test
	public void testPurchaseAmountPremiumCustomerSlab1() {
		Double expectedResult = 3600.00;
		Double input = 4000.00;
		testPremiumCustomerCommonCodeBlock(expectedResult, input);
	}
	
	/*
	 * Actual : $8000
	 * Expected : $7000
	 */
	@Test
	public void testPurchaseAmountPremiumCustomerSlab2() {
		Double expectedResult = 7000.00;
		Double input = 8000.00;
		testPremiumCustomerCommonCodeBlock(expectedResult, input);
	}
	
	/*
	 * Actual : $12000
	 * Expected : $10200
	 */
	@Test
	public void testPurchaseAmountPremiumCustomerSlab3() {
		Double expectedResult = 10200.00;
		Double input = 12000.00;
		testPremiumCustomerCommonCodeBlock(expectedResult, input);
	}
	
	/*
	 * Actual : $20000
	 * Expected : $15800
	 */
	@Test
	public void testPurchaseAmountPremiumCustomerSlab4() {
		Double expectedResult = 15800.00;
		Double input = 20000.00;
		testPremiumCustomerCommonCodeBlock(expectedResult, input);
	}
	
	public void testRegularCustomerCommonCodeBlock(Double expectedResult, Double input) {
		try {
			CustomerFactory customerFactory = new CustomerFactory();
			Customer regular = customerFactory.getCustomer("Regular");
			assertEquals(expectedResult, regular.calculateBillAmount(input));
		} catch (AssertionError e) {
			throw e;
		}
	}
	
	public void testPremiumCustomerCommonCodeBlock(Double expectedResult, Double input) {
		try {
			CustomerFactory customerFactory = new CustomerFactory();
			Customer premium = customerFactory.getCustomer("Premium");
			assertEquals(expectedResult, premium.calculateBillAmount(input));
		} catch (AssertionError e) {
			throw e;
		}
	}
}
