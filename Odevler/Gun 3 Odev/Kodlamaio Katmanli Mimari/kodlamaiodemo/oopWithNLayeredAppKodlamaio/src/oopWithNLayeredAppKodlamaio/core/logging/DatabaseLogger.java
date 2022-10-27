package oopWithNLayeredAppKodlamaio.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void add(String data) {
		System.out.println("Database ile loglandi : " + data);

	}

	@Override
	public void log(String categoryName) {
		
	}

}
