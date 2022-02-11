/*
 * Universidad del Valle de Guatemala
 * @author Diana Díaz 21066
 * @author Sebastian Franco 21484
 * @author Mario Puente 21290
 * MergeSort.java
 * Algoritmo de ordenamiento
 */


public class MergeSort extends BaseSorts{
    
    public MergeSort(Comparable list[])
    {
         MergeSortRecursive(list,new Comparable[list.length],0,list.length-1);
    }

    public void MergeSortRecursive(Comparable[] list, Comparable temp[],int low, int high)
    {
      
      int n = high-low+1;
      int middle=low+n/2;
      int i;
      if (n<2) return;
      
      for(i=low;i<middle;i++)
      {
          temp[i]=list[i];
      }
      MergeSortRecursive(temp,list,low,middle-1);
      MergeSortRecursive(list,temp,middle,high);
      merge(list, temp,low, middle, high);
      
   } 
   public void merge(Comparable[] list, Comparable temp[], int low, int middle, int high)
   {
         int ri=low;
         int ti=low;
         int di=middle;
         while(ti < middle && di <= high){
             if (list[di].compareTo(temp[ti])>0)
                 list[ri++]=list[di++];
             else
                 list[ri++]=temp[ti++];
         }
         while (ti < middle)
             list[ri++]=temp[ti++];
     }
}
