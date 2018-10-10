package com.kodilla.patterns.singleton;

public class Logger {
    private String lastLog = "";
    private static Logger loggerInstance = null;

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public static Logger getInstance() {
        if (loggerInstance == null) {
            synchronized(Logger.class) {
                if (loggerInstance == null) {
                    loggerInstance = new Logger();
                }
            }
        }
        return loggerInstance;
    }

    public String getLastLog() {
        return lastLog;
    }
}