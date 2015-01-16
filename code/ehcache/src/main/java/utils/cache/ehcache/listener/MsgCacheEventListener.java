/**
 * Project Name:main
 * File Name:MsgCacheListener.java
 * Package Name:com.hdsx.taxi.driver.cq.cache
 * Date:2014年4月9日上午11:12:27
 * Copyright (c) 2014, sid Jenkins All Rights Reserved.
 * 
 *
*/

package utils.cache.ehcache.listener;
import net.sf.ehcache.CacheException;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import net.sf.ehcache.event.CacheEventListener;



/**
 * ClassName:MsgCacheListener
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2014年4月9日 上午11:12:27 
 * @author   sid
 * @see 	 
 */
public class MsgCacheEventListener implements CacheEventListener{


	private volatile static MsgCacheEventListener singleton = null;
	
	public static MsgCacheEventListener getSingletonInstance() {
		if (singleton == null) {
			synchronized (MsgCacheEventListener.class) {
				if (singleton == null) {
					singleton = new MsgCacheEventListener();
				}
			}
			singleton = new MsgCacheEventListener();
		}
		return singleton;
	}

	private MsgCacheEventListener() {
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void notifyElementEvicted(Ehcache arg0, Element arg1) {
		
	}

	@Override
	public void notifyElementExpired(Ehcache arg0, Element arg1) {
		
	}

	@Override
	public void notifyElementPut(Ehcache arg0, Element arg1)
			throws CacheException {
		
	}

	@Override
	public void notifyElementRemoved(Ehcache arg0, Element arg1)
			throws CacheException {
		
	}

	@Override
	public void notifyElementUpdated(Ehcache arg0, Element arg1)
			throws CacheException {
		
	}

	@Override
	public void notifyRemoveAll(Ehcache arg0) {
		
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

