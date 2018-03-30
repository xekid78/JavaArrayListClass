# JavaArrayListClass
ArrayListクラス

## 処理
`ArrayList()`クラスを使って配列の出力などを行う。

## コード
```
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
```

## 出力結果
```
１番  
２番  
３番  
  
３番目の要素をゲット  
３番  
  
要素数は3  
  
変更後のArrayList  
１番  
２番  
５番  
  
削除後のArrayList  
１番  
５番  
要素数は2  
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
