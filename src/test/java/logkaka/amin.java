package logkaka;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class amin {
	
	private static Logger log=LogManager.getLogger(amin.class.getName());
	@Test
	public void log1()
	{
		log.error("I m error");
		log.fatal("I m fatal");
		log.info("I m info");
		log.debug("I m debug");
	
	}
		
		
		
	

}
