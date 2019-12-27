package pom;

import org.testng.annotations.Test;

public class TestCasesExecution extends Repository {

	@Test(priority = 0)
	public void verifylogin() throws InterruptedException {
		Repository.login();
		Thread.sleep(5000);

	}
}


