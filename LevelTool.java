package lab3_p2;

public class LevelTool {
	public static void main(String[] args) {
		LevelTemplate levelprot = new Level("Default terrain", "Default obstacles", "Default enemies");

		LevelTemplate level1 = levelprot.clone();
		level1.customLevel("Buldings", "walls", "zombies");

		LevelTemplate level2 = levelprot.clone();
		level2.customLevel("House", "Dors", "vampires");
	}
}