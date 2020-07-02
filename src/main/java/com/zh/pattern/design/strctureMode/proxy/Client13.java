package com.zh.pattern.design.strctureMode.proxy;

import com.zh.pattern.design.strctureMode.ProxyFactory;

/*
*   静态代理：
*       代理对象,不需要实现接口
        代理对象的生成,是利用JDK的API,动态的在内存中构建代理对象(需要我们指定创建代理对象/目标对象实现的接口的类型)
        动态代理也叫做:JDK代理,接口代理

        代理类所在包:java.lang.reflect.Proxy
        JDK实现代理只需要使用newProxyInstance方法,但是该方法需要接收三个参数,完整的写法是:
        static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h )

        ClassLoader loader:指定当前目标对象使用类加载器,获取加载器的方法是固定的
        Class<?>[] interfaces:目标对象实现的接口的类型,使用泛型方式确认类型
        InvocationHandler h:事件处理,执行目标对象的方法时,会触发事件处理器的方法,会把当前执行目标对象的方法作为参数传入
* */
public class Client13 {
    public static void main(String[] args) {
        IUserDao target = new UserDao();

        //给目标对象创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();

        proxy.save();
    }
}
