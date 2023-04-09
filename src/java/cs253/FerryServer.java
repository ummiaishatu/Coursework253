/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs253;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.jws.WebService;

/**
 *
 * @author ummiaishaibrahim
 */
@WebService
public class FerryServer {
    private ArrayList<String> portList = new ArrayList<>();
    private ArrayList<Ferries> ferryList = new ArrayList<>();
    private  ReadWriteLock lock = new ReentrantReadWriteLock(); 

    public boolean addPort(String port){
        lock.writeLock().lock();
        try{
            if(!portList.contains(port)){
                portList.add(port);
            }else{
                System.out.println("Already present");
            }
        } finally{
           lock.writeLock().unlock();
        }
        return true;
    }
   
    public boolean addFerryRoute(String ID, String startPort, String endPort, String ferryCompany, int timeTraveled){
        lock.writeLock().lock();
        try{
            if(ferryList.equals(ID)){
                System.out.println("Already present");
            }else{
                ferryList.add(new Ferries(ID, startPort, endPort, ferryCompany, timeTraveled));
            } 
        } finally{
            lock.writeLock().unlock();
        }
        return true;
    }

   
    public boolean deletePort(String port){
        lock.writeLock().lock();
        try{
            portList.remove(port);
        } finally{
            lock.writeLock().unlock();
        }
        return true;
    }
  
    public boolean deleteFerryRoute(String ID){
        lock.writeLock().lock();
        try{
            Ferries ferry = null;
            if(ferryList.contains(ID)){
                ferryList.remove(ID);
            }
        }
        finally{
            lock.writeLock().unlock();
        }
        return true;
    }
    
    public String getID(String ID){
        lock.writeLock().lock();
        String ferry = "";
        try {
            Ferries ferries = null;
            if(ferryList.getClass().equals(ID)){
                ferry = ferries.getID() + ferries.getStartPort() + ferries.getEndPort() + ferries.getFerryCompany() + ferries.getTime();
            }
                
        } finally {
            lock.writeLock().unlock();
        }
        return ferry;
    }
    
    public String getPort(String startPort){
        lock.writeLock().lock();
        String ferry = "";
        try {
            Ferries ferries = null;
            if(ferryList.getClass().equals(startPort)){
                ferry = ferries.getID() + ferries.getStartPort() + ferries.getEndPort() + ferries.getFerryCompany() + ferries.getTime();
            }
        } finally {
            lock.writeLock().unlock();
        }
        return ferry;
   }
   
   public String  getCompany(String ferryCompany){
       lock.writeLock().lock();
        String ferry = "";
        try {
            Ferries ferries = null;
            if(ferryList.getClass().equals(ferryCompany)){
                ferry = ferries.getID() + ferries.getStartPort() + ferries.getEndPort() + ferries.getFerryCompany() + ferries.getTime();
            }
        } finally {
            lock.writeLock().unlock();
        }
        return ferry;
   }
   
   public ArrayList<String> getPortList(){
       lock.readLock().lock();
        try {
            return portList;
        } finally {
            lock.readLock().unlock();
        }
    }
    
    public ArrayList<Ferries> getFerryList(){
        lock.readLock().lock();
        try {
            return ferryList;
        } finally {
            lock.readLock().unlock();
        }
    }
     

}
