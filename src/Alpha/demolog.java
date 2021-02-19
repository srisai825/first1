package Alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demolog {

	static Logger log = LogManager.getLogger(demolog.class.getName());

	public static void main(String[] args) {

		log.debug("Debugging going on");
		log.info("New Information");
		log.warn("Its a warning message");
		log.error("Error message");
		log.fatal("This is fatal");

	}

}
