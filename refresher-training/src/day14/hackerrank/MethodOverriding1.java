package day14.hackerrank;

public class MethodOverriding1 {
    class Sports{

        String getName(){
            return "Generic Sports";
        }

        void getNumberOfTeamMembers(){
            System.out.println( "Each team has n players in " + getName() );
        }
    }

    class Soccer extends Sports{
        @Override
        String getName(){
            return "Soccer Class";
        }

        // Write your overridden getNumberOfTeamMembers method here
        void getNumberOfTeamMembers(){
            System.out.println( "Each team has 11 players in " + getName() );
        }

    }
}
