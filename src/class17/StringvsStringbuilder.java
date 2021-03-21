package class17;

public class StringvsStringbuilder {

    public static void main(String[] args) {
        String var1="Katya";
        String var2="Katy";
        String var3="KatyaY";
        String var4="Kat"; //recomanded
        String var5=new String ("Katka"); //not recomanded approach
        var4="Ram";

        StringBuilder sb1=new StringBuilder("Katya");
        StringBuilder sb2=new StringBuilder("Katy");
        StringBuilder sb3=new StringBuilder("KatyaY");
        StringBuilder sb4=new StringBuilder("Kat");

        System.out.println(sb1.reverse());

        var1=sb1.toString();
        System.out.println(var1);


    }


}
