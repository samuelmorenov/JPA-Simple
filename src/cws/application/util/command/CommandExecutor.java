package cws.application.util.command;

import cws.application.service.BusinessException;

public interface CommandExecutor {

	<T> T execute(Command<T> cmd) throws BusinessException;

}