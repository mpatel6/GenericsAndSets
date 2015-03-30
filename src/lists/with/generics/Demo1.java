/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists.with.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author mpatel6
 */
public class Demo1 {
    
    public static void main(String[] args) {
        List <String> names = new Vector<>();
        
        names.add("Monil");
        names.add("Ankita");
        names.add("Sapna");
        
      //  String favourite = names.get(0);
        
        names.add(2, "Rishi");
        names.add(4, "Alpa");
        names.add(5, "Ankur");
        names.add(6, "Sapna");
        names.add(7, "Monil");
     //   names.removeAll("Sapna");
        
        
        for(String s:names){
            System.out.println(s);
        }
        
        System.out.println("Index of Sapna is:"+names.indexOf("Sapna"));
         System.out.println("Index of last Sapna is:"+names.lastIndexOf("Sapna"));
        
    }
    
}
