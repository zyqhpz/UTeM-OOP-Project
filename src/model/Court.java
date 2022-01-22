package model;

public class Court {
	private String id;
	private int sport_id;
	private int status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSport_id() {
		return sport_id;
	}
	public void setSport_id(int sport_id) {
		this.sport_id = sport_id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
