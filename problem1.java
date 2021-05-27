public class problem1 {
    public static void main(String args[]) {
        int count=0;
        int sum=0;
        int arr[];
        for(int i=100;i<200;i++){
            if(i%7==0){
                sum=sum+i;
                count++;
                System.out.println("The number is: "+i);
            } 
        }
        System.out.println("Total no divisible by 7 is: "+count);
        System.out.println("The sum of the "+count+" numbers that are divisible by 7 is: "+sum);
    }
}
