import java.util.ArrayList;

public class Teacher extends Person
{
    ArrayList<String> canTeach = new ArrayList<String>();
    ArrayList<String> currentCourses = new ArrayList<String>();

    public Teacher(String name, ArrayList<String>canTeach)
    {
        super(name);
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course)
    {
        for(int i = 0; i < canTeach.size(); i++)
        {
            if(course.equals(canTeach.get(i)))
            {
                canTeach.add(course);
                return true;
            }
        }
        System.out.println(name+ " kan ikke undervise i dette fag: " + course);
        return false;
    }
}




