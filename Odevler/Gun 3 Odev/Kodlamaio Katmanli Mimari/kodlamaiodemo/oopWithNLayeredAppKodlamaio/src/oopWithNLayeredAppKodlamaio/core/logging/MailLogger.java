package oopWithNLayeredAppKodlamaio.core.logging;

public  class MailLogger implements Logger{

	@Override
	public void add(String data) {
		System.out.println("Mail ile loglandi :" + data);
		
	}

	@Override
	public void log(String categoryName) {
		
	}

}
