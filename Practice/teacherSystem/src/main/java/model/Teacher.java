package model;

/**
 * @author ChnpngWng
 *
 * @date   Dec 15, 20228:49:27 AM
 */
public class Teacher {
	private int id;
	private String name;
	private String sex;
	private int age;
	private String position;
	/**
	 * 
	 */
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param name
	 * @param sex
	 * @param age
	 * @param position
	 */
	public Teacher(int id, String name, String sex, int age, String position) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.position = position;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", position=" + position
				+ "]";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	
}
