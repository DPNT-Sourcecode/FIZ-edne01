package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
    public String hello(String friendName) {
    	System.out.println("Hello" + friendName);
        throw new SolutionNotImplementedException();
    }
}
