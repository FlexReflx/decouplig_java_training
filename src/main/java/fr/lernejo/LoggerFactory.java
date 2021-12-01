package fr.lernejo;

public class LoggerFactory {
    public static Logger getLogger(String name){
        return new Logger() {
            @Override
            public void log(String m) {
                System.out.println(m);
            }
        };
    }
}
