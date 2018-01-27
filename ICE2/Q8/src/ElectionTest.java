public class ElectionTest {
    public static void main (String args[]) {
        Candidate c1 = new Candidate("Jack", 40, "Need Water", 20);
        Candidate c2 = new Candidate("Jill", 40, "Have pail", 30);
        Candidate c3 = new Candidate("Humpty", 45, "Sitting on a wall", 40);
        //100 registered voters
        Election e1 = new Election(100);
        e1.addCandidate(c1);
        e1.addCandidate(c2);
        e1.addCandidate(c3);
        // Add 5 votes to Jack
        c1.addVotes(5);
        System.out.println("Jack's votes= " + c1.getVotes());
        //spoilt votes +10
        e1.addSpoiltVotes(10);
        //Winner
        System.out.println("Election Winner: " + e1.getPresident().getName());
        //Percentage
        System.out.println("% of Winners Votes= " + e1.getVotesInPercent(e1.getPresident()));


    }
}
