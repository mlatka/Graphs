package sample;

import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {

        Student [] students= {new Student(19,4.5,"John"), new Student(23,2.0,"Alan")};

        System.out.println(Arrays.toString(students));

        //Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new GPAComparator());

        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new NameComparator());

        System.out.println(Arrays.toString(students));

    }

}
