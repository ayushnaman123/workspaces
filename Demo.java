class Demo{
	
    public static void main(String[] args)
	{
       int a=10;
       int b=20;
       int c=30;
   
    if(a<b){
       if(a<c){
	       int res = a*b*c;
		   System.out.println(res);
	   }
	   else{
	       int res1 = a+b+c;
	       System.out.println(res1);
	   }
   
    }
    else if(b<c){
         if(b<a){
		    int res2 = b-c*a; 
			System.out.println(res2);
		 }
		 else{
		    int res4 = b+c*a;
		 }
    }
    else {
      System.out.println("Do you know. How to use java conditionals !");
    }
   
  }
}