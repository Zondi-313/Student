//this activity is mainly to understand the concept of inheritance
//parent class
class parent{
    int age,id;
    String name;
    void naming(String name)
    {
        System.out.println("name:"+name);
    }
}
//child class
class child extends parent{
    void ageN(int age)
    {
        System.out.println("age of student is:"+age);
    }
}
class Main{
    public static void main(String [] er)
    {
        child s=new child();//creating object of child class
        s.naming("Joseph");
        s.ageN(13);
    }
}