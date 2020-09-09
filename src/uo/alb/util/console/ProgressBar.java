package uo.alb.util.console;

import uo.alb.util.console.Console;

public class ProgressBar {
	private String show;
	private int length = 100;
	private int counter = 0;

	public ProgressBar(String s) {
		this.show = s;
	}

	public void inc() {
		Console.print( show );
		counter++;
		if (counter % length == 0) Console.println();
	}

}
