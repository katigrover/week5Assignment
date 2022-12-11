package week5Assignment;

public class App {
	
	// Step 9: Created App Class with main method
	// Step 10: Instantiated an instance of each the logger classes that implement the logger interface
	// Step 11: Test both methods on both instances, passing in Strings of my choice

	public static void main(String[] args) {
		
		Logger astlogger = new AsteriskLogger();
		String test = "Hello";
		String test1 = "Taco";
		
		
		astlogger.Log(test);
		astlogger.Error(test);	
		astlogger.Log(test1);
		astlogger.Error(test1);
	
		Logger spaceLogger = new SpacedLogger();
		
		spaceLogger.Log(test);
		spaceLogger.Error(test);	
		spaceLogger.Log(test1);
		spaceLogger.Error(test1);
		
	}
}
