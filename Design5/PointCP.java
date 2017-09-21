public abstract class PointCP{
	double xOrRho, yOrTheta;
	
	public PointCP(double xOrRho, double yOrTheta){
		this.xOrRho=xOrRho;
		this.yOrTheta=yOrTheta;
	}
	
	public abstract double getX();
	public abstract double getY();  
	public abstract double getRho();
	public abstract double getTheta();
	public abstract PointCP convert();
	
	}