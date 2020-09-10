package cws.application.util.command;

import cws.application.service.BusinessException;

public interface Command<T> {

	T execute() throws BusinessException;
}
