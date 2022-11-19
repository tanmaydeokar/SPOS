import java.util.Scanner;
public class fcfs{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of the process:");
		int n=sc.nextInt();
		int pid[]=new int[n];
		int ar[]=new int[n];
		int bt[]=new int[n];
		int ct[]=new int[n];
		int wt[]=new int[n];
		int ta[]=new int[n];
		int avgta=0,avgwt=0,temp;
		for(int i=0;i<n;i++){
			System.out.println("Enter the arrival time of the process: "+(i+1)+":");
			ar[i]=sc.nextInt();
			System.out.println("Enter the burst time of the process:"+(i+1)+":");
			bt[i]=sc.nextInt();
			pid[i]=i+1;
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<(n-(i+1));j++){
				if(ar[j]>ar[j+1]){
					temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;

					temp=pid[i];
					pid[i]=pid[i+1];
					pid[i+1]=temp;

					temp=bt[i];
					bt[i]=bt[i+1];
					bt[i+1]=temp;

					

				}
			}
		}for(int i=0;i<n;i++){
			if(i==0){
				ct[i]=ar[i]+bt[i];

			}else{
				if(ar[i]>ct[i-1]){
					ct[i]=ar[i]+bt[i];
				}
				else{
					ct[i]=ct[i-1]+bt[i];
				}
			}
			ta[i]=ct[i]-ar[i];
			wt[i]=ta[i]-bt[i];
			avgta+=ta[i];
			avgwt+=wt[i];
		}
		System.out.println("PNo \t AT \t   BT  \t Ct \t WT \t TT");
		for(int i=0;i<n;i++){
		
			System.out.println(pid[i]+"\t"+ ar[i]+"\t" +bt[i]+"\t"+ct[i]+"\t"+wt[i]+"\t"+ta[i]);
		}
		sc.close();
		System.out.println("Average Waiting time is"+(avgwt/n));
		System.out.println("Average Turnaround time is"+(avgta/n));
		System.out.println("Gantt chart: ");
                System.out.println("\nProcess ID: ");
                 for(int i=0;i<n;i++){
                     System.out.print(p[i]+"   ");
                 }
	}
}



