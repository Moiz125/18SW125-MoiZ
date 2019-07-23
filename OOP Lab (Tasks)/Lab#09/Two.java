class InvalidAgeException extends Exception
{
    InvalidAgeException(String s)
    {
        super(s);
    }
}
class VotingMachine
{
    String []names;
    int votes[];
    public void addStudents(String names[])
    {
        this.names=names;
        votes = new int[names.length];
    }
    public void castVote(int voterAge,String votesToCandidate) throws InvalidAgeException
        {
            if(voterAge<18)
            {
                throw new InvalidAgeException("Candidate can't be under 18");
            }
            else
            {
                for(int i=0;i<names.length;i++)
                {
                    if(names[i]==votesToCandidate)
                    {
                        votes[i]++;
                    }
                }
            }
            
            
    }
    public void printResults()
    {
        for(int j=0;j<names.length;j++)
        {
            System.out.println(names[j]+" have got "+votes[j]+" votes");
        }
    }
    public static void main(String[]nah)
    {
        String []candidates={"MoiZ","Yasir","Ali","Jawad","Sheeraz"};
        VotingMachine machine = new VotingMachine();
        try
        {
            machine.addStudents(candidates);
            machine.castVote(18,"Yasir");
            machine.castVote(18, "MoiZ");
            machine.castVote(18,"Yasir");
            machine.printResults();
            machine.castVote(14,"Ali");
        }
        catch(InvalidAgeException x)
        {
            System.out.println(x);
        }
        
    }
}