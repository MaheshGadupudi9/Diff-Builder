package co.za.javers.diff;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class ByteArrayDemo {
    public static void main(String[] args) throws IOException {
        byte c1[]={10,20,30,40,50};
        byte c2[]={60,70,80,90};
        ByteArrayOutputStream b1 = new ByteArrayOutputStream();
        ByteArrayOutputStream b2 = new ByteArrayOutputStream(10);
        b2.write(100);
        System.out.println("b2.size() = " + b2.size());
        b2.write(c1,0,c2.length);
        System.out.println("b2.size() = " + b2.size());
        byte[] b = b2.toByteArray();
        System.out.println("b.length = " + b.length);
        b2.flush();
        System.out.println("b2 = " + b2.size());
        b2.reset();
        System.out.println("b2 = " + b2.size());
        b1.writeTo(b2);
        System.out.println("b1 = " + b1.size());

    }

    public static void main1(String[] args) {



        byte[] bytes = {2, 3, 4, 5};
        for (final  int i:getCharArray(bytes)){
            System.out.println("i = " + i);
        }

    }

    private static char[] getCharArray(byte[] bytes) {
        char[] chars = new char[4];
        int i=0;
        for (byte aByte : bytes) {
            chars[i]=(char)aByte++;
            i++;
        }
        return chars;
    }

    public static void main3(String[] args) {
        Integer before = new Integer(25);
        Integer after=++before==26?5:new Integer(10);
        System.out.println(after.intValue()-before.intValue());
    }


}

