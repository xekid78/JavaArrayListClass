/**
 *
 * @author xekid78
 *
 */
import java.util.ArrayList;

public class sample14 {

	public static void main(String[] args) {
		ArrayList<String> team = new ArrayList<String>();

		team.add("１番");
		team.add("２番");
		team.add("３番");
		for (String namber : team) {
			System.out.println(namber);
		}

		// 要素の取り出し
		System.out.println(team.get(2));
		// 配列の長さの取得
		System.out.println(team.size());

	}

}
