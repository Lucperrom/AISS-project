package aiss.model;

public class Person {

	private String dni;
	private String name;
	private String surname;
	private Integer age;
	

	public Person() {
	}

	public Person(String name, String surname, String dni, Integer age) {
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
