import java.util.ArrayList;
import java.util.Objects;

public class Student extends Person
{
    ArrayList<String> passedCourses = new ArrayList<String>();
    ArrayList<String> currentCourses = new ArrayList<String>();

    public Student(String name, ArrayList<String>passedCourses)
    {
        super(name);
        this.passedCourses = passedCourses;
    }
    public boolean addCourses(String course)
    {
        for(int i = 0; i < passedCourses.size(); i++)
        {
            if(course.equals(passedCourses.get(i)))
            {
                System.out.println(name+ " har allerede bestået dette kursus: " + course);
                return false;
            }
        }
        currentCourses.add(course);
        return true;
    }
}
