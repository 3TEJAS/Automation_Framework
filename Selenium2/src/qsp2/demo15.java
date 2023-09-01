package qsp2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo15 {
		@Test
		public void test1()
		{
			Reporter.log("hello",true);
		}
			@Test
			public void test2()
			{
				Reporter.log("world",true);
			}

		}