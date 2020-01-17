package romani.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// create the object
		Coach ballCoach = new TrackCoach();
		
		// use the object
		System.out.println(ballCoach.getDailyWorkout());
	}

}
