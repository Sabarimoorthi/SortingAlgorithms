public class BubbleSorting {
    public void sort(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
            swapped = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        displaySortedArray(arr);
    }
    public void displaySortedArray(int[] arr){
        System.out.println("Result of Bubble sorting");
        for(int a:arr){
            System.out.print(a +" ");
        }
        System.out.println();
    }
}
