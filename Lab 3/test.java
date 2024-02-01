class person{
    public void act()
    {
        System.out.println("Act as a person");
    }
}
class Student extends person{
    public int roll=10;
    public void act(){
        System.out.println("act as a student");
    }
}
class Teacher extends person{
    // public int roll=10;
    public void act(){
        System.out.println("act as a teacher");
    }
}
public class test {

    public static void main(String[] args){
        person p1=new Student();
        person p2=new Teacher();
        p1.act();
        p2.act();
        System.out.println(((Student)p1).roll);
    }
}