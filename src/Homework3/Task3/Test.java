package Homework3.Task3;

import java.util.Calendar;
import java.util.Date;

public class Test {

    public static void main(String[] args) {

        Course object1 = new Course("Alex",50,"Sergey");
        Course object2 = new Course("Bob",44,"Olga");
        Course object3 = new Course("Jack",77,"Jessica");
        Course object4 = new Course("Stasy",22,"John");
        Course object5 = new Course(new Date(1991, Calendar.MARCH,1),"Arnold");
        System.out.println(object1);
        System.out.println(object3);
        object1.setHoursDuration(666);
        System.out.println(object1);

        Student student = new Student("Billy","Milligan",3);





    }

    }

