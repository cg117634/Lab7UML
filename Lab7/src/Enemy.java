//testcomment
//new test 



//made October 19, 2018
public class Enemy {
	
	private int enemyMoveLeft;
	private int enemyMoveRight;
	private int enemyMoveUp;
	private int enemyMoveDown;
	
	
	
	public Enemy(int enemyMoveLeft, int enemyMoveRight, int enemyMoveUp, int enemyMoveDown) {
		
		this.enemyMoveLeft=enemyMoveLeft;
		this.enemyMoveRight=enemyMoveRight;
		this.enemyMoveUp=enemyMoveUp;
		this.enemyMoveDown=enemyMoveDown;
		
		
	}
	
	
	public int moveEnemyLeft() {
		
		return enemyMoveLeft;
		
	}
	
public int moveEnemyRight() {
		
		return enemyMoveRight;
		
	}
public int moveEnemyUp() {
	
	return enemyMoveUp;
	
}
public int moveEnemyDown() {
	
	return enemyMoveDown;
	
}

}
