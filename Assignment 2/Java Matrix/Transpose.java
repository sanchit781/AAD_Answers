public class MatrixTranspose{  
public static void main(String args[]){  
  
int original[][]={{4,6,2},{5,7,9},{4,1,9}};    
    

int transpose[][]=new int[3][3];  

for(int i=0;i<3;i++){    
  for(int j=0;j<3;j++){    
    transpose[i][j]=original[j][i];  
  }    
}    
  
System.out.println("Without transpose:");  
for(int i=0;i<3;i++){    
  for(int j=0;j<3;j++){    
    System.out.print(original[i][j]+" ");    
}    
System.out.println();
}    
System.out.println("With Transpose:");  
for(int i=0;i<3;i++){    
  for(int j=0;j<3;j++){    
    System.out.print(transpose[i][j]+" ");    
}    
System.out.println();  
    }    
  } 
}  
