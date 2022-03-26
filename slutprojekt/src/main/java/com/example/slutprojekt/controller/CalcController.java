package com.example.slutprojekt;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.boot.web.servlet.error.ErrorController;

@RestController
public class CalcController implements ErrorController{
    
	private CalcService cs = new CalcService();

	//http://localhost:8080/calc/?operation=addition&value1=1&value2=2
	@CrossOrigin
	@RequestMapping("/calc/")
	public String math(String operation, float value1, float value2) {
		return cs.math(operation, value1, value2);
	}    

	@RequestMapping(value = "/error", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
	public String errorPage() {
		String htmlString = "";
		htmlString += "<!DOCTYPE html>";
		htmlString += "<html lang=\"en\">";
		htmlString += "<head><meta charset=\"UTF-8\"><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><title>Page not found</title></head>";
		htmlString += "<body><h1>Page does not exist</h1><h2>Valid endpoints:</h2><ul>";
		htmlString += "<li>/Calc - accepts parameters OPERATION, value1 and value2</li></ul></body>";
		htmlString += "</html>";
		return htmlString;
	}

}