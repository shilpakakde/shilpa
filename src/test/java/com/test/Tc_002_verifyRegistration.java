package com.test;

import org.testng.annotations.Test;

import com.Utility.BaseClass;

public class Tc_002_verifyRegistration extends BaseClass{
	@Test
	public void verifyRegistration() {
		System.out.println("test");
		System.out.println(config.getStageUrl());
	}

}
