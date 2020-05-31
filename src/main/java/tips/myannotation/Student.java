package JavaTips.myannotation;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/2/21.</p>
 */
public class Student {
	private String name;
	private int age;
	private String studentId;
	
	public String getName() {
		return name;
	}
	
	@ValueBind(type = ValueBind.fieldType.STRING, value = "LiLei")
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	@ValueBind(type = ValueBind.fieldType.INT, value = "12")
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	@ValueBind(type = ValueBind.fieldType.STRING, value = "12233")
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
}
