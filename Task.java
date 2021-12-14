package Model;

public class Task {
	private long datecreated;
	private String dscription;
	private String task;
	
	
	public Task() {
		
	}

	
	public Task(long datecreated, String dscription, String task) {
		this.datecreated = datecreated;
		this.dscription = dscription;
		this.task = task;
	}

	public long getDatecreated() {
		return datecreated;
	}
	
	public void setDatecreated(long datecreated) {
		this.datecreated = datecreated;
	}
	public String getDscription() {
		return dscription;
	}
	public void setDscription(String dscription) {
		this.dscription = dscription;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}

	

	
	



	

	
	


	
	
}
