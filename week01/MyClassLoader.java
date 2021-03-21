import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Base64;

public class MyClassLoader extends ClassLoader{
    public static void main(String[] args) throws Exception {

        Class cl = new MyClassLoader().findClass("Hello");
        Object helloObj = cl.newInstance();
        //执行方法hello
        Method helloMethod = cl.getMethod("hello");
        helloMethod.invoke(helloObj);

    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException{

        //hello.xclass
        String helloXBase64 = "NQFFQf///8v/4/X/+f/x9v/w/+/3/+71/+3/7Pj/6/j/6v7/+cOWkZaLwf7//NfW" +
                "qf7/+7yQm5r+//CzlpGasYqSnZqNq56dk5r+//qXmpOTkP7/9ayQio2cmrmWk5r+" +
                "//W3mpOTkNGVnome8//4//f4/+nz/+j/5/7/7Leak5OQ09+ck56MjLOQnpuajd74" +
                "/+bz/+X/5P7/+reak5OQ/v/vlZ6JntCTnpGY0LCdlZqci/7/75WeiZ7Qk56RmNCs" +
                "hoyLmpL+//yQiov+/+qzlZ6JntCWkNCvjZaRi6yLjZqeksT+/+yVnome0JaQ0K+N" +
                "lpGLrIuNmp6S/v/4j42WkYuTkf7/6tezlZ6JntCTnpGY0KyLjZaRmMTWqf/e//r/" +
                "+f///////f/+//j/9//+//b////i//7//v////rVSP/+Tv////7/9f////n//v//" +
                "//7//v/0//f//v/2////2v/9//7////2Tf/97fxJ//tO/////v/1////9f/9////" +
                "+//3//r//v/z/////f/y";
        byte[] bytesX = decode(helloXBase64);
        byte[] bytesXNew = new byte[bytesX.length];
        for(int i = 0; i < bytesX.length; i++){
            bytesXNew[i] = (byte)(255 - bytesX[i]);
        }

        return defineClass(name, bytesXNew, 0, bytesXNew.length);
    }

    public  byte[] decode(String base64){
        return Base64.getDecoder().decode(base64);
    }

}

