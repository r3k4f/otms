package org.harper.otms.auth.service;

public interface ErrorCode {

	int USER = 100;

	int USER_EXIST_ID = USER + 1;

	int USER_EXIST_EMAIL = USER + 2;

	int USER_NAME_NOTEXIST = USER + 3;

	int USER_NOT_ACTIVATED = USER + 4;

	int USER_ALREADY_ACTIVATED = USER + 5;

	int SESSION = 200;

	int SESSION_NOTLOGIN = SESSION + 2;

	int SESSION_EXPIRED = SESSION + 1;

	int SYSTEM = 300;

	int SYSTEM_INVALID_PARAM = SYSTEM + 1;

}