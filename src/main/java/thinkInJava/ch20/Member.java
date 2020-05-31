package thinkInJava.ch20;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 16/9/7.</p>
 */
@DBTable(name = "MEMBER")
public class Member {
	@SQLString(30) String firstName;
	@SQLString(50) String lastName;
	@SQLInteger Integer age;
	@SQLString(value = 30, constraints = @Constraints(primaryKey = true))String handle;

	static int memberCount;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getAge() {
		return age;
	}

	public String getHandle() {
		return handle;
	}

	public String toString(){
		return handle;
	}
}
