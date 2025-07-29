package com.codeLine.ecommerce_website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	 @GetMapping({"/", "/index"})
	    public String home() {
	        return "index";  
	    }

	    @GetMapping("/wishlist")
	    public String wishlistPage() {
	        return "wishlist";  
	    }
	    
	    @GetMapping("/cart")
	    public String cartPage() {
	        return "cart"; 
	    }
	    
	    @GetMapping("/search")
	    public String searchPage() {
	        return "search"; 
	    }
	    
	    @GetMapping("/signin")
	    public String signInPage() {
	        return "signin"; 
	    }

	    @GetMapping("/signup")
	    public String signUpPage() {
	        return "signup"; 
	    }

	    @GetMapping("/forgot-password")
	    public String forgotPasswordPage() {
	        return "forgot-password"; 
	    }
	    
	    @GetMapping("/suit")
	    public String suitPage() {
	    	return "suit";
	    }
	    
	    @GetMapping("/saree")
	    public String sareePage() {
	    	return "saree";
	    }
	    
	    @GetMapping("/tshirt")
	    public String tshirtPage() {
	    	return "tshirt";
	    }
}
