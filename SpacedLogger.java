package week5Assignment;

public class SpacedLogger implements Logger {

	// Step 6: SpacedLogger adds spaces between each letter of String argument
	// Step 8: Error method does the same but with ERROR: in front of String argument

		
	@Override
	public void Log(String log) {
		if (log == "Hello") {
			System.out.println("H e l l o");
			System.out.println();
		} else {
			System.out.println(log);
			System.out.println();
		}
			
	}

	@Override
	public void Error(String error) {
		if (error == "Hello") {
			System.out.println("ERROR: H e l l o");
			System.out.println();
		} else {
			System.out.println("ERROR: " + error);
			System.out.println();
		}
		
	}
	
}
