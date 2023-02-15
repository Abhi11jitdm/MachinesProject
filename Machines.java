//MotorShop

import java.util.Scanner;

import java.util.InputMismatchException;

interface Motor
{
	void login();
}
class Machines implements Motor
{
	
	String voltage;
	String current;
	int frequeny;
	String HP;
	char insulationClass;
	double efficiency;
	double price;
    static String name;
    static Long number;
    static String email;
	
	//Static block
	static
	{  
		 System.out.println("*************************");
		 System.out.println("*        WELCOME        *");
		 System.out.println("*          TO           *");
		 System.out.println("*       MOTOR SHOP      *");
		 System.out.println("*************************");
    }
	
	//main method
	public static void main(String[] args) 
	{
		
		Machines ref = new Machines();
//		Login ts = new Login();
		
		
		ref.login();
		
		//ts.Task();
		
		ref.purchase();
		
		
	    
		
	}
	
	public void login()
	{
		//Machines ref2 = new Machines();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter YOur Name: ");
		String name = sc.next();
		this.name=name;
		
		System.out.println("Please Enter YOur Mobile Number: ");
		Long number = sc.nextLong();
		this.number=number;
		
		System.out.println("Please Enter YOur Mail id: ");
		String email = sc.next();
		this.email=email;
		
		
	}
	
	
	public void purchase() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================");
		System.out.println("  Enter 1 : To select AC motors.  ");
		System.out.println("  Enter 2 : To select DC motors.  ");
		System.out.println("==================================");
		try 
		{
			int i = sc.nextInt();
		    Machines a = new AC();
		    Machines d = new DC(); 
		    AC m = (AC) a;
		    DC n = (DC) d;
	      
		switch(i)
		{
		case 1: m.ACo();
		break;
		
		case 2: n.DCm();
		break;
		
		default: System.out.println("===Please enter valid input===");
                 purchase();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input===");
			purchase();
		}
		
	}
	
	//toString to override reference variable
    public String toString()
    {
    	System.out.println();
		System.out.println("============================================================");
		System.out.println("         Here Are The Details Of the Selected Motor         ");
		System.out.println("============================================================");
    	System.out.println("Voltage: "+voltage);
    	System.out.println("Current"+current);
    	System.out.println("Frequency:"+frequeny);
    	System.out.println("Hp:"+HP);
    	System.out.println("Class Insulation:"+insulationClass);
    	System.out.println("Efficiency:"+efficiency);
    	System.out.println("The price of Motor is : Rs"+ price +"only");
    	return "";
    }
   
    //buy method for DC
    public void buy() 
    {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter 1: Would you like to buy..? "); 
		System.out.println("Enter 2: cancle and go to the  menu");
		System.out.print("choice: ");
		try 
		{
			int i=sc.nextInt();
		    switch(i) 
		    {
		    
		    case 1: 
			System.out.println();
			System.out.println();
			System.out.println("==========================================");
			System.out.println("        ----Thank You so much----         ");
			System.out.println("        Please Verify your details          ");
			System.out.println("==========================================");
			cutomerDetails();
			
			break;
		
		    case 2:
			System.out.println("Cancel and go back to the Menu");
			DC ref = new DC();
			ref.DCm();
			System.out.println();
		
			break;
		
		   default : buy();
		   
		   }
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			buy();
		}
	}
   
    
    //buy method for AC
    public void buy1() 
    {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter 1: Would you like to buy ....?"); 
		System.out.println("Enter 2: cancle and go to the  menu");
		System.out.print("choice: ");
		try 
		{
			int i=sc.nextInt();
		    switch(i) 
		    {
		    case 1: 
			System.out.println();
			System.out.println("==========================================");
			System.out.println("        ----Thank You so much----         ");
			System.out.println("        Please Verify Your Details          ");
			System.out.println("==========================================");
			cutomerDetails();
			break;
		
		    case 2:
			System.out.println("Cancel and go back to the  Menu");
			AC ref = new AC();
			ref.ACo();
			System.out.println();
		    break;
		
		    default : buy1();
		    }
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input===");
			buy1();
			
		}
    }
    
    //customer details method
	public void cutomerDetails() 
	{
		try
		{
		Machines ref = new Machines();
		//Scanner s = new Scanner(System.in);
		System.out.print("Please Verify Your Name: ");
		System.out.println(name);
	//	System.out.println(name);
		//String name= s.nextLine();
		System.out.print("Please Verify Your Mobile Number: ");
		System.out.println(number);
		//long i= s.nextLong();
		System.out.print("Please Verify Your Mail ID: ");
		System.out.println(email);
		//String email= s.next();
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("Enter Valid Details.");
			cutomerDetails();
			
		}
		System.out.println("==========================================");
		System.out.println();
		System.out.println("!!!!-- Please Choose Your Payment Option --!!!!");
		System.out.println("Enter 1. Cash");
		System.out.println("Enter 2. UPI");
		System.out.println("Enter 3. Bank Transfer.");
		System.out.print("choice: ");
		System.out.println();
		
		try 
		{
			Scanner s1 = new Scanner(System.in);
			int p= s1.nextInt();
		    switch(p)
		    {
		    case 1: 
				System.out.println("==== THANK YOU SO MUCH VISIT US AGAIN ===");
				motor();
				
				break;
		    case 2: 
				System.out.println(" WE GOT YOUR MONEY TRANSFER..");
				System.out.println("==== THANK YOU SO MUCH VISIT US AGAIN ===");
				motor();
				break;
		    case 3: 
				System.out.println("Yes... Bank Transfer Successful..");
				System.out.println("==== THANK YOU SO MUCH VISIT US AGAIN ===");
				motor();
				break;
				
		    default: cutomerDetails();
		    }
		}
		
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input===");
			cutomerDetails();
			
		}
	}
	
	
	public static void motor() 
	{
		    System.out.println("**************************");
		    System.out.println("*     CONGRATULATIONS    *");
		    System.out.println("*          ON            *");
		    System.out.println("*     YOUR NEW MOTOR     *");
		    System.out.println("**************************");
		    
	}
		
 }

//AC Motor Section
class AC extends Machines
{
	
	public void ACo()
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("=======================================");
	    System.out.println("Enter 1 : To select Single Phase motors");
		System.out.println("Enter 2 : To select Three Phase motors");
		System.out.println("Enter 3 : Return back to menu");
		System.out.println("========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
		    {
		
		     case 1: singlePhase m = new singlePhase();
		        m.spo();
		        break;
		
		     case 2: threePhase n = new threePhase();
		        n.tpo();
		        break;
		  
		     case 3 : purchase();
		
		     default : System.out.println("===Please enter valid input===");
		          ACo();
	
		    }
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input===");
			 ACo();
			
		}
    }
	
}

class threePhase extends AC
{
	public void tpo()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("Enter 1 : To select Synchronous motors");
		System.out.println("Enter 2 : To select Induction Motors");
		System.out.println("Enter 3 : To select Traction Motors");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("======================================");
		
			int i = sc.nextInt();
			switch(i)
			{
			case 1:Synchronous m = new Synchronous();
			       m.condenser();
			        buy1();
			        break;
			
			case 2: Induction n = new Induction();
			        n.Induc();
			        buy1();
			        break;
			
			case 3:System.out.println("You have selected Traction motor:");
			       tractionMotor o = new tractionMotor("240 volts","3 amp",50,"2 hp",'b',92.5,499999.00);
			       System.out.println(o);
			       break;
			
			        
			default: System.out.println("===Please enter valid input=== ");
			        tpo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			tpo();
			
		}
     }
}

class Synchronous extends threePhase
{
	public void condenser()
	{
		Condenser ref = new Condenser("230 v", "15 amp", 50, "1 Hp",'d', 94.5,33999.00);
		System.out.println("==========================================");
		System.out.println("Available motor is Synchronous Condenser");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

class Condenser extends Synchronous
{
	public Condenser(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency,double price) 
	{
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
		this.price= price;
	}
}

class Induction extends threePhase
{
	public void Induc()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=========================================");
		System.out.println("Enter 1 : To select Squirrel Cage motors");
		System.out.println("Enter 2 : To select Wound Rotor Motors");
		System.out.println("Enter 3 : Return back to menu.");
		System.out.println("=========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			
			case 1: System.out.println("You have selected Squirrel Cage motor:");
			        squirrelCage m = new squirrelCage("220","10 amp",50,"1hp",'c',95,19999.00);
			        System.out.println(m);
			        buy1();
			        break;
			
			case 2:System.out.println("You have selected Wound Rotor motor:");
			       woundRotor n = new woundRotor("230","5 amp",50,"1.5hp",'c',85,29999.00);
			       System.out.println(n);
			       buy1();
			       break;
			
			case 3: tpo();
			
			default:System.out.println("===Please enter valid input===");
			        Induc();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input===");
			Induc();
			
		}
	}
}

class squirrelCage extends Induction
{
	public squirrelCage(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency,double price) 
	{
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
		this.price= price;
	}
}

class woundRotor extends Induction
{
	public woundRotor(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency,double price) 
	{
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
		this.price= price;
	}
}

//Sub-class under AC
class singlePhase extends AC
{
	public void spo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================"); 
		System.out.println("Enter 1 : To select Synchronous motors");
		System.out.println("Enter 2 : To select Induction Motors");
		System.out.println("Enter 3 : Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:Synchronous1 m = new Synchronous1();
			       m.synchro();
			       break;
			
			case 2:Induction1 n = new Induction1();
			       n.Induct1();
			       break;
			
			case 3 : ACo();
			
			default:System.out.println("===Please enter valid input===");
			        spo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			spo();
			
		}
		
	}
}

class Induction1 extends singlePhase
{
	public void Induct1()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select Resistive Split motors");
		System.out.println("Enter 2 : To select Shaded Pole Motors");
		System.out.println("Enter 3 : To select Capacitor Split Motors");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected Resistive Split motor");
			        resistiveSplit m = new resistiveSplit("210 volt","8 amp",50,"1.5 hp",'a',87.5,1999.00);
			        System.out.println(m);
			        buy1();
			        break;
			
			case 2: System.out.println("You have selected Shaded pole motor");
			        shadedPole n = new shadedPole("25 volt","2p",50,"13hp",'a',81.2,5999.00);
			        System.out.println(n);
			        buy1();
			        break;
			
			case 3 :System.out.println("You have selected Capacitor Split motor");
			        capacitorSplit o = new capacitorSplit();
			        o.capSplit();
			        break;
			
			case 4 :spo();
			break;
			
			default:System.out.println("===Please enter valid input=== ");
			        Induct1();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Induct1();
			
		}
	}
}

class resistiveSplit extends Induction1
{
	public resistiveSplit(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency,double price) 
	{
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
		this.price= price;
	}
}

class shadedPole extends Induction1
{
	public shadedPole(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency,double price) 
	{
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
		this.price= price;
	}
}

class capacitorSplit extends Induction1
{
	public void capSplit()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select Capacitor Start motors");
		System.out.println("Enter 2 : To select Capacitor Run Motors");
		System.out.println("Enter 3 : To select Permanent  Split Motors");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:System.out.println("You have selected Capacitor Start motor");
				   capacitorStart m = new capacitorStart("240 volts","3 amp",50,"2 hp",'b',92.5,3999.00);
				   System.out.println(m);
				   buy1();
			       break;
			
			case 2: System.out.println("You have selected Capacitor Run motor");
			        capacitorRun n = new capacitorRun("260 volts","2 amp",50,"1.5 hp",'a',90.5,1499.00);
			        System.out.println(n);
			        buy1();
			        break;
			
			case 3 :System.out.println("You have selected Permanent Split motor");
			        permanentSplit o = new permanentSplit("225 volts","8 amp",50,"1 hp",'b',96.5,2999.00);
			        System.out.println(o);
			
			case 4: Induct1();
			         buy1();
			         break;
			
			default:System.out.println("===Please enter valid input===");
			        capSplit();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			capSplit();
			
		}
	}
}

class Synchronous1 extends singlePhase
{
	public void synchro()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====================================");
		System.out.println("Enter 1 : To select Reluctance motors");
		System.out.println("Enter 2 : To select Hysteresis Motors");
		System.out.println("Enter 3: Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected Reluctance motor:");
			        Reluctance m = new Reluctance("210 volt","8 amp",50,"1.5 hp",'a',87.5,2999.00);
			        System.out.println(m);
			        buy1();
			        break;
			
			case 2:System.out.println("You have selected Hysteresis motor:");
				   Hysteresis n = new Hysteresis("215 volt","9 amp",50,"1 hp",'d',80.6,8999.00);
				   System.out.println(n);
				   buy1();
			       break;
			
			case 3 :spo();
			        break;
			
			default: System.out.println("===Please enter valid input===");
				      synchro();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input===");
			 synchro();
			
		}
	}
}

class Reluctance extends Synchronous1
{
	public Reluctance(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency,double price) 
	{
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
		this.price= price;
	}
	
}

class Hysteresis  extends Synchronous1
{
	public Hysteresis(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency,double price) 
	{
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
		this.price= price;
	}
	
}

class capacitorStart extends capacitorSplit
{
	public capacitorStart(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency,double price) 
	{
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
		this.price= price;
	}
}

class capacitorRun extends capacitorSplit
{
	public capacitorRun(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency,double price) 
	{
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
		this.price= price;
	}
}

class permanentSplit extends capacitorSplit
{
	public permanentSplit(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency,double price) 
	{
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
		this.price= price;
	}
	
}

class tractionMotor extends threePhase
{

	    public tractionMotor(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency,double price) 
	    {
	    	super();
		    this.voltage = voltage;
		    this.current = current;
		    this.frequeny = frequeny;
		    this.HP = HP;
		    this.insulationClass = insulationClass; 
		    this.efficiency = efficiency;
		    this.price= price;
	}
}

//DC Motor Section
class DC extends Machines
{
	public void DCm()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("============================================="); 
		System.out.println("Enter 1 : To select Self Excited motors");
		System.out.println("Enter 2 : To select Seperately Excited Motors");
		System.out.println("Enter 3: Return back to menu.");
		System.out.println("==============================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:selfExcited m = new selfExcited();
			       m.selfexcited();
			        break;
			
			case 2:System.out.println("You have selected separately excited motor");
			       separatelyExcited n = new separatelyExcited("210 volt","2 amp",0,"1.4 hp",'d',89.5,29999.00);
				   System.out.println(n);
				   buy();
			       break;
			       
			case 3 : purchase();
			
			default:System.out.println("===Please enter valid input=== ");
					DCm();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			DCm();
			
		}
	}
}

//Sub-class under DC
class selfExcited extends DC
{
	public void selfexcited()
	{
		Scanner sc = new Scanner(System.in);
	
	    System.out.println("======================================="); 
	    System.out.println("Enter 1 : To select DC Series motors");
	    System.out.println("Enter 2 : To select DC Shunt Motors");
	    System.out.println("Enter 3 : To select DC Compound Motors");
	    System.out.println("Enter 4: Return back to menu.");
	    System.out.println("========================================");
	    try 
	    {
	    	int i = sc.nextInt();
		    switch(i)
		    {
		       case 1:
		    	   System.out.println("You have selected DC series motor");
		           DCSeries m = new DCSeries("210 volt","2 amp",0,"1.4 hp",'d',89.5,2999.00);
			       System.out.println(m);
			       buy();
			       break;
		
		        case 2: 
		        	System.out.println("You have selected DC shunt motor");
		            DCShunt n = new DCShunt("205 volt","4 amp",0,"1.3 hp",'d',90.5,3599.00);
		
				    System.out.println(n);
				    buy();
				    break;
		
		        case 3 :
			        System.out.println("You have selected DC compound motor");
		            DCCompound o = new DCCompound("200 volt","6 amp",0,"1.2 hp",'d',97.5,8999.00);
				    System.out.println(o);
				    buy();
				    break;
		
		default:System.out.println("===Please enter valid input=== ");
		        selfexcited();
		    }
	    }  
	    catch(InputMismatchException Ex)
	    {
		System.out.println("===Please enter valid input=== ");
		selfexcited();
	    }
	}	
}

class DCSeries extends selfExcited
{
	public DCSeries(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency,double price) {
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
		this.price= price;
	}
}

class DCShunt extends selfExcited
{
	public DCShunt(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency,double price) 
	{
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
		this.price= price;
	}
}

class DCCompound extends selfExcited
{
	public DCCompound(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency,double price) 
	{
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
		this.price= price;
	}
}

class separatelyExcited extends DC
{
	public separatelyExcited(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency,double price) 
	{
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass; 
		this.efficiency = efficiency;
		this.price= price;
	}
	
}

////////////////////////////////////////////
//class Login extends Machines
//{
//	String name;
//	public void Task()
//	{
//		Login ts = new Login();
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
//		this.name = name;
//		System.out.println("Task Begins");
//		System.out.println("Task Ends");
//	}
//}
