package class17;

public class Ram {
    public static void main(String[] args) {
        int salary=1000100;
        StringBuilder sb=new StringBuilder(String.valueOf(salary));
        sb.reverse();
        salary=Integer.parseInt(sb.toString());
        System.out.println(salary);

        double salary1=1000100;
        StringBuilder sb1=new StringBuilder(String.valueOf(salary1));
        sb1.reverse();
        salary1=Double.parseDouble(sb1.toString());
        System.out.println(salary1);

        double sal=0.000001;
        String salString=String.valueOf(sal);
        String converted="";
        for (int i = salString.length()-1; i >=0 ; i--) {
            converted+= sb.charAt(i);
        }
        System.out.println(converted);
    }
}
