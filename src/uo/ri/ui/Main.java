package uo.ri.ui;

import uo.alb.util.console.Printer;
import uo.ri.cws.application.service.BusinessFactory;
import uo.ri.cws.conf.Factory;
import uo.ri.cws.infrastructure.persistence.jpa.executor.JpaExecutorFactory;
import uo.ri.cws.infrastructure.persistence.jpa.repository.JpaRepositoryFactory;
import uo.ri.cws.infrastructure.persistence.jpa.util.Jpa;
import uo.ri.ui.menu.Menu;

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
