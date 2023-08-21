public class BubbleSort
{
    BubbleSort()
    {
        int array[] = {4,3,2,1};
        System.out.println("Before Sorting");
        displayArray(array);
        
        sort(array);
        
        System.out.println("After Sorting");
        displayArray(array);
    }
    
    public void sort(int[] array)
    {
        for(int i=0; i<(array.length-1); i++)
        {
            for(int j=0; j<(array.length-1-i); j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    
    public void displayArray(int[] array)
    {
        for(int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}