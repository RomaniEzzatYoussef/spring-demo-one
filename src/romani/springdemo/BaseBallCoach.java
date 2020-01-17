package romani.springdemo;

public class BaseBallCoach implements Coach
{
	// define a private field for dependency
	private FortuneService fortuneService;  
	
	// define a constructor for dependency injection
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneSevice to get fortune
		
		return fortuneService.getFortune();
	}

}
