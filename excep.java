class Main {
  public static void main(String[ ] args) {
  
      	System.out.println("hi");
    int[] myNumbers = {1, 2, 3};
    try{
   
    		//System.out.println(myNumbers[10]); // error!
    		int c = 4/0;
    	}
    catch (ArrayIndexOutOfBoundsException e){
    		System.out.println("hi"+e);
    	}
    	
    //catch (Exception e){
    	//	System.out.println("hsdfi"+e);
    	//}
    	
    	
    	System.out.println("hi");
   }

}
