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
    	if(((number % 15) == 0 ) && number.toString().contains("3") && number.toString().contains("5")) {
    		return "fizz buzz";
    		
    	}
    	if(((number % 3) == 0 ) && number.toString().contains("3")) {
    		return "fizz";
    	}
    	
    	if(((number % 5) == 0 ) && number.toString().contains("5")) {
    		return "buzz";
    	}
    	
    	
    	
    	return number.toString();
    }

}
