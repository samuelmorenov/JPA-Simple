package ri.cws.application.util.command;

import ri.cws.application.service.BusinessException;

public interface Command<T> {

	T execute() throws BusinessException;
}
