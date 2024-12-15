package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	@Before("@NetBanking")
	public void getDataForNet() {
		System.out.println("Sending data for Net");
	}
	@Before("@Mortgage")
	public void getDataForMortage() {
		System.out.println("Sending data for mortage");
	}
	@After
	public void tear() {
		System.out.println("tear down after each test");
	}
}
