import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
  
public class config { 
  
    private static final LogManager logManager = LogManager.getLogManager();
    private static final Logger LOGGER = Logger.getLogger("confLogger");
    static{ 
        try { 
            logManager.readConfiguration(new FileInputStream("./conf.properties"));
        } catch (IOException exception) {
            LOGGER.log(Level.SEVERE, "Error in loading configuration",exception);
        } 
    } 
    public static void main(String[] args) {
        LOGGER.fine("At End of the Day we are learning JAVA logging");
      LOGGER.warning("JAVA program is running out of memory!");
          
    } 
} 