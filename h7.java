class dem1{
	public static void main(String args[]){
		// 8.no
		loop1();
		loop2();
		loop3();
		
	}
	
	
	public static void  loop1(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
	}
	
	public static void loop2(){
		int i=1;
		while(i<=10){
			System.out.println(i++);
		}
		
	}
	
	public static void loop3(){
		int i=1;
		do{
			System.out.println(i);
			i++;
		}while(i<=10);
	}
	
}

