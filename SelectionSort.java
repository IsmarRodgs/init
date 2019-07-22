public class SelectionSort{
    public void sort(int []a){
        for (int i = 0;i<a.length;i++){
            int min = i;
            for (int j = i+1;j<a.length;j++){
                if (a[min]>a[j]){
                    min = j;
                }
            }
            swap(a,i,min);
        }
    }
    public void swap(int []a, int i, int min){
        int chave = a[min];
        a[min] = a[i];
        a[i] = chave;
    }
}