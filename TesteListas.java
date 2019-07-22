public class TesteListas{
    public static void printArray(int arr[]){ 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }
    public static void main(String []args) {
        InsertionSort i = new InsertionSort();
        SelectionSort s = new SelectionSort();
        int []a = {9,8,7,6,5,4,3,2,1,0};
        printArray(a);
        s.sort(a);
        printArray(a);

    }
}