package patterndesign.creational.singleton;

/**
 * <p>Description: 静态内部类的方式</p>
 * 这种方式同样利用了classloder的机制来保证初始化instance时只有一个线程，它跟饿汉模式的不同：饿汉模式只要Singleton类被装载了，
 * 那么instance就会被实例化（没有达到lazy loading效果），而这种方式是Singleton类被装载了，instance不一定被初始化。因为
 * InnerSingletonHolder类没有被主动使用，只有显示通过调用getInstance方法时，才会显示装载InnerSingletonHolder类，从而实例化instance。
 * 想象一下，如果实例化instance很消耗资源，我想让他延迟加载，另外一方面，我不希望在Singleton类加载时就实例化，因为我不能确保Singleton类还可
 * 能在其他的地方被主动使用从而被加载，那么这个时候实例化instance显然是不合适的。
 * 参考：http://www.blogjava.net/kenzhh/archive/2016/03/28/357824.html
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/23.</p>
 *
 *
 */
public class SingletonInner {
	private SingletonInner(){}
	
	private static final class InnerSingletonHolder{
		private static final SingletonInner INSTANCE = new SingletonInner();
	}
	
	public static SingletonInner getInstance(){
		return InnerSingletonHolder.INSTANCE;
	}
}
