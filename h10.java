
class Demo2 {
    public static void main(String[] args) {
        String v1 = args[0];
        String v2 = args[1];
        String v3 = args[2];

        
        int result = checklength(v1, v2, v3);

   
        switch (result) {
            case 1 -> System.out.println("hello user");
            default -> System.out.println("incorrect everything");
        }
    }

    public static int checklength(String v1, String v2, String v3) {
        
        if (v1.length() > 3 && v2.length() > 3 && v3.length() > 3){
			return 1;
			
		}
		else{
			return 2;
		}
    }
}


