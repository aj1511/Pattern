class pattern  
  
   public static void main(String[] args)  
   {  
       int coe=1,rows = 6;  
    for(int i = 0; i < rows; i++) {  
           for(int space = 1; space < rows - i; ++space) {  
               System.out.print("  ");  
           }  
  
           for(int j = 0; j <= i; j++) {  
               if (j == 0 || i == 0)  
                   coe = 1;  
               else  
                   coe = coe * (i - j + 1) / j;  
  
               System.out.printf("%4d", coe);  
           }  
     System.out.println();  
       }  
   }  
  }   
