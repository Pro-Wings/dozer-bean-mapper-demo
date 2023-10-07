package com.prowings;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;

import com.prowings.dto.CustomerAccount;
import com.prowings.dto.Destination;
import com.prowings.model.Account;
import com.prowings.model.Source;

public class TestDozerWithCustomConverter {
	
	public static void main(String[] args) {

		Account account = new Account();
		account.setAccNo("abc123");
		account.setName("Ram");
		account.setTransferCode(9999);
		account.setAccountOpeningDate(new Long("1696659549"));
		account.setCountryCode(8);
		
		
		DozerBeanMapper mapper = new DozerBeanMapper();

		mapper.setMappingFiles(Arrays.asList("dozer_mapping2.xml"));
		
//		mapper.addMapping(new CustomAccountDtoBuilder());
		
		CustomerAccount customerAccount = mapper.map(account, CustomerAccount.class);
		
		System.out.println(account);
		System.out.println("=================");
		System.out.println(customerAccount);
		
	}

}
