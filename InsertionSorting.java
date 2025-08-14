public class InsertionSorting {
    public void sort(int[] array){
        for(int i=1;i<array.length;i++){
            int temp = array[i];
            int j = i-1;
            while (j>=0 && array[j] > temp){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]= temp;
        }
        print(array);
    }
    public void print(int[] numbers){
        System.out.println("Result of Insertion sorting :");
        for(int n:numbers){
            System.out.print(n +" ");
        }
        System.out.println();
    }
}
