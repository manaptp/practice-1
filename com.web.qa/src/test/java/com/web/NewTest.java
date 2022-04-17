package com.web;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.web.Listener.class)
public class NewTest {
	@DataProvider(name="data-provider")
	public Object[][] provider(){
		return new Object[][] {{2, 3, 5,},{4, 3, 7}};
	}
  @Test (dataProvider = "data-provider",dataProviderClass = NewTest.class)
  public void sum(int a, int b, int r) {
	  int sum;	  
	  sum = a+b;
	  System.out.println(sum);
	  Assert.assertEquals(r, sum);
  }
  @Test
  public void fail() {
	 Assert.assertTrue(false); 
  }
  
}
