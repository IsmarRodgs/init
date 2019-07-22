public class CountingSort{
    public static void printArray(int arr[]){ 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }
    public int [] sort(int []a,int []b,int k){
        int c[] = new int [k+1];
        for (int i = 0; i< c.length; ++i) {
            c[i] = 0;
        }
        for (int j = 0; j< a.length; ++j) {
            c[a[j]] +=1;
        }
        for (int i = 1; i<=k; ++i) {
            c[i] += c[i-1];
            System.out.println(c[i]);
        }
        for (int j = a.length-1; j >= 0; --j) {
            b[c[a[j]]] = a[j];
            c[a[j]]--;
        }
        return b;

    }
    public static void main (String [] args){
        int []a = {9,8,7,6,5,4,3,2,1,0};
        int []b = new int [a.length];
        CountingSort c = new CountingSort();
        printArray(a);
        printArray(b);
        c.sort(a,b,9);
        printArray(a);
        printArray(b);

    }
}