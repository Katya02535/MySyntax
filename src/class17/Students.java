package class17;

public class Students {
    String studentName;
    String studentID;
    static int numberOfStudent;

    public static void main(String[] args) {
       Students Katyaobj=new Students();
       Katyaobj.studentName="Katya";
       Katyaobj.studentID="1234";
       Katyaobj.numberOfStudent++;
        System.out.println(Katyaobj.studentID+" name "+Katyaobj.studentName+" number of students "+Students.numberOfStudent );

        Students Olga=new Students();
        Olga.studentName="Olga";
        Olga.studentID="1234890";
        Olga.numberOfStudent++;
        System.out.println(Olga.studentID+" name "+Olga.studentName+" number of students "+Students.numberOfStudent );
    }

}
