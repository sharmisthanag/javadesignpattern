package creational.factory;

import java.lang.reflect.InvocationTargetException;

/*
Parameter driver factory pateern
opposite of singleton pattern
 */
public class e_WebsiteFactory {
    public static c_Website getWebsite(WebsiteType websiteType)  {
        String className = websiteType.websiteClass.getName();
        Class<?> clazz = null;
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Object websiteObject = null; // invoke empty constructor
        try {
            websiteObject = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return (c_Website) websiteObject;
    }
}
