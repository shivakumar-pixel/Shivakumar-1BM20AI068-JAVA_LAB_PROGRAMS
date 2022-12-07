class A
{
    private int a,b;
    protected float c,d;
    public int e,f;
    A()
    {
        System.out.println("A Default");
    }
    A(int a1,int b1)
    {
        this.a = a1;
        this.b = b1;
    }
    int geta()
    {
        return a;
    }
    int getb()
    {
        return b;
    }
}

class B extends A
{
    B()
    {

    }
    B(int a1,int a2,float c1,float d1,int e1,int f1)
    {
        super(a1,a2);
        c = c1;
        d = d1;
        e = e1;
        f = f1;
    }
    void sum()
    {
        System.out.println("In Class B");
        float sum = geta() + getb() + c + d + e + f;
        System.out.println("Sum = " + sum);
    }
}

class C extends B
{
    C(int e2,int f2)
    {
        e = e2;
        f = f2;
    }
    void sum()
    {
        System.out.println("In Class C");
        int sum = e + f;
        System.out.println("Sum = "+ sum);
    }
}

class D extends B
{
    D(float c2,float d2)
    {
        c = c2;
        d = d2;
    }
    void sum()
    {
        System.out.println("In Class D");
        float sum = c + d;
        System.out.println("Sum = "+ sum);
    }
}

class twoa
{
    public static void main(String args[])
    {

        B obj1 = new B(5,3,(float)(3.0),(float)(5.0),8,3);
        obj1.sum();
        C obj2 = new C(5,6);
        obj2.sum();
        D obj3 = new D((float)3.4,(float)4.5);
        obj3.sum();
    }
}