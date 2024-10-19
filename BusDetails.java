public class BusDetails{



	public static void main(String [] args)
	{

	String busName;
	int busNumber;
	int capacity;
	int passengers;
	String route;




    Bus bus = new Bus();
    bus.busName = "navadurga";
    bus.busNumber = 47;
    bus.capacity= 50;
    bus.passengers= 26;
    bus.route="route A";



    Bus bus1 = new Bus();
    bus1.busName = "Golden";
    bus1.busNumber = 45;
    bus1.capacity= 40;
    bus1.passengers= 15;
    bus1.route="route B";



    Bus bus2 = new Bus();
    bus2.busName = "shiva kripa";
    bus2.busNumber = 13;
    bus2.capacity= 60;
    bus2.passengers= 28;
    bus2.route="route C";


    Bus bus3 = new Bus();
    bus3.busName = "vigneshwara";
    bus3.busNumber = 17;
    bus3.capacity= 50;
    bus3.passengers= 10;
    bus3.route="route D";


    System.out.println("------------------------------------------------");
    System.out.println("bus name is:"+ bus.busName);
    System.out.println("bus number is:"+ bus.busNumber);
    System.out.println("bus capacity is:"+ bus.capacity);
    System.out.println("total passengers are:"+ bus.passengers);
    System.out.println("bus route is:"+ bus.route);
    System.out.println("------------------------------------------------");



        
 
    System.out.println("bus name is:"+ bus1.busName);
    System.out.println("bus number is:"+ bus1.busNumber);
    System.out.println("bus capacity is:"+ bus1.capacity);
    System.out.println("total passengers are:"+ bus1.passengers);
    System.out.println("bus route is:"+ bus1.route);
        System.out.println("------------------------------------------------");




    

    System.out.println("bus name is:"+ bus2.busName);
    System.out.println("bus number is:"+ bus2.busNumber);
    System.out.println("bus capacity is:"+ bus2.capacity);
    System.out.println("total passengers are:"+ bus2.passengers);
    System.out.println("bus route is:"+ bus2.route);
    System.out.println("------------------------------------------------");



    

    System.out.println("bus name is:"+ bus3.busName);
    System.out.println("bus number is:"+ bus3.busNumber);
    System.out.println("bus capacity is:"+ bus3.capacity);
    System.out.println("total passengers are:"+ bus3.passengers);
    System.out.println("bus route is:"+ bus3.route);
    System.out.println("------------------------------------------------");

    }








}