# Data-representation-markup-languages-and-web-services-CW1

For this assessment, you are being asked to build a simple web-service-based ferry database application.
- Grade : 96%

1.1. Task Specification: You need to write:

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
 
