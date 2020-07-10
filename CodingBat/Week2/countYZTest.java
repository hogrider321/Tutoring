public class countYZTest {
	public static void main(String[] args) {
		CountYZ obj = new CountYZ();
		System.out.println(obj.CountYZ("fez day")); // 1
		System.out.println(obj.CountYZ("day fez")); // 2
		System.out.println(obj.CountYZ("day fyyyz")); // 3
		System.out.println(obj.CountYZ("day yak")); // 4
		System.out.println(obj.CountYZ("day:yak")); // 5
		System.out.println(obj.CountYZ("!!day--yaz!!")); // 6
		System.out.println(obj.CountYZ("yak zak")); // 7
	}
}