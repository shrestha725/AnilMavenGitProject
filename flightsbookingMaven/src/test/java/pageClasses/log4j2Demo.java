package pageClasses;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class log4j2Demo {
	
	private static final Logger log = LogManager.getLogger(log4j2Demo.class.getName());
	
	public static void main(String[] args) {
		log.debug("error for debug message is printed");
		log.error("error for error message is printed");
		log.fatal("error for fatal message is printed");
		
		
		
	}
	

}
