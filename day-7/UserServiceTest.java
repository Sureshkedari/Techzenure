package com.techzenure.services;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserServiceTest {
	private static UserService uService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		uService = new UserService(); 
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		uService = null;
	}

	@Test
	public void testFindUserNameById() {
		int uid = 101;
		/*
		String expected = "Sanjay";
		String actual = uService.findUserNameById(uid);
		assertEquals(expected, actual);
		*/
		String name = uService.findUserNameById(uid);
		assertNotNull(name);
	}

	@Test
	public void testFindUserNameById1() {
		int uid = 100;		
		String name = uService.findUserNameById(uid);
		assertNull(name);
	}
	
	@Test(timeout = 3300)
	public void testFindUserNameById2() {
		int uid = 100;		
		String name = uService.findUserNameById(uid);
		assertNull(name);
	}		
}
