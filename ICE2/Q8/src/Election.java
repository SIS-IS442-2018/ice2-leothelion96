import java.util.ArrayList;

public class Election
{
    private ArrayList<Candidate> candidateList = new ArrayList();


    private int totalVoters;
    private int spoiltVotes;

    public Election(int paramInt)
    {
        totalVoters = paramInt;
    }

    public void addCandidate(Candidate paramCandidate)
    {
        candidateList.add(paramCandidate);
    }

    public void addSpoiltVotes(int paramInt)
    {
        spoiltVotes += paramInt;
    }

    public Candidate getPresident()
    {
        if (candidateList.isEmpty()) {
            return null;
        }
        Candidate localObject = (Candidate)candidateList.get(0);
        for (Candidate localCandidate : candidateList) {
            if (localCandidate.getVotes() > ((Candidate)localObject).getVotes()) {
                localObject = localCandidate;
            }
        }
        return localObject;
    }

    public int getSpoiltVotes()
    {
        return spoiltVotes;
    }

    public int getTotalVotes()
    {
        int i = 0;
        for (Candidate localCandidate : candidateList) {
            i += localCandidate.getVotes();
        }
        return i + spoiltVotes;
    }

    public double getSpoiltVotesInPercent()
    {
        return 100.0D * spoiltVotes / (spoiltVotes + getTotalVotes());
    }

    public double getVotersInPercent()
    {
        return 100.0D * getTotalVotes() / totalVoters;
    }

    public double getVotesInPercent(Candidate paramCandidate)
    {
        return 100.0D * paramCandidate.getVotes() / (getTotalVotes() - spoiltVotes);
    }
}
