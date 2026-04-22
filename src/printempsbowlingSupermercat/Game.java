package printempsbowlingSupermercat;

public class Game {
	/*public String next() {
        return "1";
    }*/
	private int round = 1;
	
	public String next() {
       
        return String.format("%d", round++);
        //bobbbbb
    }

}
