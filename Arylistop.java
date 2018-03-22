/**
 *
 * @author xekid78
 *
 */
import java.util.ArrayList;

public class Arylistop {

	public static void main(String[] args) {
		ArrayList<String> team = new ArrayList<String>();

		// 要素の追加
		team.add("１番");
		team.add("２番");
		team.add("３番");
		for (String namber: team) {
			System.out.println(namber);
		}
		System.out.println("");

		// 要素の取り出し
		System.out.println("３番目の要素をゲット");
		System.out.println(team.get(2));
		System.out.println("");
		// 要素数の取得
		System.out.println("要素数は" + team.size());
		System.out.println("");

		// 要素の変更
		System.out.println("変更後のArrayList");
		team.set(2,"５番");
		for (String namber: team) {
			System.out.println(namber);
		}
		System.out.println("");

		// 要素の削除
		System.out.println("削除後のArrayList");
		team.remove(1);
		for (String namber: team) {
			System.out.println(namber);
		}
		// 要素数の取得
		System.out.println("要素数は" + team.size());

	}

}
