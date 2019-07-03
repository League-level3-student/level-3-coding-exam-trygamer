import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		int pf =0;
		int es=0;
		for(int i = 0; i<votes.size();i++) {
			
			
	if(votes.get(i).toLowerCase().contains("pope francis")) {
	pf++;
	
	}
	if(votes.get(i).toLowerCase().contains("edward snowden")) {
		es++;
		
		}

				
			}
			
		if(pf>es) {
			return "pope francis";
		}
		
		else if (es>pf) {
		return "edward snowden";
		
	
		}
		
		else {
			return "TIE";
		}
		
	}

}
