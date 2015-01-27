package mizdebsk.plexus.hello;

import org.codehaus.plexus.DefaultPlexusContainer;
import org.codehaus.plexus.PlexusContainer;
import org.codehaus.plexus.logging.Logger;

public class Hello {

	private Logger logger;

	public static void main(String[] args) throws Exception {
		PlexusContainer container = new DefaultPlexusContainer();
		Hello hello = container.lookup(Hello.class);
		hello.logger.info("Hello Plexus");
	}

}
