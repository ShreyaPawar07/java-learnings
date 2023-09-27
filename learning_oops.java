class Student{
    String id;
    String name;
    public void Info(){
        System.out.println(this.id);
        System.out.println(this.name);
    }
}

public class learning_oops {
    public static void main(String args[]){
       Student student1 = new Student();
       student1.id = "23";
       student1.name = "shreya";
       student1.Info();


    }
}
