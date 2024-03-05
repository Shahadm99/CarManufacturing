package lab3_p2;

interface LevelTemplate extends Cloneable {
	LevelTemplate clone();

	void customLevel(String terrain, String obstacles, String enemies);
}

class Level implements LevelTemplate {
	private String terrain;
	private String obstacles;
	private String enemies;

	public Level(String terrain, String obstacles, String enemies) {
		this.terrain = terrain;
		this.obstacles = obstacles;
		this.enemies = enemies;
	}

	@Override
	public LevelTemplate clone() {
		try {
			return (LevelTemplate) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void customLevel(String terrain, String obstacles, String enemies) {
		this.terrain = terrain;
		this.obstacles = obstacles;
		this.enemies = enemies;
		System.out.println("the terrain " + terrain + ",the obstacles " + obstacles + ",the enemies " + enemies);
	}

}
