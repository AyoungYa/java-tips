package thinkInJava.ch20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2016/10/20.</p>
 */
public class SheepTest {

	public static void main(String[] args){
		List<Sheep> sheepList = getSheep(3);
		if(sheepList != null) return;

		sheepList = new ArrayList<>();
		Sheep am = new Sheep(10, 23);
		sheepList.add(am);

		System.out.println(sheepList.size());
	}

	public static List<Sheep> getSheep(int i){
		if(i < 10)
			return null;
		else return new ArrayList<>(Arrays.asList(new Sheep(1, 2)));
	}
}
