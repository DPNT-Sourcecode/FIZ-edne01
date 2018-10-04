package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        //throw new SolutionNotImplementedException();
    	
    	/*if(((number % 3) == 0) && (( number % 5) == 0)) {
    		return "fizz buzz";
    	}
    	if((number % 3) == 0) {
    		return "fizz";
    	}
    	if((number % 5) == 0) {
    		return "buzz";
    	} */
    	if((((number % 3) == 0 ) || number.toString().contains("3")) && (((number % 5) == 0 ) || number.toString().contains("5")) ) {
    		if(this.isDeluxe(number)) {
    			return "fizz buzz deluxe";
    		}
    		
    		
    	}
    	if((((number % 3) == 0 ) || number.toString().contains("3")) && (((number % 5) == 0 ) || number.toString().contains("5"))) {
    		return "fizz buzz";
    	}
    	if((((number % 3) == 0 ) || number.toString().contains("3")) ) {
    		
    		
    	}
    	
    	if((((number % 5) == 0 ) || number.toString().contains("5")) ) {
    		
    	}
    	
    	if(((number % 3) == 0 ) || number.toString().contains("3")) {
    		return "fizz";
    	}
    	
    	if(((number % 5) == 0 ) || number.toString().contains("5")) {
    		return "buzz";
    	}
    	
    	
    	
    	
    	
    	
    	return number.toString();
    }
    public boolean allCharactersSameAndGreaterThan10(String s) 
    { 
    	if(Integer.parseInt(s) > 10) {
        int n = s.length(); 
        for (int i = 1; i < n; i++) 
            if (s.charAt(i) != s.charAt(0)) 
                return false; 
              
        return true; 
    } 
    
    return false;
    }
    
    /*public Boolean isDeluxe(Integer number) {
    	if(this.allCharactersSameAndGreaterThan10(number.toString()) && (number % 2 == 0)) {
    		return true;
    	}
    	return false;
    }
    
    public Boolean isFakeDeluxe(Integer number) {
    	if(this.allCharactersSameAndGreaterThan10(number.toString()) && (number % 2 == 1)) {
    		return true;
    	}
    	return false;
    }*/
    
    public Boolean isFizzDeluxe(Integer number) {
    	if(((number % 3) == 0 ) && number.toString().contains("3")) {
    		return true;
    	}
    	return false;
    	
    }
    public Boolean isBuzzDeluxe(Integer number) {
    	if(((number % 5) == 0 ) && number.toString().contains("5")) {
    		return true;
    	}
    	return false;
    	
    }
    
    public Boolean isDeluxe(Integer number) {
    	if(this.isFizzDeluxe(number) || this.isBuzzDeluxe(number)) {
    		return true;
    	}
    	return false;
    }
}
