/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs253;

/**
 *
 * @author ummiaishaibrahim
 */
public class Ferries {
   private  String ID;
   private  String startPort;
   private  String endPort;
   private  String ferryCompany;
   private  int timeTraveled;
   
   public Ferries(String ID, String startPort, String endPort, String ferryCompany, int timeTraveled){
       this.ID = ID;
       this.startPort = startPort;
       this.endPort = endPort;
       this.ferryCompany = ferryCompany;
       this.timeTraveled = timeTraveled;
   }
   
   public void setID(String identity){
       identity = ID;
   }
   
   public void setStartPort(String startP){
       startP = startPort;
   }
   
   public void setEndPort(String endP){
       endP = endPort;
   }
   
   public void setFerryCompany(String ferryC){
       ferryC = ferryCompany;
   }
   
   public void setTime(int timeT){
       timeT = timeTraveled;
   }
   
   public String getID(){
       return ID;
   }
   
   public String getStartPort(){
       return startPort;
   }
   
   public String getEndPort(){
       return endPort;
   }
   
   public String getFerryCompany(){
       return ferryCompany;
   }
   
   public int getTime(){
       return timeTraveled;
   }
}
