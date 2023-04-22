public class zad2{
	public static void main(String[] args){
	double los1 = (Math.random());
	double los2 = (Math.random());
	double los3 = (Math.random());
	if(los1>0.2&&los2>0.2&&los3>0.2){
		System.out.println("los4. ostatnie 3 losowania byly wieksze od 0.2");
	}
	double los4 = (Math.random());
	if(los2>0.2&&los3>0.2&&los4>0.2){
		System.out.println("los4. ostatnie 3 losowania byly wieksze od 0.2");
	}
	int los5 = (int) (Math.random());
	if(los3>0.2&&los4>0.2&&los5>0.2){
		System.out.println("los5. ostatnie 3 losowania byly wieksze od 0.2");
	}
	}
	
}