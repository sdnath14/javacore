import static java.lang.System.out;

class Demo{
	public static void main(String [] args){
		int n= Integer.parseInt(args[0]);
		
		switch(n){
			case 1->out.println("you are an absoulate looser");
			case 2->out.println("you are deadly");
			case 3->out.println("ydgaf to anybody");
			default->out.println("Switch over");
		}
	}
}
