class A
{
public static void main(String[]args)
{
	int a[]={10,20,30,40};
	int i,sum=0;
	System.out.println("array elements are: ");
	for(i=0;i<a.length;i++)
	{
 		System.out.println(a[i]);
	}
	for(i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("th sum of array elements is: "+sum);
}
}