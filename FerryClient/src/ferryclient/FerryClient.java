/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferryclient;

/**
 *
 * @author ummiaishaibrahim
 */
import cs253.Ferries;
import cs253.FerryServer;
import cs253.FerryServerService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ummiaishaibrahim
 */
public class FerryClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FerryServerService service = new FerryServerService();
        FerryServer port = service.getFerryServerPort();
        
        // Adding ports to the List 
        port.addPort("Vienna");
        port.addPort("Paris");
        port.addPort("London");
        port.addPort("Germany");
        
        // Adding the inputs of a ferry
        port.addFerryRoute("001", "Vienna", "London", "Mark Company", 10);
        port.addFerryRoute("002", "Germany", "Paris", "Tim Company", 12);
        port.addFerryRoute("003", "London", "Germany", "Tim Company", 11);
        
        //deleting a port 
        port.deletePort("Vienna");
        
        //deleting a ferry
        //System.out.println(port.deleteFerryRoute("001"));
        
        //getting ferry by Id
        //System.out.println(port.getID("001"));
        
        //getting ferry by port
        //System.out.println(port.getPort("London"));
        
        //getting ferry by company
        //System.out.println(port.getCompany("Tim Company"));
        
        // getting the port lists
        System.out.println(port.getPortList());
     
        List<Ferries> ferry = port.getFerryList();
        for(Ferries elem : ferry){
            
                System.out.println("ID : " + elem.getID() 
                    + ", Start Port: " + elem.getStartPort()
                    + ", End Port: " + elem.getEndPort() 
                    +  ", Ferry Company: " + elem.getFerryCompany() 
                    +  ", Time Traveled(neares hour): " + elem.getTime());
        } 
    
    }
    
}

