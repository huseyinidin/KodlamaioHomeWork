package stringDemo.src.stringDemo;

public class Main {
	
	public static void main(String[] args) {

		String message = "The weather is very nice today.";
		System.out.println(message);

		System.out.println("Index number: " + message.length());
		System.out.println("Index 5. " + message.charAt(4));
		System.out.println(message.concat(" Wonderful!"));
		System.out.println(message.startsWith("T"));
		System.out.println(message.endsWith("!"));

		char[] characters = new char[3];
		message.getChars(0, 3, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf("r"));
		System.out.println(message.lastIndexOf("r"));

		String newMessage = message.replace(' ', '-');
		System.out.println(newMessage);
		System.out.println(message.substring(4, 8));

		for (String word : message.split(" ")) {
			System.out.println(word);
		}

		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());

	}

}
