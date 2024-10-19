public class Buss{

	String busName;
	int busNumber;
	int capacity;
	int passengers;
	String route;


    public Buss()
    {
    	System.out.println("no parameterized constructor");
    }
    

    public Buss(String busName,int busNumber,int capacity,int passengers,String route)
    {
    	this.busName=busName;
    	this.busNumber=busNumber;
    	this.capacity=capacity;
    	this.passengers=passengers;
    	this.route=route;
    }





    public static void start()
	{
      
	}


    public static void stop()
    {

    }


    public static void wheels()
    {

    }

    public static void steering()
    {
    	
    }



    public void DisplayBusDetailss()
    {

    System.out.println("bus name is :"+ bus.busName);
    System.out.println("bus number is:"+ busNumber);
    System.out.println("bus capacity is:"+ capacity);
    System.out.println("total passengers are:"+ passengers);
    System.out.println("bus route is:"+ route);
    }
	
}