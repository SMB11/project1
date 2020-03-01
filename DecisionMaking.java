
public class DecisionMaking {
	
	public static String crossRoad(double v,double x,double dt,double ds,double ap,double an) {
		if(v>80||v<20) {
			return "Wrong speed";
		}
		if(x>150||x<10) {
			return "Wrong distance";
		}
		if(dt>5||dt<2) {
			return "Wrong time";
		}
		if(ds>20||ds<5) {
			return "Wrong distance";
		}
		if(ap>3||ap<1) {
			return "Wrong positive acceleration ";
		}
		if(an>3||an<1) {
			return "Wrong negative acceleration ";
		}
		
		double vConverted = v/3.6;
		double r0 = 0;
		double rt = r0+ vConverted*dt + (ap*dt*dt)/2;
		double vt = vConverted+ap*dt;
		if(rt>x+ds) {
			return "You can cross the street";
		}
		else if(rt<x+ds&&vt-an*dt<x+ds) {
			return "You can stop";
		}
		else {
			return "Guessing is impossible";
		}
	}
	
	
	public static String crossRoadMaxSpeed(double v,double x,double dt,double ds,double ap,double an, double maxSpeed) {
		if(v>80||v<20) {
			return "Wrong speed";
		}
		if(x>150||x<10) {
			return "Wrong distance";
		}
		if(dt>5||dt<2) {
			return "Wrong time";
		}
		if(ds>20||ds<5) {
			return "Wrong distance";
		}
		if(ap>3||ap<1) {
			return "Wrong positive acceleration ";
		}
		if(an>3||an<1) {
			return "Wrong negative acceleration ";
		}
		if(maxSpeed>100||maxSpeed<50) {
			return "Wrong maximum Speed ";
		}
		
		double vConverted = v/3.6;
		double r0 = 0;
		double rt = r0+ vConverted*dt + (ap*dt*dt)/2;
		double vt = vConverted+ap*dt;
		double maxSpeedConverted = maxSpeed/3.6;
//		
		
		if(checkDist(vConverted, rt, dt, ap, vt, maxSpeedConverted)>x+ds) {
			return "You can cross the street";
		}
		else if((v/an)*v-(an*(v/an)*(v/an))/2<rt) {
			return "You can stop";
		}
		else {
			return "Guessing is impossible";
		}
		
	}
	
	public static double checkDist(double v,double rt,double dt ,double ap,double vt,double maxSpeed) {
		double timeInMax = (maxSpeed-vt)/ap;
if((maxSpeed-vt)/ap>dt) {
			return vt;
		}
else {
	double dMaxBefore=v*timeInMax+ap*timeInMax*timeInMax;
	double dMaxAfter = maxSpeed*(dt-timeInMax);
	double d = dMaxAfter+dMaxBefore;
	return d;
}
	}
	
	public static void main(String[] args) {
	    System.out.println("Hello World");
	  }
}
