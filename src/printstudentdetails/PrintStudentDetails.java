/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/**
 *
 * @author garch
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] list = new Student[3];// array of object declaration
        
        // define 3 students by creating objects of student class
        
        Student s1=new Student();
        s1.setName("peter");
        s1.setAge(21);
        
        Student s2=new Student();
        s2.setName("jasdeep");
        s2.setAge(21);
        
        Student s3=new Student();
        s3.setName("kiran");
        s3.setAge(20);
        //store objects in an array
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++)//read the array
        {
            System.out.println(list[i].getName()+" "+list[i].getAge());
            
        }
        
        
    }
    
}
