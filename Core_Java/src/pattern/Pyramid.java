package pattern;

public class Pyramid {
	
	public Pyramid() {
	
	}
	
	public static void reversePyramid(int n) {
		
		
		for (int i = 0; i <n; i++) {
			
			for (int j = 0; j <i; j++) {
				
				System.out.print(" ");
				
			}
			for (int j = 0; j <n-i; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		
		int n=10;
		
		reversePyramid(n);
		
		for (int i = 1; i <=n; i++) {
			
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
				
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
