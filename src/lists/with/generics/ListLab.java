/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists.with.generics;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import common.Dog;
import common.Employee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Ankita
 */
public class ListLab {
    
    public static  void main(String[] args){
    
        System.out.println("LAB TASK 1");
        List musicInstrument = new ArrayList();
        musicInstrument.add("Tabla");
        musicInstrument.add("Piano");
        musicInstrument.add("Drum");
        
        System.out.println("Original List");
        for (int i=0;i<musicInstrument.size();i++){
            System.out.println("The music instrument is: "+ (String)musicInstrument.get(i));
        }
        
        musicInstrument.add(1, "Guitar");
        System.out.println("\n\nInstrument added to List");
        for (int i=0;i<musicInstrument.size();i++){
            System.out.println("The music instrument is: "+ (String)musicInstrument.get(i));
        }
        
        musicInstrument.remove(1);
        musicInstrument.remove("Piano");
        
        System.out.println("\n\nInstrument remved from List");
        for (int i=0;i<musicInstrument.size();i++){
            System.out.println("The music instrument is: "+ (String)musicInstrument.get(i));
        }
        
        
        System.out.println("\n\nLAB TASK 2");
        
        List <Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Patel", "Monil", "123-45-677"));
        employees.add(new Employee("Patel", "Ankita", "123-45-678"));
        employees.add(new Employee("Patel", "Mack", "123-45-679"));
        
        System.out.println("Employee Information is diaplayed below");
        for(Employee e: employees){
            System.out.println("Name:"+e.getFirstName()+"\t"+e.getLastName()+"\t"+"SSN: "+e.getSsn());
        }
        
        System.out.println("\n\nEmployee Information using toString is diaplayed below");
        for(Employee e: employees){
            System.out.println(e);
        }
        
        System.out.println("\n\nLAB TASK 3");
        
        List item = new ArrayList();
        item.add(new Employee("Patel", "Monil", "123-45-677"));
        item.add(new Employee("Patel", "Ankita", "123-45-678"));
        item.add(new Employee("Patel", "Ravi", "123-45-679"));
        item.add(new Dog("Pluto",10000));
        
        System.out.println("Item information is: ");
        for(int i = 0; i<item.size();i++){
            System.out.println(item.get(i));
        }
        
        System.out.println("\n\nLAB TASK 4");
        
        List <Employee> employees1 = new ArrayList<Employee>();
        employees1.add(new Employee("Patel", "Monil", "123-45-677"));
        employees1.add(new Employee("Patel", "Ankita", "123-45-678"));
        employees1.add(new Employee("Patel", "Mack", "123-45-677"));
        
        Set<Employee> employeeSet = new HashSet<>(employees1);
        employees1.clear();
        employees1.addAll(employeeSet);
        
        for(Employee e:employees1){
            System.out.println(e);
        }
    }
    
}
