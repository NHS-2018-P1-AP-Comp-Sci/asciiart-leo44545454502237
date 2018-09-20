/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)

public class ASCIIArt 
{
	public static int x = 0;
	public static void DrawTopHalf()
	{
		System.out.println("       _______       \n    __/       \\\\__     \n __/   OOOOOOOO   \\\\__ \n/   OOOOOOOOOOOOOO    \\\\");

	}
	public static void DrawBottomHalf()
	{
		System.out.println("\\   OOOOOOOOOOOOOO    /");
		System.out.println(" \\__   OOOOOOOO    __/ ");
		System.out.println("   \\______________/    ");
		System.out.println("      \\________/      ");		
	}
	public static void DrawBeam()
	{
		System.out.println("        |    |          ");
	}
	public static void DrawCow()
	{

		System.out.println("   _____/     \\_____   ");
		System.out.println("  /  ^__^           \\  ");
		System.out.println("  |  /oo\\           |   ");
		System.out.println("  |  \\__/ _______   |   ");
		System.out.println("  |      / o .   \\  |   ");
		System.out.println("  |      | .  o .|  |   ");
		System.out.println("  |      \\_______/  |   ");
		System.out.println("  |       /      \\  |   ");
		System.out.println("  \\_________________/   ");
		
	}
	
	public static void DrawCircles()
	{
		System.out.println("                             ");
		System.out.println("       ____________       ");
		System.out.println("      /__     __   \\          ");
		System.out.println("     //  \\   /  \\   \\         ");
		System.out.println("    / \\__/___\\__/    \\        ");
		System.out.println("   /  /         \\   __\\           ");
		System.out.println("  /  /_____      \\ /  \\\\            ");
		System.out.println(" /  //__   \\    __\\\\__/ \\          ");
		System.out.println("/  ///  \\   \\  /  \\\\     \\      ");
		System.out.println("\\  \\\\\\__/   /  \\__//__   /         ");
		System.out.println(" \\  \\\\_____/      //  \\ /           ");
		System.out.println("  \\  \\           / \\__//        ");
		System.out.println("   \\  \\_________/     /        ");
		System.out.println("    \\ /  \\   /  \\    /         ");
		System.out.println("     \\\\__/   \\__/   /            ");
		System.out.println("      \\____________/       ");
		System.out.println("                            ");


	}
	public static void main(String[] args)
	{
		
		DrawTopHalf();
		DrawBottomHalf();
		while (x<10)
		{
			DrawBeam();
			x+=1;
		}
		DrawCow();
		DrawCircles();
	}
}
