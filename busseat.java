import java.io.*;
class busseat{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][]seats=new int[5][4];
        for (int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                seats[i][j]=0;
            }
        }
        System.out.println("Bus Seat");
        System.out.println("\nAvailable Seats");
        for (int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                System.out.print("["+(i+1)+","+(j+1)+"]");
            }
            System.out.println();
        }
    System.out.print("\nEnter no of rows(1-5):");
    int row=Integer.parseInt(br.readLine());
    System.out.print("Enter seat no:");
    int seat = Integer.parseInt(br.readLine());
    if(row<1||row>5||seat<1||seat>4)
    {
        System.out.println("Invalid seat selection");
    }
    else if(seats[row-1][seat-1]==1)
        {
        System.out.println("Seat is already booked");
    }
    else{
        seats[row-1][seat-1]=1;
        System.out.println("Seat is booked successfully");
    }
        System.out.println("\nFinal Arrangement");
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                if(seats[i][j]==0){
                    System.out.print("[Available]");
                }
                else{
                    System.out.print("[Booked]");
                }
            }
            System.out.println();
        }
    }
}
