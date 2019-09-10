package com.testng;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  @Parameters("name")
  public void f(String name) {
	  System.out.println("000000");
	  System.out.println("Parameterized value is : " + name);
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
