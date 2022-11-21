import java.util.Scanner;

public class Round {

    int burst[],run[],n,quantom=0,wait[],time=0,rp=0,ta[];

    public Round(){
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the number of process: ");
        n=sc.nextInt();
        rp=n;
        burst=new int[n];
        run=new int[n];
        wait=new int[n];
        ta=new int[n];
        System.out.println("Enter their burst times: ");
        for(int i=0;i<n;i++){
            burst[i]=sc1.nextInt();
            run[i]=burst[i];
            wait[i]=0;
        }
        System.out.println("Enter Quantom: ");
        quantom=sc.nextInt();
        logic();
    }
    public void logic(){
        int ganntProcess[] = new int[50];
        int process = 0;
        int i=0;
        while(rp!=0){
            if(run[i]>quantom){
                run[i]=run[i]-quantom;
                time=time+quantom;
				/*if(run[i]==0){
					ta[i]=time;
					rp--;
				}*/
                System.out.println("Process: "+i+"time: "+time);
                ganntProcess[process] = i+1;
                process++;
            }
            else if(run[i]<=quantom && run[i]>0){
                time=time+run[i];
                run[i]=run[i]-run[i];
                ta[i]=time;
                rp--;

                System.out.println("Process: "+i+"time: "+time);
                ganntProcess[process] = i+1;
                process++;
            }
            i++;
            if(i==n){
                i=0;
            }
        }
        for(int j=0;j<n;j++){
            wait[j]=ta[j]-burst[j];
            System.out.println(ta[j]+" "+wait[j]);
           // System.out.println(" ");
           // System.out.println(wait[j]);
        }
        for(int x=0;x<process;x++){
            System.out.print("P"+ ganntProcess[x] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        new Round();
    }
}





