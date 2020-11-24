
package com.mycompany.mavenproject1;

import Student;

public class Driver {
    
    public static void main(String[] args){
    Student Eoin = new Student("Eoin", 22, "15/04/1998", 17369166);
    Student Sarah = new Student("Sarah", 22, "20/08/1998", 17364949);
    Student Paul = new Student("Paul", 21, "05/04/1999", 17483920);
    Student Mary = new Student("Mary", 20, "15/04/2000", 17454345);

    Module CT417 = new Module("Software Engineering III", "CT417");
    Module EE451 = new Module("System on Chip Design I", "EE451");
    Module EE445 = new Module("Digital Signal Processing", "EE445");
    Module CT4101 = new Module("Machine Learning", "CT4101");

    CT417.students.add(Eoin);
    EE451.students.add(Eoin);
    EE445.students.add(Eoin);
    CT4101.students.add(Eoin);
    
    CT417.students.add(Paul);
    EE451.students.add(Paul);
    EE445.students.add(Paul);
    CT4101.students.add(Paul);
    
    CT417.students.add(Sarah);
    EE451.students.add(Sarah);
    EE445.students.add(Sarah);
    CT4101.students.add(Sarah);
    
    CT417.students.add(Mary);
    EE451.students.add(Mary);
    EE445.students.add(Mary);
    CT4101.students.add(Mary);
    
    Course ECE = new Course("ECE");
    ECE.modules.add(CT417);
    ECE.modules.add(EE451);
    ECE.modules.add(EE445);
    ECE.modules.add(CT4101);
    
    System.out.print(ECE.getName());
    }
}
