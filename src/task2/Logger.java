package task2;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Logger {
    private static Logger logger;
    protected int num = 1;

    private Logger() {
    }

    ;

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        DateTimeFormatter simpleDateFormat = DateTimeFormatter.ofPattern("HH:mm:ss dd:MM:yyyy");
        LocalDateTime time = LocalDateTime.now();
        String ti = time.format(simpleDateFormat);
        System.out.println("[" + ti +"] № " + num++ + " " + msg);
    }

    public static void main(String[] args){
        System.out.println(new Date());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(Instant.now());
        System.out.println(ZonedDateTime.now());
    }
}
