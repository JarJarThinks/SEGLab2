import java.util.concurrent.ThreadLocalRandom;

public class TestDesign2vs3vs5 {
	public static void GetX2(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP2 point = new PointCP2(random, random2);
			point.getX();
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		//avg = (avg + (endTime-startTime))/ (i+1);
		System.out.println("The average for getX() with design 2 is " + total + " milliseconds");
	}
	public static void GetY2(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP2 point = new PointCP2(random, random2);
			point.getY();
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		//avg = (avg + (endTime-startTime))/ (i+1);
		System.out.println("The average for getY() with design 2 is " + total + " milliseconds");
	}
	public static void GetRho2(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP2 point = new PointCP2(random, random2);
			point.getRho();
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		//avg = (avg + (endTime-startTime))/ (i+1);
		System.out.println("The average for getRho() with design 2 is " + total + " milliseconds");
	}
	public static void GetTheta2(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP2 point = new PointCP2(random, random2);
			point.getTheta();
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		//avg = (avg + (endTime-startTime))/ (i+1);
		System.out.println("The average for getTheta() with design 2 is " + total + " milliseconds");
	}
	public static void GetDistance2(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP2 point = new PointCP2(random, random2);
			double random3 = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random4 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP2 point2 = new PointCP2(random3, random4);
			point.getDistance(point2);
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		//avg = (avg + (endTime-startTime))/ (i+1);
		System.out.println("The average for getDistance() with design 2 is " + total + " milliseconds");
	}
	public static void rotatePoint2(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP2 point = new PointCP2(random, random2);
			double random3 = ThreadLocalRandom.current().nextDouble(0, 365);
			point.rotatePoint(random3);
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		System.out.println("The average for rotatePoint() with design 2 is " + total + " milliseconds");
	}
	public static void toString2(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP2 point = new PointCP2(random, random2);
			point.toString();
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		System.out.println("The average for toString() with design 2 is " + total + " milliseconds");
	}
	/*
	//Start of Design 3
	public static void GetX3(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP3 point = new PointCP3(random, random2);
			point.getX();
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		//avg = (avg + (endTime-startTime))/ (i+1);
		System.out.println("The average for getX() with design 3 is " + total + " milliseconds");
	}
	public static void GetY3(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP3 point = new PointCP3(random, random2);
			point.getY();
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		//avg = (avg + (endTime-startTime))/ (i+1);
		System.out.println("The average for getY() with design 3 is " + total + " milliseconds");
	}
	public static void GetRho3(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP3 point = new PointCP3(random, random2);
			point.getRho();
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		//avg = (avg + (endTime-startTime))/ (i+1);
		System.out.println("The average for getRho() with design 3 is " + total + " milliseconds");
	}
	public static void GetTheta3(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP3 point = new PointCP3(random, random2);
			point.getTheta();
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		//avg = (avg + (endTime-startTime))/ (i+1);
		System.out.println("The average for getTheta() with design 3 is " + total + " milliseconds");
	}
	public static void GetDistance3(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP3 point = new PointCP3(random, random2);
			double random3 = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random4 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP3 point2 = new PointCP3(random3, random4);
			point.getDistance(point2);
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		//avg = (avg + (endTime-startTime))/ (i+1);
		System.out.println("The average for getDistance() with design 3 is " + total + " milliseconds");
	}
	public static void rotatePoint3(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP3 point = new PointCP3(random, random2);
			double random3 = ThreadLocalRandom.current().nextDouble(0, 365);
			point.rotatePoint(random3);
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		System.out.println("The average for rotatePoint() with design 3 is " + total + " milliseconds");
	}
	public static void toString3(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP3 point = new PointCP3(random, random2);
			point.toString();
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		System.out.println("The average for toString() with design 3 is " + total + " milliseconds");
	}
	
	
	//Start of Design 5 testing
	public static void GetX5(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP5 point = new PointCP5(random, random2);
			point.getX();
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		//avg = (avg + (endTime-startTime))/ (i+1);
		System.out.println("The average for getX() with design 5 is " + total + " milliseconds");
	}
	public static void GetY5(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP5 point = new PointCP5(random, random2);
			point.getY();
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		//avg = (avg + (endTime-startTime))/ (i+1);
		System.out.println("The average for getY() with design 5 is " + total + " milliseconds");
	}
	public static void GetRho5(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP5 point = new PointCP5(random, random2);
			point.getRho();
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		//avg = (avg + (endTime-startTime))/ (i+1);
		System.out.println("The average for getRho() with design 5 is " + total + " milliseconds");
	}
	public static void GetTheta5(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP5 point = new PointCP5(random, random2);
			point.getTheta();
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		//avg = (avg + (endTime-startTime))/ (i+1);
		System.out.println("The average for getTheta() with design 5 is " + total + " milliseconds");
	}
	public static void GetDistance5(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP5 point = new PointCP5(random, random2);
			double random3 = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random4 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP5 point2 = new PointCP5(random3, random4);
			point.getDistance(point2);
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		//avg = (avg + (endTime-startTime))/ (i+1);
		System.out.println("The average for getDistance() with design 5 is " + total + " milliseconds");
	}
	public static void rotatePoint5(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP5 point = new PointCP5(random, random2);
			double random3 = ThreadLocalRandom.current().nextDouble(0, 365);
			point.rotatePoint(random3);
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		System.out.println("The average for rotatePoint() with design 5 is " + total + " milliseconds");
	}
	public static void toString5(){
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			double random = ThreadLocalRandom.current().nextDouble(0, 1000);
			double random2 = ThreadLocalRandom.current().nextDouble(0, 365);
			PointCP5 point = new PointCP5(random, random2);
			point.toString();
		}
		long endTime = System.nanoTime();
		long total = (endTime - startTime)/1000000;
		System.out.println("The average for toString() with design 5 is " + total + " milliseconds");
	}	
	*/
	public static void main(String[] args) {
		TestDesign2vs3vs5.GetX2();
		TestDesign2vs3vs5.GetY2();
		TestDesign2vs3vs5.GetRho2();
		TestDesign2vs3vs5.GetRho2();
		TestDesign2vs3vs5.GetDistance2();
		TestDesign2vs3vs5.rotatePoint2();
		TestDesign2vs3vs5.toString2();
		
		/*
		TestDesign2vs3vs5.GetX3();
		TestDesign2vs3vs5.GetY3();
		TestDesign2vs3vs5.GetRho3();
		TestDesign2vs3vs5.GetRho3();
		TestDesign2vs3vs5.GetDistance3();
		TestDesign2vs3vs5.rotatePoint3();
		TestDesign2vs3vs5.toString3();
		
		TestDesign2vs3vs5.GetX5();
		TestDesign2vs3vs5.GetY5();
		TestDesign2vs3vs5.GetRho5();
		TestDesign2vs3vs5.GetRho5();
		TestDesign2vs3vs5.GetDistance5();
		TestDesign2vs3vs5.rotatePoint5();
		TestDesign2vs3vs5.toString5();
		 */
	}
}
