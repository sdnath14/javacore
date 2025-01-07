class h3{
	public static void main(String args[]){
		int n1=9,n2=10;
	
		int n3=Integer.parseInt(args[0]);
		
		System.out.println("largest is"+getlargest(n1,n2));
		System.out.println("smallest is"+getsmallest(n1,n2,n3));
	}
	
	public static int getlargest(int n1,int n2){
		if(n1>n2){
			return n1;
		}
		else{
			return n2;
		}
	}
	
	public static int getsmallest(int n1,int n2,int n3){
		int sum=n1+n2;
		if(sum<n3){
			return sum;
		}
		else{
			return n3;
		}
	}
}