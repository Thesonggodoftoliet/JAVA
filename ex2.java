import java.util.*;
//数组及其他数据类型的创建；
enum Season{Spring,Summer}
class ex2{
	public static void main(String[] args){
	//数组初始化在声明的时候进行
	int a[]={1,2,3,4,5,6,7,8,9,10};//declair an arry.int a[10] is not allowed.
	int[] b;//the another way to declair an arry.
	int x = 10;
	b = new int[x];//this is not allowed in C/C++.
	
	//可以分别指定二维数组的长度，如下
	int c[][] = new int[2][];//这时，数组还不能够使用，因为长度还没有确定，因此就还不能指定内存单元.
	c[0] = new int[2];
	c[1] = new int[4];
	System.out.println(c.length+"这是数组所能装下的元素的个数");

	//复制数组arraycopy copyOf copyOfRange
	{
	//arraycopy:public static void arraycopy(sourceArray,int index1,copyArray,int index2,int length)
	System.arraycopy(a,0,b,2,5);
	System.out.println(Arrays.toString(b));

	//copyOf:public static double[] copyOf(double[] original,int newLength)
	int[] d = Arrays.copyOf(a,11);
	System.out.println(Arrays.toString(d));
	//copyOfRange:public static double[] copyOfRange(double[] original,int from,int newLength)
	}
	//sort:public static void sort(double a[],int start,int end)升序
	//binarySearch:public static int binarySearch(double[] a,double number)
	System.out.println("想查找的数在"+Arrays.binarySearch(a,5)+"号位置");

	//枚举类型
	Season y=Season.Spring;
	System.out.println(y);
	
	}
}
