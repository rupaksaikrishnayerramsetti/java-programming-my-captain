import java.util.*;
public class sample {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int choice;
        System.out.println("pick one : 1.addition \t 2.multiplication \t");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
            int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
            int b[][]={{1,3,4},{2,4,3},{1,2,4}};        
            int c[][]=new int[3][3];    
            for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
            c[i][j]=a[i][j]+b[i][j]; 
            System.out.print(c[i][j]+" ");    
            }    
            System.out.println();   
            } 
                break;
            case 2:
            int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
            int b[][]={{1,1,1},{2,2,2},{3,3,3}};   
            int c[][]=new int[3][3];    
            for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
            c[i][j]=0;      
            for(int k=0;k<3;k++)      
            {      
            c[i][j]+=a[i][k]*b[k][j];      
            } 
            System.out.print(c[i][j]+" ");
            }
            System.out.println();  
            } 
                break;
            default:
            System.out.println("Invalid value");
                break;
        }
	}
}