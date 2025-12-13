public class VotingEligiblity {
    int age;
    public void votElg(int age)
    {
        if(age>=18)
        {
            System.out.println("Is eligible to vote");
        }
        else {
            System.out.println("Not Eligible to vote");
        }
    }

    public static void main(String[] args) {
        VotingEligiblity ve = new VotingEligiblity();
        ve.votElg(52);
    }
}


