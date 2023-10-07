package com.prowings;

import org.dozer.loader.api.BeanMappingBuilder;

import com.prowings.dto.CustomerAccount;
import com.prowings.model.Account;

public class CustomAccountDtoBuilder extends BeanMappingBuilder{

	@Override
	protected void configure() {
		
		mapping(Account.class, CustomerAccount.class)
		.fields("accNo", "customerAccountNumber")
		.fields("transferCode", "ifscCode");
		
	}
	
	

}
