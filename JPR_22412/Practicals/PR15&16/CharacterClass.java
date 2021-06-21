class CharacterClass
{
	public static void main(String args[])
	{
		Character ch = new Character('A');
		System.out.println("Character is : " + ch);
		System.out.println("Character is a Letter");
		System.out.println(Character.isLetter(ch));
		System.out.println("Character is a Digit");
		System.out.println(Character.isDigit(ch));
		System.out.println("Character is a UpperCase");
		System.out.println(Character.isUpperCase(ch));
		System.out.println("Character is a LowerCase");
		System.out.println(Character.isLowerCase(ch));
		System.out.println("Convert character into UpperCase");
		System.out.println(Character.toUpperCase(ch));
		System.out.println("Convert character into LowerCase");
		System.out.println(Character.toLowerCase(ch));
	}
}