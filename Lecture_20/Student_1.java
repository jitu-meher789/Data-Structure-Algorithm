public class Student_1 {
    private String name = "kriti";
    private int age = 89;

    public Student_1(String name, int age){
        this.age = age;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
    public int getAge(){
        return age;
    }
    
    public void setAge1(int age) throws Exception {
        if(age < 0){
            throw new Exception("Age can't be -ve");
        }
        this.age = age;
    }



    public void setAge2(int age) {
        try{
            if(age < 0){
                throw new Exception("Age can't be -ve");
            }
            this.age = age;
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println(getName());
        }
    }    
}
