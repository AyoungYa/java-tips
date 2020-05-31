package JavaTips;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2016/11/2.</p>
 */
public class StaticTest {
	public static void main(String[] args){
//		staticFunction();

		Sheep sheep1 = new Sheep();
		Sheep sheep2 = new Sheep();

		sheep1.setSize(100);
		System.out.println("sheep1's size: " + sheep1.getSize());
		System.out.println("sheep2's size: " + sheep2.getSize());

		System.out.println("===========after set sheep2 size = 200==========");
		sheep2.setSize(200);
		System.out.println("sheep1's size: " + sheep1.getSize());
		System.out.println("sheep2's size: " + sheep2.getSize());
	}/*output
	sheep1's size: 100
	sheep2's size: 100
	===========after set sheep2 size = 200==========
	sheep1's size: 200
	sheep2's size: 200
	*/

	/*static StaticTest st = new StaticTest();

	static {
		System.out.println(1);
	}
	{
		System.out.println(2);
	}
	StaticTest(){
		System.out.println(3);
		System.out.println("a = " + a + " b = " + b);
	}

	public static void staticFunction(){
		System.out.println("4");
	}

	int a = 110;
	static int b = 112;
*/

}

class Sheep {
	static int size;

	public int getSize(){
		return size;
	}

	public void setSize(int s){
		size = s;
	}
}