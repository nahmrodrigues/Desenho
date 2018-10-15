package objectPool;

public interface Pool<T> {
	T acquire();
	void release(T t);
}
