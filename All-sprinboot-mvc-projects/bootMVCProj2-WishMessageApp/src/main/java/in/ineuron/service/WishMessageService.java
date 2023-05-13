package in.ineuron.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class WishMessageService implements IWishMessageService {

	@Override
	public String generateWishMessage() {
		LocalTime localTime = LocalTime.now();
		int hour = localTime.getHour();
		System.err.println("-----------");
		if (hour < 10)
			return "Good morning";
		else if (hour < 18)
			return "Good After Noon";
		else
			return "Good Evenining";
		
	}
}
