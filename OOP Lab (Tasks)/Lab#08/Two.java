package lab08;
class Sports
{
    String getName()
    {
        return "Genric Sports";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println("Each Team has players in "+getName());
    }
}
class Cricket extends Sports
{
    String getName()
    {
        return "Cricket";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println("Each Team has players in "+getName());
    
    }
}
class Soccer extends Sports
{
    String getName()
    {
        return "Soccer";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println("Each Team has players in "+getName());
    
    }
}