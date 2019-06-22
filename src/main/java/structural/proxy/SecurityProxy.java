package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {
    private Object obj;

    public SecurityProxy(Object obj) {
        this.obj = obj;
    }

    public static Object newInstance(Object obj) {
        return Proxy.newProxyInstance(
                obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new SecurityProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        try {
            result = method.invoke(obj, args);

        } catch (InvocationTargetException e) {
            e.printStackTrace();
           // throw e.getTargetException();
        } catch (Exception e) {
            //throw new RuntimeException("unexpected exception:"+e);
        }
        return result;
    }
}
