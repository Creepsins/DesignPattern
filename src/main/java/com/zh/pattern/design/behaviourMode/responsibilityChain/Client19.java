package com.zh.pattern.design.behaviourMode.responsibilityChain;

/*
*   责任链模式：让多个对象都有可能接收请求，从而避免请求发送者与接收者耦合在一起，将这些对象连接成一条链，
*   并且沿着这条链传递请求，直到有对象处理它为止。
*
*
* */
public class Client19 {
    static AbstractLogger getChainOfLogger(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);

        return consoleLogger;
    }
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLogger();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
