package fr.lernejo.logger;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String m) {
        System.out.println(m);
    }
}
