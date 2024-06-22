package com.globalpayex;

import com.globalpayex.college.entities.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.stream.Collectors;

public class TestArrayList {

    @Test
    void TestArrayList(){
        ArrayList<String> cars = new ArrayList<>();
        assertEquals(0,cars.size());

        cars.add("i10");
        cars.add("i20");
        assertEquals("i10",cars.get(0));
        assertEquals("i20",cars.get(1));

        cars.add(1,"mercedes");
        assertEquals("i20",cars.get(2));
        assertEquals("mercedes",cars.get(1));

        cars.set(0,"audi");
        assertEquals("audi", cars.get(0));

        cars.remove(0);
        //assertEquals("mercedes",);


    }

    @Test
    void testArraylist(){

    }

    @Test
    void testSorting(){
       var nos =  Arrays.asList(10,4,1,9,7);
        Collections.sort(nos);
        assertEquals(1,nos.get(0));
        assertEquals(4,nos.get(1));
    }

    @Test
    void testSortingDescending(){

        //inner class
        /*class descComparator implements Comparator<Integer> {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }*/
        var nos =  Arrays.asList(10,4,1,9,7);
        //Collections.sort(nos, new descComparator());

        //anonymous inner class
        /*Collections.sort(nos, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });*/

        //lambda expressions
        //functional programming
        Collections.sort(nos, (o1, o2) -> o2.compareTo(o1));



        assertEquals(10,nos.get(0));
        assertEquals(1,nos.get(nos.size()-1));
    }

    @Test
    void testEvenNosMoreThan2(){
        var nos = Arrays.asList(10, 4, 1, 9, 7);
        /*var expected = Arrays.asList(10,4);
        ArrayList<Integer> newList = new ArrayList<>();
        nos.forEach(no->{
            if(no>2 && no%2==0){
                newList.add(no);

            }
        });
        assertEquals(10, newList.get(0));
        assertEquals(4, newList.get(1));
        assertEquals(expected,newList);
        */
        var newList = nos.stream()
                .filter(no -> no%2==0 && no >2)
                .collect(Collectors.toList());

        var expected = Arrays.asList(10,4);
        assertEquals(expected,newList);

    }
    @Test
    void testDeductBy1(){
        var nos = Arrays.asList(10,4,1,9,7);
        var expected = Arrays.asList(9,3,0,8,6);

        var newList = nos.stream()
                .map(t -> t-1)
                .collect(Collectors.toList());
        assertEquals(expected,newList);
    }

    @Test
    void testFilterPlusMap(){
        var nos = Arrays.asList(10,4,1,9,7);
        var expected = Arrays.asList(81,49);
        var newList = nos.stream()
                .filter(t->t>1 && t%2!=0)
                .map(t->t*t)
                .collect(Collectors.toList());
        assertEquals(expected,newList);

    }
    @Test
    void testStudents(){
        var students = Arrays.asList(
                new Student("jane",20,'f',90),
                new Student("harshit",50,'m',80),
                new Student("priyanka",60,'f',70)
        );
        var expected = "jane,priyanka";
        var newList = students.stream()
                .filter(student-> student.getGender()=='f')
                .map(student -> student.getName())
                .collect(Collectors.joining(","));
        assertEquals(expected,newList);

    }

    /*
    @Test
    void testStudents2(){

        //create a newlist of female student objects desc order of marks

        var students = Arrays.asList(
                new Student("jane",20,'f',90),
                new Student("harshit",50,'m',80),
                new Student("priyanka",60,'f',70)
        );
        var expected = Arrays.asList(
                new Student("jane",20,'f',90),
                new Student("priyanka",60,'f',70)


        );
        var newList = students.stream()
                .filter(student -> student.getGender()=='f')
                .sorted((s1, s2) -> Integer.valueOf(s2.marks).compareTo(s1.marks)
                .collect(Collectors.toList());

        assertEquals(expected, newList);

    }*/



}
