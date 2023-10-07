package com.prowings.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Account {
	
	String accNo;
	String name;
	int transferCode;
	long accountOpeningDate;
	int countryCode;
}
