class leaderBoardTest{
	public static void main(String args[]){
		leaderBoard sriLanka = new leaderBoard();
		
		sriLanka.add(2,1);
		sriLanka.add(99,8);
		sriLanka.add(5,13);
		sriLanka.print();
		
	}
}

class leaderBoard{
	int[][] playerList;
	int count = 0;
	
	leaderBoard(){
		playerList = new int[11][2];
		for(int i=0; i<11; i++){
			for(int j=0; j<2; j++){
				playerList[i][j] = -1;
			}
		}
	}
	
	void add(int number , int score){
		playerList[count][0] = number;
		playerList[count++][1] = score;
		sort();
	}
	
	public void sort(){
		for(int j=0;j<count;j++){
			int maxval = -2;
			int i=0;
			int maxind = -2;
			System.out.println("Inside first loop");
			for(i=j; i<count;i++){
				System.out.println("Inside second loop");	maxind = j;
				if(playerList[i][1] > maxval){
					maxind = i;
					maxval = playerList[i][1];
					System.out.println("max index"+maxind+"   "+"max value"+maxval);
				}
			}
			//System.out.println(maxind);
			/* int ind = playerList[i][0];
			int val = playerList[i][1];
		
			playerList[i][0] = playerList[j][0];
			playerList[i][1] = playerList[j][1];
		
			playerList[j][1] = ind;
			playerList[j][1] = val; */
		}
		
	}
	
	void print(){
		for(int i=0; i<11; i++){
				System.out.println(playerList[i][0]+" "+playerList[i][1]);
		}
	}
}