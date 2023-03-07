public class Potencia  {

	public static void main(String args[]){
		int a = 4;
		int b = 2;
		int res = potencia(a,b);
		System.out.println("La potencia de "+a+ "^"+b+ "es: "+res);
	
	}
	static int potencia(int num, int exp){	
		
		int c=1;
		if(num == 0){
			c = 0;
		}else{
			if(exp == 0){
				c = 1;
			}else{
				if(exp !=1){
					c = num* potencia(num, exp-1);
				}else{
					c = num;
				}
			}			
		}
		return c;
	}

}