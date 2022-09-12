/**
 * 
 */
package com.example.DrinkMachine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.DrinkMachine.form.ItemFomr;

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
	public String insert(@ModelAttribute ItemFomr Form) {
		
		
		
		
		
		
		return "insert";
	}

}






