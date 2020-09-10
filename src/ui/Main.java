package ui;

import cws.application.service.BusinessFactory;
import cws.conf.Factory;
import cws.infrastructure.persistence.jpa.executor.JpaExecutorFactory;
import cws.infrastructure.persistence.jpa.repository.JpaRepositoryFactory;
import cws.infrastructure.persistence.jpa.util.Jpa;
import ui.menu.Menu;
import ui.util.console.Printer;

public class Main {

	public static void main(String[] args) {
		new Main()
			.configure()
			.run()
			.close();
	}

	private Main configure() {
		Factory.service = new BusinessFactory();
		Factory.repository = new JpaRepositoryFactory();
		Factory.executor = new JpaExecutorFactory();

		return this;
	}

	private Main run() {
		try {
			new Menu().execute();

		} catch (RuntimeException rte) {
			Printer.printRuntimeException(rte);
		}
		return this;
	}

	private void close() {
		Jpa.close();
	}

}
