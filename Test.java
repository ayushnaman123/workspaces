class Test{
   public static void main(String[] args)
   {
      int a = 50;
	  int b = 90;
	  int c = 200;
	  int d = 300;
	  
	  int res = a>b?(a<c)?a:c:b<d?c:d;
	  System.out.println(res);
   }
}