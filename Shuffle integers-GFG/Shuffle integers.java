
class  Solution
{
    void shuffleArray(long a[], int n)
    {
        int k=n/2-1;
      for(int i =n-1; i>=n/2; i--)
      {
          a[i] = a[i]<<10;
          a[i] = a[i]|a[k];
          k--;
      } 
      k=0;
      for(int i=n/2; i<n; i++)
      {
          a[k++] = a[i]&1023; a[k++] = a[i] >>10;
      }
    }
}
