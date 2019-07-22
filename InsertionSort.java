public class InsertionSort{
    public void sort(int []a){
        for (int j = 1; j<a.length;j++){
            int chave = a[j];
            int i = j-1;
            while (i>=0 && a[i]>chave){
                a[i+1] = a[i];
                i = i-1;
            }
            a[i+1] = chave;
        }
    }
}
