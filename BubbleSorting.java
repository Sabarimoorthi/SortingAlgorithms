public class BubbleSorting {
    public void sort(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    int temp = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        for(int number:numbers){
            System.out.println(number);
        }
    }
}
