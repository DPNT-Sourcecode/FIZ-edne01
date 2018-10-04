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
    	if((((number % 3) == 0 ) || number.toString().contains("3")) && (((number % 5) == 0 ) || number.toString().contains("5"))) {
    		return "fizz buzz";
    		
    	}
    	if(((number % 3) == 0 ) || number.toString().contains("3")) {
    		return "fizz";
    	}
    	
    	if(((number % 5) == 0 ) || number.toString().contains("5")) {
    		return "buzz";
    	}
    	
    	if(this.allCharactersSame(number.toString())) {
    		return "deluxe";
    	}
    	
    	
    	return number.toString();
    }
    public boolean allCharactersSame(String s) 
    { 
        int n = s.length(); 
        for (int i = 1; i < n; i++) 
            if (s.charAt(i) != s.charAt(0)) 
                return false; 
              
        return true; 
    } 

}
