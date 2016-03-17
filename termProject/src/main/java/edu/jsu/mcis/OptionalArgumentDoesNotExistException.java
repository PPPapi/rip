package edu.jsu.mcis;
public class OptionalArgumentDoesNotExistException extends RuntimeException {
	public OptionalArgumentDoesNotExistException(String argName, String programName, String argList) {
		super("usage: java " + programName + " " + argList + "\n" + programName + ".java: error: argument " + argName + " does not exist");
	}
	
	
	
}