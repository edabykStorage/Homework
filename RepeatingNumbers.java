package lesson3;

public class RepeatingNumbers {
    public static void main(String[] args) {
    int array[]=new int[] {3,5,4,4,1,1,2,3,7,9,8,5,4,1,9};
    int arrayCount[]=new int[] {1,2,3,4,5,6,7,8,9,0};
    for(int i=0;i< arrayCount.length-1;i++){
        int counter=0;
        for(int j=0;j< array.length-1;j++){
            if(arrayCount[i]==array[j]){
                counter++;
            }
        }
        if(counter>0) {
            System.out.println(arrayCount[i]+ " elamanı arrayde "+counter+" kez bulunmuştur.");
        }
    }
}
}