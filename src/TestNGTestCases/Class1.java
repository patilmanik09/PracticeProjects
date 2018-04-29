package TestNGTestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {

	
	@Test (groups = {"sanity", "regression"})
	public void login() {
		System.out.println("Login succesfull");
}
    
	@Test (groups = {"sanity", "regression"})
	
	public void logout() {
		System.out.println("Log out successfull");
	}
	
    @Test(groups = {"sanity"},priority =1)
	
	public void addvender() {
		System.out.println("add vender successfull");
	}

    @Test(groups = {"sanity"})

    public void addproduct() {
	System.out.println("add product successfull");
    }

    @Test(groups = {"regression"})

    public void addcurrency() {
	System.out.println("add currency successfull");
    }
}