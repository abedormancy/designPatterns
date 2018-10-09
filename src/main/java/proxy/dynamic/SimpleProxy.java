package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 简单的代理对象
 */
public class SimpleProxy implements InvocationHandler {

    private Object obj;
	private IAdvice advice;
	
	public Object bind(Object obj, IAdvice advice) {
		this.obj = obj;
		this.advice = advice;
		Class<? extends Object> clz = obj.getClass();
		return Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), this);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T bind(Class<T> clz, IAdvice advice) {
		try {
			this.obj = clz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.advice = advice;
		return (T) Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), this);
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		advice.before();
		result = method.invoke(obj, args);
		advice.after();
		return result;
	}
}