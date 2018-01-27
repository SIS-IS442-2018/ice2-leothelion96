



public class Spouse
{
    private String name;
    private int age;

    public Spouse(String paramString, int paramInt)
    {
        name = paramString;
        age = paramInt;
    }




    public String getName()
    {
        return name;
    }





    public int getAge()
    {
        return age;
    }






    public String toString()
    {
        return "Spouse's name = " + name + ", Spouse's age = " + age;
    }
}
