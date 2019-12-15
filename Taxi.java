/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SERVER
 */
public class Taxi {
 
private int x = 0;
private int y = 0;
private String PlateNum = "null";
private int destinationEks = 0;
private int destinationWhy = 0;
public String name = "null";

    public Taxi(String name) {
     this.name = name;
     
    }
    public int getX(){
     return this.x;
    }
    public int getY(){
     return this.y;
    }
    public String getPlateNumber(){
     return this.PlateNum;
    }
    public int getDestinX(){
     return this.destinationEks;
    }
    public int getDestinY(){
     return this.destinationWhy;
    }
    public void run(String run){
     int G = run.length();
     for(int a = 0; a < G; a++){
      if(run.charAt(a) == 'l'){
       x--;
      }else if (run.charAt(a) == 'r'){
       x++;
      }else if (run.charAt(a) == 'u'){
       y++;
      }else if(run.charAt(a) == 'd'){
       y--;
      }
     }
    }
    public void setBook(int destionationEks, int destinationWhy){
     this.destinationEks = x;
     this.destinationWhy = destinationWhy;     
    }
    public boolean reachedDestination(){
     if (x == destinationEks && y == destinationWhy){
      return true;
     }
     return false;
    }
   
    public void printCurrentLoc(){
     System.out.println("Your location is " + x + " " + y);
     
    }
     
     
     
     
   
}
     
     
     
   

