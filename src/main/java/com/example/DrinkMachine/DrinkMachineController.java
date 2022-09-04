/**
 * 
 */
package com.example.DrinkMachine;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author vtr03
 *
 */

@Controller
public class DrinkMachineController {
	@RequestMapping("/")
	public String entry(){
		return "entry";
	}

	@RequestMapping("/insert")
	public String insert(
			@RequestParam(name = "test", defaultValue = "テスト", required = false)String test) {
		String text = test;
		
		return "insert";
	}

}






