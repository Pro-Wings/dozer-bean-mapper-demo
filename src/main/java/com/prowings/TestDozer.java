package com.prowings;

import org.dozer.DozerBeanMapper;

import com.prowings.dto.Destination;
import com.prowings.model.Source;

public class TestDozer {
	
	public static void main(String[] args) {
		
		
		Source source = new Source();
		
		source.setId("1234");
		source.setPoint(90.12d);
		Destination destination = new Destination();
		DozerBeanMapper mapper = new DozerBeanMapper();
		
		mapper.map(source, destination);
		
		System.out.println("Source : "+ source);
		System.out.println("Destination : "+ destination);
		
		
	}

}
