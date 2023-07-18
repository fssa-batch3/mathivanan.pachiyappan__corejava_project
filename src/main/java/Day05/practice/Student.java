package Day05.practice;

public class Student {
    String name;
    int id;
    Department department;
    
    public Student(String name, int id, Department department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    
    @Override
    public String toString() {
        return "Student: " + name + "\n" +
                "ID: " + id + "\n" +
                "Department: " + department.deptName + "\n" +
                "Department ID: " + department.deptId;
    }
}

