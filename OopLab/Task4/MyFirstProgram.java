import myfirstpackage.*;

class MyFirstClass {
    public static void main(String[] s) {
    
    MyFirstPackage o = new MyFirstPackage(6,3);
    System.out.println(o.multiply());
    for(int i =1; i<=8; i++){
    		for(int j= 1; j<=8; j++)
    		{
    		o.setNumber1(i);
    		o.setNumber2(j);
    		System.out.print(o.multiply());
    		System.out.print(" ");
    		}
    		System.out.println();
            }
	}
}

