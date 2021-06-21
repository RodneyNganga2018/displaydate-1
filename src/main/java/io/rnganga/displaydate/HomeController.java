package io.rnganga.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		String pattern1 = "EEEEE";
		String pattern2 = "dd";
		String pattern3 = "MMMMM, yyyy";
		
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1);
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(pattern3);
		
		String day = simpleDateFormat1.format(new Date());
		String dayOfMonth = simpleDateFormat2.format(new Date());
		String monthYear = simpleDateFormat3.format(new Date());
		
		model.addAttribute("date", String.format("%s, the %s of %s", day, dayOfMonth, monthYear));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		String pattern = "hh:mm a";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String time = simpleDateFormat.format(new Date());
		
		model.addAttribute("time", time);
		return "time.jsp";
	}
}
