package romani.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

	// add an init Method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside Method - doMyStartupStuff");
	}

	// add an destroy Method
	public void doMyCleanUpStuffYoYo() {
		System.out.println("TrackCoach: inside Method - doMyCleanUpStuffYoYo");
	}

}
