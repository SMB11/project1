
public class project2 {
	
	public static void positionCounter(double t, double F, double M1, double M2,double M3,double my1,double my2, double my3, double x1, double y1, double x2, double x3, double y3) {
		final int g = 10; // m/s^2
		
		double a1; // a1 is for M1
		double a2; // a2 is for M2 and M3
		double x1fin;
		double x2fin;
		double x3fin;
		double y3fin;
		
		if(M1>=10||M1<=0||M2>=10||M2<=0||M3>=10||M3<=0) {
			System.out.println("Invalid masses");
		}
		if(my1>=0.5||my1<=0||my2>=0.5||my2<=0||my3>=0.5||my3<=0) {
			System.out.println("Invalid friction coefficient");
		}
		if(F>=300||F<=-300) {
			System.out.println("Invalid force");
		}
		
		if(F<0) {
			a2 = (M3*g-my3*M3*g-my2*M2*g-F)/(M2+M3);
			a1 = (F-my1*(M1+M2+M3)*g)/(M1+M2+M3);
			
			x1fin=x1+(a1*t*t)/2;
			x2fin=x2+(a2*t*t)/2;
			x3fin= x3+(a1*t*t)/2;
			y3fin = y3-(a2*t*t)/2;
			System.out.println("Value of x1:"+x1fin);
			System.out.println("Value of x2:"+x2fin);
			System.out.println("Value of x3:"+x3fin+"   y3:"+ y3fin);
		}
		else if(F>0) {
			a2 = (M3*g-my3*M3*g-my2*M2*g+F)/(M2+M3);
			a1 = (F-my1*(M1+M2+M3)*g)/(M1+M2+M3);
			
			x1fin=(a1*t*t)/2 - x1;
			x2fin=(a2*t*t)/2 - x2;
			x3fin= (a1*t*t)/2-x3;
			y3fin = y3-(a2*t*t)/2;
			System.out.println("Value of x1:"+x1fin);
			System.out.println("Value of x2:"+x2fin);
			System.out.println("Value of x3:"+x3fin+"   y3:"+ y3fin);
		}
		
	}
	
	
	public static void main(String[] args) {
		positionCounter(1,200,9,5,1,0.4,0.4,0.4,0,0,0,0,0);
	}

}
