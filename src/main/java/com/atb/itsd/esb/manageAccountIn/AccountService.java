package com.atb.itsd.esb.manageAccountIn;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	public String readAccountBalance(String accountNumber) {
		String retVal = "0.00";
		if (accountNumber.equalsIgnoreCase("1001")) {
			retVal = "1002.32";
		} else if (accountNumber.equalsIgnoreCase("1002")) {
			retVal = "34.38";
		}
		return "$"+retVal;
	}
}
