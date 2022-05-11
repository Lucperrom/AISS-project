package aiss.model;

public class Room {

	private Integer num;
	private Integer floor;
	private Double nightPrice;
	private Integer bed;
	private Integer bathroom;
	private Boolean available;
	private View view;
	
	public Room(Integer num, Integer floor, Double nightPrice, Integer bed, Integer bathroom, View View) {
		this.num = num;
		this.floor= floor;
		this.nightPrice = nightPrice;
		this.bed= bed;
		this.bathroom = bathroom;
		this.view = view;
	}
	

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public Double getNightPrice() {
		return nightPrice;
	}

	public void setNightPrice(Double nightPrice) {
		this.nightPrice = nightPrice;
	}

	public Integer getBed() {
		return bed;
	}

	public void setBed(Integer bed) {
		this.bed = bed;
	}

	public Integer getBathroom() {
		return bathroom;
	}

	public void setBathroom(Integer bathroom) {
		this.bathroom = bathroom;
	}
	
	public Boolean getAvailable() {
		return available;
	}


	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
	public View getView() {
		return view;
	}
	public void setView(View view) {
		this.view= view;
	}
	
}
