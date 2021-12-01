package fr.lernejo.logger;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class ContextualLogger implements Logger{

    String name;
    Logger log;
    public ContextualLogger(String name,Logger log){
        this.name=name;
        this.log = log;
    }
    @Override
    public void log(String m) {
        log.log(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))+ LocalTime.now().format(DateTimeFormatter.ofPattern( "   HH:mm:ss.SSS")) + " " + name + " " + m);
    }
}
