package aiss.model;

import java.time.LocalDateTime;

public class Booking {

	private Integer id;
	private Person person;
	private Integer night;
	private Room room;
	private Board board;
	private Integer adult;
	private Integer child;
	private Double price;
	private LocalDateTime fecha;
	
	public Booking(Person person, Integer night, Room room, Board board, Integer adult, Integer child) {
		//hola que tal estas?//Bien
		this.person= person;
		this.night= night;
		this.room= room;
		this.board=board;
		this.adult=adult;
		this.child=child;
		this.fecha=LocalDateTime.now();
		this.room.setAvailable(false);
	}
		
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Integer getNight() {
		return night;
	}

	public void setNight(Integer night) {
		this.night = night;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public Integer getAdult() {
		return adult;
	}

	public void setAdult(Integer adult) {
		this.adult = adult;
	}

	public Integer getChild() {
		return child;
	}

	public void setChild(Integer child) {
		this.child = child;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Double getPrice() {
		
		Double price = room.getNightPrice()*night *0.9*child;
		if(board==Board.FULLBOARD) price += 15*night*adult +7.50*night*child;
		if(board==Board.HALFBOARD) price += 7*night*adult + 3.50*night*child;
		if(room.getView()==View.BEACH) price=+22.80;
		else if(room.getView()==View.SWIMINGPOOL) price =+7.20;
		return price;
		
	}
	public void setPrice(Double price) {
		this.price=price;
	}


}
