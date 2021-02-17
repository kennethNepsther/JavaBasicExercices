package duplicateCharactersInString;

public class FindDuplicate {

	public static void main(String[] args) {

//		String sentence = "Kenneth Luzolo";
//		String charaters ="";
//		String duplicates ="";
//		for (int i = 0; i < sentence.length(); i++) {
//			charaters +=sentence.charAt(i);
//			System.out.println(charaters);
//}

		String sentence = "Kenneth Luzolo";
		System.out.println("Original sentece: "+sentence);
		
		String charaters = "";
		String duplicates = "";
		for (int i = 0; i < sentence.length(); i++) {
			String current = Character.toString(sentence.charAt(i));
			if (charaters.contains(current)) {
				if (!duplicates.contains(current)) {
					duplicates += current+ ",";
				}

			}
			charaters += current;

		}
		System.out.println("Characters duplicated: "+duplicates);
	}
}
