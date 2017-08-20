package mr.huntlab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainLogback {
	
	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(MainLogback.class);
		logger.debug("MainLogback main class debug message.");
		logger.error("MainLogback main class error message.");
		logger.info("MainLogback main class info message.");
		logger.trace("MainLogback main class trace message.");
		logger.warn("MainLogback main class warn message.");
	}
}
