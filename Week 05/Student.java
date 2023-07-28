public class Student
{
    private int id;
    private String name;
    private final String dob;
    private String username;
    private String password;
    
    Student(int id, String name, String dob, String username, String password)
    {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.username = username;
        this.password = password;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDOB()
    {
        return dob;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String toString()
    {
        return "Student ID: "+ id +", name: "+ name +", Date of Birth: "+ dob
        +", username: "+ username;
    }
}