import java.util.Scanner;
class firstfit{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of partitions:");
        int par=sc.nextInt();
        System.out.print("Enter the size of the partitions:");
        int part[]=new int[par];
        for(int i=0;i<par;i++){
            part[i]=sc.nextInt();

        } 
        System.out.print("Enter the number of the processes:");
        int proc=sc.nextInt();
        System.out.print("Enter the size of the processes:");
        int proc_[]=new int[proc];
        for(int i=0;i<proc;i++){
            proc_[i]=sc.nextInt();

        }
       int filled[]=new int[par];
       for(int i=0;i<proc;i++){
        int k=-1;
         for(int j=0;j<par;j++){
            if(part[j]>proc_[i]){
                 if(filled[j]!=1){
                      k=j;
                      filled[k]=1;
                      break;
                 }
            }

        }
        if(k==-1){
            System.out.println("Best fit not found for the process"+(i+1)+"");
        }else{
            System.out.println("Best fit found for the process "+(i+1)+"is"+part[k]+"and hole of"+(part[k]-proc_[i]));
        }
       }
    }
}
