class Student {
    String name ;
    int age;
    public void writeinfo(int age){
        System.out.println(age);
    }
    public void writeinfo(String name){
        System.out.println(name);
    }
    public void writeinfo(String name,int age){
        System.out.println(name + " " + age);
    }
}

public class overloading {
        public static void main(String args[]){

            Student s1 = new Student();
            s1.name = "shreya";
            s1.age = 23;
            s1.writeinfo(s1.name,s1.age);

    }
}
