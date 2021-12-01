package fr.lernejo.logger;

import fr.lernejo.logger.ConsoleLogger;
import fr.lernejo.logger.Logger;

public class LoggerFactory {
    public static Logger getLogger(String name){
        return new ContextualLogger(ConsoleLogger.class.getName(),new FileLogger("logs.txt"));
        };
    }
