package samples;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import org.junit.Assert;
//import org.junit.Test;

public class CalculationTest {


		
		Calculator cal = new Calculator();
		
		@Test(dataProvider="dpadd")
		public void add(int exp_value, int a, int b)
		{
		Assert.assertEquals(exp_value, cal.addition(a, b));//True
			
		}
		
//		@Test
//		public void test2()
//		{
//			Assert.assertEquals(20, cal.subtraction(30, 10));//true
//			
//		}
		@DataProvider(name="dpadd")
		public Object[][] table1() {
			
			Object[][] t1 = new Object[][] {
				{10,5,5}, 
				{20,10,10},
				{60,10,10},
				{30,15,15}
			};
			
			return t1;
					
		}
				
				
		
//		int variable1=1;	//declared varaibles here to understand  it	instraed off top of the class			
//        int	variable2=2;	
//		
//		@Test
//		public void test33()
//		{
//			Assert.assertTrue(variable1<variable2);
//			
//		}
//		@Test
//		public void test44()
//		{
//			Assert.assertFalse(variable1>variable2);
//			
//		}
//		
//		@Test
//		public void test4()
//		{
//			Assert.assertNull(cal);//No
//						
//		}
//		
//	
//		
//		public void test6()
//		{
//			Assert.assertNotNull(cal);//Yes
//						
//		}
//		
//		Calculator cal1 = new Calculator();
//		Calculator cal2 = new Calculator();
//		
//		
//		@Test
//		public void test7()
//		{
//			Assert.assertNotSame(cal1, cal2);//Yes
//						
//		}
//		
//		@Test
//		public void test8()
//		{
//			Assert.assertSame(cal1, cal1);//Yes
//						
//		}
//		
//		String[] ER = {"Mango", "Apple", "Banana"};
//		String[] AR  = {"Mango", "Apple", "Banana"};
//		String[] AR1  = {"Mango", "Apple", "Banana"};
		
//		@Test
//		public void test9()
//		{
//			Assert.assertArrayEquals(ER, AR);//Yes
//						
//		}
		
		
		
		
		
		
		
	
}
