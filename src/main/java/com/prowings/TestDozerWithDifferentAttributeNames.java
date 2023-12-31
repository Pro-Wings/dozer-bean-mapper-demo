package com.prowings;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;

import com.prowings.dto.CustomerAccount;
import com.prowings.dto.Destination;
import com.prowings.model.Account;
import com.prowings.model.Source;

public class TestDozerWithDifferentAttributeNames {
	
	public static void main(String[] args) {

		Account account = new Account();
		account.setAccNo("abc123");
		account.setName("Ram");
		account.setTransferCode(9999);
		
		DozerBeanMapper mapper = new DozerBeanMapper();

//		mapper.setMappingFiles(Arrays.asList("dozer_mapping.xml"));
		
		mapper.addMapping(new CustomAccountDtoBuilder());
		
		CustomerAccount customerAccount = mapper.map(account, CustomerAccount.class);
		
		System.out.println(account);
		System.out.println("=================");
		System.out.println(customerAccount);
		
	}

}
