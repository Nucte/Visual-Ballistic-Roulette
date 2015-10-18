package log;

import java.io.PrintStream;

public class Printer {
	private static final PrintStream OUT_CONSOLE = System.out;

	public Printer() {
	}

	public void println(String str) {
		OUT_CONSOLE.println(str);
	}

	public void print(String str) {
		OUT_CONSOLE.print(str);
	}

}