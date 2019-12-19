public class Main{

    public static void main(String[] args){
        String matrix = "\n";
        for(int i = 0; i < 10; i++){

             for(int j = 0; j < 10; j++){
	         if(i == 0 && j == 0){
		     System.out.print("   " + j);
		     matrix += i + "  " + j + "   ";
		 }
		 else if(i == 0){
		     System.out.print("   " + j);
		     matrix += j + "   ";
		 }
		 else if(j != 0){
		     matrix += i + "" + j + "  ";
		 }
		 else{
		     matrix += i + " " + i + "" + j + "  ";
		 }
  	      }
            matrix += "\b\n";
         }
         System.out.println(matrix);
     }

}
