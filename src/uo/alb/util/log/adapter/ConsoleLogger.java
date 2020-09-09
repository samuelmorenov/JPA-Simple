package uo.alb.util.log.adapter;

import uo.alb.util.log.adapter.BaseLogger;
import uo.alb.util.console.Console;
import uo.alb.util.log.Logger;

public class ConsoleLogger extends BaseLogger implements Logger {

	@Override
	protected void print(String line) {
		Console.println( line );
	}


}
