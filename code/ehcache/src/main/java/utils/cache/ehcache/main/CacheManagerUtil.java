/**
 * Project Name:main
 * File Name:CacheManagerUtil.java
 * Package Name:com.hdsx.taxi.driver.cq.cache
 * Date:2014年4月9日下午12:49:55
 * Copyright (c) 2014, sid Jenkins All Rights Reserved.
 * 
 *
*/

package utils.cache.ehcache.main;

import java.util.List;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import utils.utils.LogUtil;


/**
 * ClassName:CacheManagerUtil
 * Date:     2014年4月9日 下午12:49:55 
 * @author   sid
 * @see 	 
 */
public class CacheManagerUtil {

	private CacheManager cm = null;
	
	private static String path = CacheManagerUtil.class
			.getResource("/").getPath()
			+"ehcache.xml";  

	private volatile static CacheManagerUtil singleton = null;
	
	public static CacheManagerUtil getSingletonInstance() {
		if (singleton == null) {
			synchronized (CacheManagerUtil.class) {
				if (singleton == null) {
					singleton = new CacheManagerUtil();
				}
			}
			singleton = new CacheManagerUtil();
		}
		return singleton;
	}

	private CacheManagerUtil() {
		if (LogUtil.getInstance().getLogger(CacheManagerUtil.class).isDebugEnabled()) {
			LogUtil.getInstance().getLogger(CacheManagerUtil.class).debug("CacheManagerUtil() - start path:"+path); //$NON-NLS-1$
		}

		this.cm = CacheManager.create(path);

		if (LogUtil.getInstance().getLogger(CacheManagerUtil.class).isDebugEnabled()) {
			LogUtil.getInstance().getLogger(CacheManagerUtil.class).debug("CacheManagerUtil() - end"); //$NON-NLS-1$
		}
	}

	/**
	 * 
	 * getCache:(获取缓存对象). 
	 *
	 * @author sid
	 * @param name
	 * @return
	 */
	public Cache getCache(String name){
		return this.cm.getCache(name);
	}
	/**
	 * 
	 * put:(在指定缓存对象中加入需要缓存的对象). 
	 *
	 * @author sid
	 * @param cacheName
	 * @param key
	 * @param value
	 */
    public void put(String cacheName, String key, Object value) {  
        Cache cache = this.cm.getCache(cacheName);  
        Element element = new Element(key, value);  
        cache.put(element);  
    }  
  
    /**
     * 
     * get:(根据key从指定缓存对象中获取对象). 
     *
     * @author sid
     * @param cacheName
     * @param key
     * @return
     */
    public Object get(String cacheName, String key) {  
        Cache cache = this.cm.getCache(cacheName);  
        Element element = cache.get(key);  
        return element == null ? null : element.getObjectValue();  
    }  
    
    /**
     * 
     * remove:(从指定缓存对象中清除对象). 
     *
     * @author sid
     * @param cacheName
     * @param key
     */
    public void remove(String cacheName, String key) {  
        Cache cache = this.cm.getCache(cacheName);  
        cache.remove(key);  
    }  
    
    /**
     * 
     * getKeys:(获取keys列表). 
     *
     * @author sid
     * @param cacheName
     * @return
     */
	@SuppressWarnings("rawtypes")
	public List getKeys(String cacheName){
        Cache cache = this.cm.getCache(cacheName);  
        return cache.getKeys();
    }
	
	/**
	 * 
	 * containsKey:(判断消息是否存在). 
	 *
	 * @author sid
	 * @param cacheName
	 * @param key
	 * @return
	 */
	public Boolean containsKey(String cacheName,String key){
        Cache cache = this.cm.getCache(cacheName);  
        Element element = cache.get(key);  
        return element == null ? false : true;  
	}
}

