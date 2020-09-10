package ri.ui;

import ri.cws.application.service.BusinessFactory;
import ri.cws.conf.Factory;
import ri.cws.infrastructure.persistence.jpa.executor.JpaExecutorFactory;
import ri.cws.infrastructure.persistence.jpa.repository.JpaRepositoryFactory;
import ri.cws.infrastructure.persistence.jpa.util.Jpa;
import ri.ui.alb.util.console.Printer;
import ri.ui.menu.Menu;

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
