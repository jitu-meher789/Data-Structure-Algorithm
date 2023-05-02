public class Person {
    private String name;
    private int age;



    // parameterized constructure
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void fun() {
        int Adhar_no = 901928;
        System.out.println(this.name + " " + this.age + " " + Adhar_no);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
       if(age <= 0)
         this.age = Math.abs(age);

        this.age = age;
    }
}
