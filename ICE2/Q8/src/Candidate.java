public class Candidate
{
    private String name;
    private int age;
    private String tagline;
    private int votes;

    public Candidate(String paramString1, int paramInt1, String paramString2, int paramInt2)
    {
        name = paramString1;
        age = paramInt1;
        tagline = paramString2;
        votes = paramInt2;
    }
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getTagline()
    {
        return tagline;
    }

    public int getVotes()
    {
        return votes;
    }

    public void addVotes(int paramInt)
    {
        votes += paramInt;
    }

    public String toString()
    {
        return "Candidate[name=" + name + ",age=" + age + ",tagline=" + tagline + ",votes=" + votes + "]";
    }
}
