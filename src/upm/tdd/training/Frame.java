package upm.tdd.training;

public class Frame {
	public static int totFrames = 0;
	private int frame;
	private int score;
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		++totFrames;
		frame = totFrames;
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public static Frame createSupportFrame(int firstThrow, int secondThrow){
		Frame f = new Frame(firstThrow,secondThrow);
		totFrames--;
		f.frame = 0;
		
		return f;
	}
	
	public int getFrame(){
		return frame;
	}
	
	public void setScoreWithBonus(int bonus){
//		if (precFrame.isStrike()){
//			score = firstThrow+secondThrow+precFrame.getFirstThrow()+precFrame.getSecondThrow();
//		}else if(precFrame.isSpare()){
//			score = firstThrow+secondThrow+precFrame.getFirstThrow();
//		}
//		else{
//			score = (firstThrow+secondThrow);
//		}
		setScore();
		this.score = this.score+bonus;
	}
	
	public void setScore(){
		this.score = this.getFirstThrow()+this.getSecondThrow();
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}
	
	public int getSecondThrow() {
		return secondThrow;
	}

	//the score of a single frame
	public int score(){
		return score;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(this.firstThrow == 10){
			return true;
		}
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if(this.firstThrow+this.secondThrow == 10){
			return true;
		}
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		if(this.getFrame() == 10){
			return true;
		}
		return false;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}


}
