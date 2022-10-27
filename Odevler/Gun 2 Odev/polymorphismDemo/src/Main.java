import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ders 38 - YouTube");
//
//        EmailLogger logger= new EmailLogger();
//        logger.Log("Log Mesaji");

//        BaseLogger [] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//
//        for (BaseLogger logger:loggers){
//            logger.Log("Log Mesaji");
//        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();


    }
}