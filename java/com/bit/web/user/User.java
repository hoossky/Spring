package com.bit.web.user;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;

@Getter @Setter
public class User {
	
	private String name, userid, password, ssn, address;
	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s", name, userid, password, ssn, address);
	}

}
