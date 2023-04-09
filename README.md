# Data-representation-markup-languages-and-web-services-CW1

For this assessment, you are being asked to build a simple web-service-based ferry database application.
- Grade : 96%

# 1.1. Task Specification
# You need to write:

One Web Service application using Java SOAP technology that provides the database functionality (see below). A client application to show that the 
Web Service is working.

Your client should NOT have any kind of user interface, or need any user-input - an application that calls the service to add some sample data, and then calls it to output results is all that is required as long as it demonstrates all the features of your service. In practice, there are very few marks for the client - it's just to demonstrate your service (however, it will have to have some way of printing out the data in a readable way - this is particularly relevant to point 3 in section 1.2 below).

You need to implement the following SOAP Web Service methods that store data about ferries (i.e. ships) and the ports (cities) they operate between.

1. Add a port - call a method that adds a port (port name only which we'll assume is unique, no other detail required) to the database only if it's not already present. So, for example: addPort("Ancona").

2. Add a ferry route - call a method that adds a ferry route (an ID that must be unique, the two ports it travels between, the name of the ferry company, the travel time rounded to the nearest hour) only if its ID is not already present. So for example addFerry("APA","Ancona", "Patras", "Anek", 26). The format of the ID is up to you.
3. Delete a ferry service - remove a ferry service by ID. So for example, removeFerry("APA").
4. Delete a port - remove a port by name. So for example removePort("Ancona").
5. Get a ferry service by ID - so for example getFerry("APA"). Get all data about that service (both ports, company name, travel time, ID).
6. Get all ferry services by port - so for example, getFerryByPort("Patras"). This should return all data about the relevant ferries related to that port - both the port named as a parameter and the other port it travels to/from; as well as the ID, company name and travel time. Note that  we don't distinguish between departure and destination port: we assume that ferries are two-way services between ports.
7. Get all ferry services by company - so for example getFerryByCompany("Anek"). The information returned should be as in 6 above

# 1.2. Overview and Suggestions 
1. Storing the Data. You might want to look at the various Java classes beginning with "Hash..." to help you work out how to store the data for ports and ferries and their definitions. Read about the differences between them carefully - you can actually make a good case for several of the available classes and there is no single best solution here. You don't have to use the same data structure for storing both kinds of data.
2. Consider Data Integrity. There are some obvious (and slightly less obvious) issues with some of the methods listed above. One example is: what happens if you try to add a ferry route to a port that does not exist. There are other such issues - you should think through carefully what you should do about them. Think carefully about what to do in the case of errors - remember that in "real life" you would be deploying your service on a completely different machine to your client.
3. Return Types. I have made it clear what the parameters should be above, but I have not said anything about the types of data returned by methods. Think carefully about flexibility and usability - does the choice you have made restrict how useful your solution would be in "real life" where it won't just be called by your own client, which is essentially only meant to demo/test your service.
4. Consider Synchronisation. Remember that several of the methods you will end up writing will change the stored data and others will not. Remember the material in the notes on the readers and writers problem, and what this means and how to deal with it correctly. You have a number of viable options. A significant % of the marks is for this, and it also relates to point 5 below.
5. Two Types of Data Stored. Unlike the examples in the notes, this coursework requires you to store two separate "kinds" of data (ports and ferries). This is a deliberate choice and it impacts on how you do synchronisation. It does not make it any more complicated, provided you think about and understand exactly what the discussion of the readers and writers problem meant - so be careful.
6. Netbeans and Glassfish, or command line.You can build and test your application either using the Netbeans-based techniques (recommended) or the command-line based techniques. But it must be a SOAP Web Service application in Java.
7. Data Persistence. There is also no need for your program to store data when it's not running - so no need for e.g. files.
8. Data Types on the Client are Inferred.Remember that you are not doing true OO programming here - and that any classes that are created on the client (ports, ferries, lists of ports, lists of ferries) are inferred from the WSDL file. So make sure you read the material on dealing with structured data in SOAP.
9. No Complex GUIs - either "graphical" or text based. Just write a client that showcases all the features of your service and does not require any user-input. (I know it says this above but past experience is that it needs repeating).
10. Style. I'm no less interested in good Java style than I was in CS-110. You may find the material in the Appendix at the end of the course material ('modules') useful here.
 
