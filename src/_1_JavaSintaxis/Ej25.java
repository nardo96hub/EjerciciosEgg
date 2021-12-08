
package _1_JavaSintaxis;


public class Ej25 {

  
    public static void main(String[] args) {
        int [][] a=new int[4][4];
        
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                a[i][j]=(int)(Math.random()*100);
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
                System.out.print(a[j][i]+" ");  
            
            System.out.println("");
        }
            
    }
    
}
