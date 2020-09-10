package ri.cws.infrastructure.persistence.jpa.executor;

import ri.cws.application.util.command.ComandExecutorFactory;
import ri.cws.application.util.command.CommandExecutor;

public class JpaExecutorFactory implements ComandExecutorFactory {

	@Override
	public CommandExecutor forExecutor() {
		return new JpaCommandExecutor();
	}

}
