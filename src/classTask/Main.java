package classTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String>students=new HashMap<>();
        students.put(1,"abubakir");
        students.put(2,"aizada");
        students.put(3,"munara");
        students.put(4,"aidai");
        students.put(5,"akylai");
        students.put(6,"erbol");
        for(Map.Entry<Integer,String>student:students.entrySet()){
            System.out.println(student.getKey());
        }

        /**Map<String, Integer> studentGrades деген массив тузунуз. Анын ичине студенттин аттарын жана баасын киргизгиле (studentGrades.put(“Иван“, 92);). Студенттердин саны 10 дан аз болбосун.
         Методтор:
         getAllStudents
         getStudentWithGrade
         searchStudentByName
         getStudentsByGrade
         sortStudentByGrade
         sortStudentsByName
         getStudentByTopGrade
         getStudentByLowGrade*/
        Map<String,Integer>studentGrades=new HashMap<>();
        studentGrades.put("Erbol",78);
        studentGrades.put("Bayana",47);
        studentGrades.put("Kumushai",88);
        studentGrades.put("Jyldyz",92);
        studentGrades.put("Myrzagul",76);
        studentGrades.put("Daniyar",65);
        studentGrades.put("Altai",32);
        studentGrades.put("Azamat",97);
        studentGrades.put("Maks",70);
        studentGrades.put("Vera",84);
        System.out.println("---------------------------------------------------");
        System.out.println("Get all students");
        getAllStudents(studentGrades);
        System.out.println("---------------------------------------------------");
        System.out.println("Get student with grade");
        getStudentWithGrade(studentGrades);
        System.out.println("---------------------------------------------------");
        System.out.println("Search student by name");
        searchStudentByName("Erbol",studentGrades);
        System.out.println("---------------------------------------------------");
        System.out.println("Get student by grade");
        getStudentByGrade(76,studentGrades);
        System.out.println("---------------------------------------------------");
        System.out.println("Sort student by grade");
        sortStudentByGrade(studentGrades);
        System.out.println("---------------------------------------------------");
        System.out.println("Sort student by name");
        sortStudentByName(studentGrades);
        System.out.println("---------------------------------------------------");
        System.out.println("Get student by top grade");
        getStudentByTopGrade(studentGrades);
        System.out.println("---------------------------------------------------");
        System.out.println("Get student by low grade");
        getStudentByLowGrade(studentGrades);
    }
    public static void getAllStudents(Map<String,Integer>studentGrades){
        for(Map.Entry<String,Integer>student:studentGrades.entrySet()){
            System.out.println(student);
        }
    }
    public static void getStudentWithGrade(Map<String,Integer>studentGrades){
        for(Map.Entry<String,Integer>student:studentGrades.entrySet()){
            System.out.println(student.getValue());
        }
    }
    public static void searchStudentByName(String name,Map<String,Integer>studentGrades){
        for(Map.Entry<String,Integer>student:studentGrades.entrySet()){
            if(name.equalsIgnoreCase(student.getKey())){
                System.out.println(student);
            }
        }
    }
    public static void getStudentByGrade(int grade,Map<String,Integer>studentGrades){
        for(Map.Entry<String,Integer>student:studentGrades.entrySet()){
            if(grade==student.getValue()){
                System.out.println(student);
            }
        }
    }
    public static void sortStudentByGrade(Map<String,Integer>studentGrades){
        List<Integer>grades=new ArrayList<>(studentGrades.values());
            Collections.sort(grades);
            System.out.println(grades);
    }

    public static void sortStudentByName(Map<String,Integer>studentGrades){
        List<String>names=new ArrayList<>(studentGrades.keySet());
        Collections.sort(names);
        System.out.println(names);
    }
    public static void getStudentByTopGrade(Map<String,Integer>studentGrades){
        Map.Entry<String,Integer>max=null;
        for(Map.Entry<String,Integer>student:studentGrades.entrySet()) {
            if(max==null||student.getValue()>max.getValue()){
                max=student;
            }
        }
        System.out.println(max);
    }
    public static void getStudentByLowGrade(Map<String,Integer>studentGrades){
        Map.Entry<String,Integer>min=null;
        for(Map.Entry<String,Integer>student:studentGrades.entrySet()) {
            if(min==null||student.getValue()<min.getValue()){
                min=student;
            }
        }
        System.out.println(min);
    }
}
