package thinkInJava.ch20;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2016/10/20.</p>
 */
public class Sheep {
	private int weight;
	private int height;

	public Sheep(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}

	public Sheep() {
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
