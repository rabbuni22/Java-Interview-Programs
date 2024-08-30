
public class Check {

	public static void main(String[] args) {
	
		        for (int a = 1; a <= 10; a++) {
		            for (int b = 1; b <= 10; b++) {
		                int leftSide = (int) (Math.pow(a, 3) + Math.pow(b, 3));
		                
		                for (int c = 1; c <= 10; c++) {
		                    for (int d = 1; d <= 10; d++) {
		                        int rightSide = (int) (Math.pow(c, 3) + Math.pow(d, 3));
		                        
		                        if (leftSide == rightSide) {
		                            System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
		                        }
		                    }
		                }
		            }
		        }
		    }
		


	}


