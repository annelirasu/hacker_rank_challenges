package hackerrank.stilleasy.sortimine;

import java.util.*;

class Student implements Comparable<Student>{
    private final int id;
    private final String fname;
    private final double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        if (id == 0 || fname == null || cgpa==0)
            throw new NullPointerException();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Student))
            return false;
        Student n = (Student) o;
        return n.fname.equals(fname) && n.id==(id); //kuidast toimub objekti samasuse tuvastamine
    }

    public int hashCode() {
        return 31*fname.hashCode() + id;//oluline, et redefineerida equals -hashkood peab olema sama
    }

    public String toString() {
        return fname;//et oleks mõnus kollektsioonist välja võtta
    }

    public int compareTo(Student s) {

        int lastCmp = ((Double)s.cgpa).compareTo((Double)(cgpa));//millist atribuuti võrreldakse
        int second=fname.compareToIgnoreCase(s.fname);
        int third= ((Integer)id).compareTo((Integer)s.id);

        return (lastCmp != 0 ? lastCmp : (second != 0) ? second : third);//kui perenimi osutub sellekssamaks, siis järgmiseks võrreldakse eesnimesid
    }

}


public class StudentsSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList);

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}

