package class17;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TypesOfVariables {

    void printInfo(String name) {
        String phoneNumber="23456";
        System.out.println(name);
    }
    void printInfoWithAddress(String name,String address) {
        System.out.println(name+address);
       // System.out.println(phoneNumber); cant do oit as it's in the diff methode
    }

    public static void main(String[] args) {
        String name="Local";
        System.out.println(name);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        {
            int x=10;
            {
                int y=20;
                System.out.println(x);
            }
           // System.out.println(y); CE(compilor error) not defined
        }

    }


}
