import java.util.*;
public class Zork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Which way would you like to go?");
		Scanner scn = new Scanner(System.in);
		char dir= 'N';
		int room_num=1;
		int rooms = 0;
		boolean secret = false;
		Random rand = new Random();
		while(dir != 'Q')
		{
			if (room_num == 1) 
			{
				System.out.println("You are standing in the foyer of an old house.");
				System.out.println("You see a dead scorpion.");
				System.out.println("You can (1)exit to the north or press Q to quit");
			
				dir = scn.next().charAt(0);
				if(dir == '1')
				{
					room_num=2;
				}
				
				rooms++;
			}
			else if(room_num == 2)
			{
				System.out.println("You are standing in the front room.");
				System.out.println("You see a piano.");
				System.out.println("You can (1)exit to the south or (2)exit to the west or (3) exit to the east or press Q to quit");
				dir = scn.next().charAt(0);
				if(dir == '1')
				{
					room_num=1;
					
				}
				else if(dir == '2')
				{
					room_num=3;
					
				}
				else if(dir == '3')
				{
					room_num=4;
					
				}
				rooms++;
			}
			else if(room_num == 3)
			{
				System.out.println("You are standing in the library.");
				System.out.println("You see spiders.");
				System.out.println("You can (1)exit to the east or (2)exit to the north or press Q to quit");
				dir = scn.next().charAt(0);
				if(dir == '1')
				{
					room_num=2;
				}
				else if(dir == '2')
				{
					room_num=5;
				}
				rooms++;
			}
			else if(room_num == 4)
			{
				System.out.println("You are standing in the kitchen.");
				System.out.println("You see bats.");
				System.out.println("You can (1)exit to the west or (2)exit to the north or press Q to quit");
				dir = scn.next().charAt(0);
				if(dir == '1')
				{
					room_num=2;
				}
				else if(dir == '2')
				{
					room_num=7;
				}
				rooms++;
			}
			else if(room_num == 5)
			{
				System.out.println("You are standing in the dining room.");
				System.out.println("You see dust and an empty box.");
				System.out.println("You can (1)exit to the south or press Q to quit");
				dir = scn.next().charAt(0);
				if(dir == '1')
				{
					room_num=3;
				}
			
			}
			else if(room_num == 6)
			{
				System.out.println("You are standing in the vault.");
				System.out.println("You see 3 walking skeletons.");
				System.out.println("You can (1)exit to the east or press Q to quit");
				dir = scn.next().charAt(0);
				
				int num = 1+rand.nextInt(4);
				if(num == 4 || secret == true)
				{
					room_num=8;
					secret = true;
				}
				else if(dir == '1')
				{
					room_num=7;
				}
				rooms++;
			}
			else if(room_num == 7)
			{
				System.out.println("You are standing in the parlor.");
				System.out.println("You see a treasure chest.");
				System.out.println("You can (1)exit to the west or (2)exit to the south or press Q to quit");
				dir = scn.next().charAt(0);
				if(dir == '1')
				{
					room_num=6;
				}
				else if(dir == '2')
				{
					room_num=4;
				}
				rooms++;
			}
			else if(room_num == 8)
			{
				System.out.println("You are standing in the secret room.");
				System.out.println("You see piles of gold.");
				System.out.println("You can (1)exit to the west or press Q to quit");
				dir = scn.next().charAt(0);
				if(dir == '1')
				{
					room_num=6;
				}
				rooms++;
			}
			
		}
		System.out.println( "the number of rooms visited: "+rooms);
		int num = 1+rand.nextInt(4);
		if(rooms %num == 0 )
		{
			System.out.println("You will be followed by a ghost");
		}
	}

}
