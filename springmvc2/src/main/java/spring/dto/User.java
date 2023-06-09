package spring.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



public class User {

	@NotEmpty(message="*Name can't be empty")
	private String name;
	
	@Min(value =14,message="*Age can't be lessthan 14")
	@Max(value = 110,message="*Age can't be greater than 110")
	@NotNull(message="*Age can't be null")
	private Integer age;
	
	@NotEmpty(message="*Email can't be empty")
	@Email(message="*Enter valid email")
	private String email;
	
	@NotEmpty(message="*Country can't be empty")
	private String country;
	
	public User(String name, Integer age, String email, String country) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.country = country;
	}
	public User() {
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getCountry() {
		return country;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}