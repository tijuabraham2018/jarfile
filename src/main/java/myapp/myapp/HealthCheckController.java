package myapp.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	/**
	 * Health check API
	 * @return
	 */
	@GetMapping("/health/check")
	public String getBuildVersion() {
		
		Health1 ti = new Health1();
		ti.methord1();
		return "UP --> Version: 10.2222.0 ";

	}

}
