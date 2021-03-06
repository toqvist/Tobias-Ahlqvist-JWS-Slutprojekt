package com.example.slutprojekt.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import java.io.IOException;

import com.example.HttpHelper;

public class CalcControllerTests {
    
	public String BASEURL = "http://localhost:8080/";

	@Test
	public void testCalcEndpoint () throws IOException {

		String subDomain = "calc/";
		int value1 = 10;
		int value2 = 5;
		String operation = "?operation=addition";
		String expected = "{\"result\":\"15.0\"}";
		
		String query = BASEURL + subDomain + operation + "&value1=" + value1 + "&value2=" + value2;
		String actual = HttpHelper.UrlResponse(query, "get", null);
		assertEquals(expected,actual);

		operation = "?operation=subtraction";
		expected = "{\"result\":\"5.0\"}";
		query = BASEURL + subDomain + operation + "&value1=" + value1 + "&value2=" + value2;
		actual = HttpHelper.UrlResponse(query, "get", null);
		assertEquals(expected,actual);

		operation = "?operation=multiplication";
		expected = "{\"result\":\"50.0\"}";
		query = BASEURL + subDomain + operation + "&value1=" + value1 + "&value2=" + value2;
		actual = HttpHelper.UrlResponse(query, "get", null);
		assertEquals(expected,actual);
	}

    
}