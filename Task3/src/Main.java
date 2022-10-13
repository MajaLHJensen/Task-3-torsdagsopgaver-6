import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> liste1 = new ArrayList<>();
        liste1.add("IntelliJ");
        liste1.add("Processing");
        liste1.add("Excel");
        liste1.add("Java 1.0");

        ArrayList<String> liste2 = new ArrayList<>();
        liste2.add("IntelliJ");
        liste2.add("Processing");
        liste2.add("Excel");

        ArrayList<String> liste3 = new ArrayList<>();
        liste3.add("Python");
        liste3.add("Javascript");
        liste3.add("Java 1.0");

        ArrayList<String> liste4 = new ArrayList<>();
        liste4.add("Python");
        liste4.add("Javascript");

        Student student1 = new Student("Maja", liste1);
        student1.addCourses("Java 1.0");
        Student student2 = new Student("Jeanette", liste2);
        student2.addCourses("Java 1.0");
        Teacher teacher1 = new Teacher("Tobias", liste3);
        teacher1.addCourse("Java 1.0");
        Teacher teacher2 = new Teacher("Tess", liste4);
        teacher2.addCourse("Java 1.0");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);

    }


}
