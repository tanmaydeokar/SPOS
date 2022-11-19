import java.util.Scanner;
class best{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No of Partitions:");
        int par=sc.nextInt();
        System.out.print("Enter the size of partitions:");
        int part[]=new int[par];
        for(int i=0;i<par;i++){
            part[i]=sc.nextInt();
        }
        System.out.print("Enter the Number of processes:");
        int proc=sc.nextInt();
        System.out.print("Enter the size of processes:");
        int proc_[]=new int[proc];
        for(int i=0;i<proc;i++){
            proc_[i]=sc.nextInt();
        }
        int filled[]=new int[par];
        int diff[]=new int[par];
        for(int i=0;i<proc;i++){
            for(int j=0;j<par;j++){
                diff[j]=part[j]-proc_[i];
                if(filled[j]==-1){
                    diff[j]=1;
                }


            }
            int min=32467,k=0;
            for(int j=0;j<par;j++){
                   if(diff[j]<min && diff[j]>0){
                        min=diff[j];
                        k=j;
                   }
            }filled[k]=1;
            if(diff[k]<0){
                System.out.println("Best fit not found for the process:"+(i+1));

            }else{
                System.out.println("Best fit found for the proceess:"+(i+1)+"is"+(part[k])+"and hole of "+(diff[k]));
            }
        }
    }
}