/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingBloX;

/**
 *
 * @author up723003
 */
public class Node { 
    String value; 
    Node parent; 

    public Node () { 
        value = null; 
        parent = null; 
    } 

    public Node (String value, Node parent) { 
        this.value = value; 
        this.parent = parent; 
    } 
    
    public void addParent(Node parent){
        this.parent = parent;
    }
    
    public String getValue(){
        if(this.value == null){
            return "";
        }
        return this.value;
    }
    
    public Node getParent(){
        if(this.parent == null){
            return null;
        }
        return this.parent;
    }
    
    public String parentDetails(){
        if(this.parent == null){
            return "None";
        }
        return this.parent.getValue();
    }
    
    public void printData(){
        System.out.println(value + ", " + parentDetails());
    }
} 