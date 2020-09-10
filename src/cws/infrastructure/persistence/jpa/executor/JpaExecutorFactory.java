package cws.infrastructure.persistence.jpa.executor;

import cws.application.util.command.ComandExecutorFactory;
import cws.application.util.command.CommandExecutor;

public class JpaExecutorFactory implements ComandExecutorFactory {

	@Override
	public CommandExecutor forExecutor() {
		return new JpaCommandExecutor();
	}

}
