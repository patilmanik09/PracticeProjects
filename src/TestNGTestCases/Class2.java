package TestNGTestCases;

import org.testng.annotations.Test;

public class Class2 {
	
	
    @Test(groups = {"sanity"})
	
	public void deletevender() {
		System.out.println("delete vender successfull");
	}

    @Test(groups = {"sanity"})

    public void deleteproduct() {
	System.out.println("delete product successfull");
    }

    @Test(groups = {"regression"})

    public void deletecurrency() {
	System.out.println("delete currency successfull");
    }

}
