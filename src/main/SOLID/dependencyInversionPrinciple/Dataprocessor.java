package dependencyInversionPrinciple;

public class Dataprocessor {
	 private Database database = null;

	    public void DataProcessor(Database database) {
	        this.database = database;
	    }

	    public void processData(String data) {
	        // process data
	        database.save(data);
	    }
}
