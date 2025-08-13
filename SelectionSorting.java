public class SelectionSorting {
    public void sort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int minIndex =i;
            for(int j=i+1;j<array.length;j++){
                if(array[j] < array[minIndex]){
                    minIndex=j;
                }
            }
            int temp = array[i];
            array[i]=array[minIndex];
            array[minIndex] =temp;
        }
        display(array);
    }
    public void display(int[] array){
        System.out.println("Result of selection sort");
        for(int a :array){
            System.out.print(a +" ");
        }
    }
}
