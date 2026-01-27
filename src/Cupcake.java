import java.util.Scanner;
class Cupcake {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Size of the array");
        int n= sc.nextInt();
        System.out.println("Enter the elements of the array");
        int num[]= new int[n];
        for (int i=0; i<n; i++)
        {
            num[i]=sc.nextInt();
        }  
        double sum=0;
        int l=largest(num);
        for (int i=0; i<n;i++)
        {
            sum= sum+ l*Math.pow(2,j);
            
            num= delete(num);
            l= largest(num);
            
        }
        System.out.println(sum);
    }
    public static int largest(int num, int n)
    {  int l;
          for(int i=0; i<n; i++)
        {
            if(num[i]>l)
              l=num[i];
        }
        return l;
    }
    public static int delete(int num, int n, int del)
    {
           for(int i=0; i<n; i++)
        {
            if(num[i]==del)
              num[i]=num[i+1];
              
        }
        n--;
        return num;
    }
        
        }
