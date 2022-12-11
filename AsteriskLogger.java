package week5Assignment;

public class AsteriskLogger implements Logger {
	
	// Step 4: Log method prints String between 3 asterisks on either side
	// Step 5: Error method prints String plus ERROR between 3 asterisks on either side
	

	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
		System.out.println(" ");
	}
	
	
	
	@Override
	public void Error(String error) {
		System.out.println("******************");
		System.out.println("***" + "ERROR: " + error + "***");
		System.out.println("******************");
		System.out.println(" ");
	}

	
}
