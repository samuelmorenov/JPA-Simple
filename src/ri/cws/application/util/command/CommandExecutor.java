package ri.cws.application.util.command;

import ri.cws.application.service.BusinessException;

public interface CommandExecutor {

	<T> T execute(Command<T> cmd) throws BusinessException;

}