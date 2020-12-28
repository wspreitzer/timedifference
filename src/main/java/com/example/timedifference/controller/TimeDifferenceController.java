package com.example.timedifference.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeDifferenceController {
	
	@RequestMapping(value="/timedifference/{distance}", method=RequestMethod.GET)
	public String getDifference(@PathVariable String distance) {
		StringBuilder retVal = new StringBuilder();
		
		retVal.append("It will take ");
		double team = (int) Double.parseDouble(distance) / 60;
		int factor = (int) (team / 12);
		int extra = factor * 12;
		double single = team + extra;
		double timeDifference = (int) single - team;
		retVal.append(timeDifference);
		retVal.append(" more hours to use one driver");
		return retVal.toString();
	}
}