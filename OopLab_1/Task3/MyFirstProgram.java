class MyFirstClass {
    public static void main(String[] s) {
    
    MySecondClass o = new MySecondClass(6, 3);
    System.out.println(o.subtract());
    for(int i = 1; i <= 8; i++){
        for(int j = 1; j <= 8; j++)
        {
            o.setNumber1(i);
            o.setNumber2(j);
            System.out.print(o.subtract());
            System.out.print(" ");
        }
        System.out.println();
    }
    }
}

class MySecondClass{
    private int number1;
    private int number2;
    
    public MySecondClass(int numbe1, int numbe2)
    {
        this.number1 = numbe1;
        this.number2 = numbe2;
    }
    
    public int getNumber1()
    {
        return number1;
    }
    
    public int getNumber2()
    {
        return number2;
    }
    
    public void setNumber1(int num1){
        this.number1 = num1;
    }
    
    public void setNumber2(int num2){
        this.number2 = num2;
    }
    
    public int subtract(){
        return number1 - number2;
    }
}	