package pounter.refactoring;

import javax.swing.plaf.synth.Region; // passive

public class RefactoringDemo {

	/*
	 Refactoring:
	 Just Select and CTRL + Shift + R
	 or (for Eclipse IDE)
	 Right Click > Refactor > Rename
	 
	 Fix Code Format(for Eclipse IDE):
	 Just select and CTRL + Shift + F
	 or
	 Right Click > Source > Format
	*/
	public static void main(String[] args) {
		/* Refactoring */
		RefactoringDemo r = new RefactoringDemo();
		
		int counter = 0;
		System.out.println(counter);
		
		someMethod();
		
		/* Create variable for repeaters (automatic state) */
		System.out.println(10 + 5); // not connect variable state
		
		int extractLocalVariable = 10 + 6;
		System.out.println(extractLocalVariable); // with automatic state (Select and ALT + Shift + L)
		
		/* Automatic Method Create (for repeater code columns)
		 * Select Code Columns and ALT + Shift + M
		 */
		
		/* Delete Passive Packages
		 * CTRL + Shift + O
		 */
	}
	
	public static void someMethod() {
		
	}
}
