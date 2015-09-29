import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Formatter;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Scanner;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

  
public class app implements Filter{ 
  
    private static final Logger LOGGER = Logger.getLogger(app.class.getName());
    public static void main(String[] args) throws SecurityException, IOException {
        LOGGER.setLevel(Level.ALL);
        
        LOGGER.info("Logger Name: "+LOGGER.getName());  
        Handler fileHandler  = null;
        Formatter simpleFormatter = null;
        fileHandler  = new FileHandler("./error.log");
        simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);
        fileHandler.setLevel(Level.ALL);
        LOGGER.setFilter(new app());
        LOGGER.addHandler(fileHandler);
            
        Scanner in = new Scanner(System.in);
        System.out.println(">>>>>>Welcome to online Office Portal<<<<<<<");
        System.out.println("Enter Your Name :");
        String name = in.nextLine();
        System.out.println("Enter The reason for Bonafide From below");
        String option[] = {"1.Education Loan","2.USA visa","3.Sports Loan"};
        for(int i=0;i<option.length;i++)
        {
            System.out.println(">>>"+option[i]);
        }
        LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");
        System.out.print("Enter your Choice:");
        int a = in.nextInt();
        LOGGER.config("index is set to "+a);
          
        try{ 
            System.out.println(option[a]);
        }catch(ArrayIndexOutOfBoundsException ex){
            LOGGER.log(Level.INFO,"Exception occurs",ex);
            LOGGER.log(Level.SEVERE, "Exception occur String Array", ex);
        } 
          
  
    }
    @Override 
    public boolean isLoggable(LogRecord record) {
        if(record == null)
            return false; 
          
        String message = record.getMessage()==null?"":record.getMessage();
          
        if(message.contains("Exception"))
            return true; 
          
        return false; 
    }  
  
} 