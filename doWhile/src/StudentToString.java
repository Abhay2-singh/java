public class StudentToString {
    String name;

    int age;

    String rollNumber;

    String house;

    public StudentToString(String name,int age,String rollNumber,String house){
        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;
        this.house=house;
    }

    @Override
    public String toString() {
        return "Student details:{name:"+name
                +",age:"+age
                +",rollNumber:"+rollNumber
                +",house:"+house+"}";
    }

    public static void main(String[] args) {
        StudentToString stu=new StudentToString("vikash",25,
                "23100btcse14718",
                "15 battalion mahesh guard line");
        System.out.println(stu);
    }
}
