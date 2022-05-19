package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class DoubleIKMTest {

    public static void main(String[] args) {
        Double d = 1.0;

        if(d instanceof Number){
            d= d++;
        }

        boolean c1= (d==2) ? true:false;

        if (c1) {
            System.out.println("perform action 1");
        }

        double e = 1.0;

        if((Double)e instanceof Double | d++ == e++){
            d +=d;
        }

        boolean c2= (d>2) ? true:false;

        if (c2) {
            System.out.println("perform action 2");
        }


        boolean c3= c1 ^ c2;

        if (c3) {
            System.out.println("perform action 3");
        }



    }

//    @MyAnnot11

//     Double(String s){}
}


@interface MyAnnot11{}
@interface MyAnnot12{}