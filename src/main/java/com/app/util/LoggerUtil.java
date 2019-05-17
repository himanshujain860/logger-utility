package com.app.util;

import org.apache.log4j.Logger;

public class LoggerUtil {

    private LoggerUtil(){}

    public static void printLogMessage(Class t, Object data, Exception e) {
        String methodName = new Throwable().getStackTrace()[1].getMethodName();
        String className = new Throwable().getStackTrace()[1].getClassName();
        String message = new StringBuilder("Exception while ")
                .append(methodName).append(" in ").append(className)
                .append(", Data : ").append(data)
                .append(", Exception Message : ").append(e.getMessage()).toString();
        Logger logger = Logger.getLogger(t);
        logger.error(message, e);
    }

    public static void printLogMessage(Class t, Object data) {
        String methodName = new Throwable().getStackTrace()[1].getMethodName();
        String className = new Throwable().getStackTrace()[1].getClassName();
        String message = new StringBuilder("Data looged while ")
                .append(methodName).append(" in ").append(className)
                .append(", Data : ").append(data).toString();
        Logger logger = Logger.getLogger(t);
        logger.info(message);
    }
}
