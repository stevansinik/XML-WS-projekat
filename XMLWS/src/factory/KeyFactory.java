package factory;

import java.util.concurrent.atomic.AtomicLong;

public class KeyFactory {
	public static AtomicLong keyGenerator = new AtomicLong();
	public static Long nextKey() {
		return keyGenerator.incrementAndGet();
	}
}
