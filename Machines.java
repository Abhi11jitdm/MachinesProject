package project;
import java.util.Scanner;

public class Machines {
	
	


	String voltage;
	String current;
	int frequeny;
	String HP;
	char insulationClass;
	double efficiency;
	
	
	static {
		System.out.println(" motor shop...");
	}

}
class AC extends Machines{
	
}

class threePhase extends AC{

}
class Synchronous extends threePhase{
	
}
class Condenser extends Synchronous{

	public Condenser(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency) {
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
	}
	
	
}
class Asynchronous extends threePhase{
	
}
class squirrelCage extends Asynchronous{

	public squirrelCage(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency) {
		super();
		 this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;TODO Auto-generated constructor stub
	}
	
	
}
class woundRotor extends Asynchronous{

	public woundRotor(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency) {
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
	}
	
	
}
class singlePhase extends AC{
	
}

class Induction extends singlePhase{
	
}
class resistanceSplit extends Induction{

	public resistanceSplit(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency) {
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
	}
	
	
}
class capacitorSplit extends Induction {
	
}
class capacitorStart extends capacitorSplit {

	public capacitorStart(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency) {
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
	}
	
	
}
class capStartRun extends capacitorSplit{

	public capStartRun(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency) {
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
	}
	
}
class permanentSplit extends capacitorSplit{

	public permanentSplit(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency) {
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
	}
	
	
}
class shadedPole extends singlePhase{

	public shadedPole(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency) {
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
	}
	
	
}
class Synchro_nous extends singlePhase {
	
}
class Reluctance extends Synchro_nous{

	public Reluctance(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency) {
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
	}
	
}
class Hysteresis extends Synchro_nous{

	public Hysteresis(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency) {
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
	}
	
	
}
class DC extends Machines{
	public void  DCMachines() {
		System.out.println();
		System.out.println("Enter 1: DC Self Excited");
		System.out.println("Enter 2: DC SeperatelyExcited");
		System.out.print("Choose: ");
		DCMachineDetails();
	}
	public void DCMachineDetails()
	{
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
	case 1:
		System.out.println("You have choose DC Self Ecited Motor");
		selfExcited DC1 = new selfExcited();
		DC1.selfExcitedMc();
		buy();
		break;
		
	case 2:
		System.out.println("You have choose DC Seperately Excited Motor");
		 seperatelyExcited  DC2= new seperatelyExcited();  
		System.out.println (DC2);
		buy();
		break;
	
	default :DCMachines();
	 
		
	}
	
}
 
class selfExcited extends DC{
	public void selfExcitedMc() {
		System.out.println();
		System.out.println("Enter 1: DC Shunt Motor ");
		System.out.println("Enter 2: DC Series Motor ");
		System.out.println("Enter 3: Dc Compound Motor");
		System.out.print("Choose: ");
		selfExcitedDetails();
	}
		public void selfExcitedDetails() {
			Scanner sc = new Scanner(System.in);
			int a= sc.nextInt();
			switch (a) {
				case 1:
					System.out.println("You have choose DC Shunt Motor");
					dcShunt self1 = new dcShunt();
					System.out.println(self1);
					buy();
					break;
					
				case 2:
					System.out.println("You have choose DC Compound Motor");
					dcCompound self2 = new dcCompound();
					System.out.println(self2);
					buy();
					break;
					
				case 3:
					System.out.println("You have choose DC Series Motor");
					dcSeries self3= new dcSeries();
					System.out.println(self3 );
					buy();
					break;
				case 6: DCMachines();
				        break;
				
			    default:
			    	selfExcitedMc();
					
			
		}
	
}

class dcShunt extends selfExcited{

	public dcShunt(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency) {
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
	}
	
	
}
class dcCompound extends selfExcited{

	public dcCompound(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency) {
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
	}
class dcSeries extends selfExcited{

	public dcSeries(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency) {
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass;
		this.efficiency = efficiency;
	}
	
}
}
class seperatelyExcited extends DC{
	
 

	public seperatelyExcited(String voltage, String current, int frequeny, String HP, char insulationClass, double efficiency) {
		super();
		this.voltage = voltage;
		this.current = current;
		this.frequeny = frequeny;
		this.HP = HP;
		this.insulationClass = insulationClass; 
		this.efficiency = efficiency;
	}
	
	
	
}


