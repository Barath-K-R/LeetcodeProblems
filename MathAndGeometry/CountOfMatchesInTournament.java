package MathAndGeometry;

public class CountOfMatchesInTournament {
	public static int numberOfMatches(int n) {
        int teams=n,matches=0;
        while(teams!=1){
             if(teams%2!=0){
                matches+=(teams-1)/2;
                teams=(teams-1)/2+1;
             }
             else{
                matches+=teams/2;
                teams/=2;
             }
        }
        return matches;
    }
	public static void main(String[] args) {
		int n=7;
		System.out.println(numberOfMatches(n));
	}

}
