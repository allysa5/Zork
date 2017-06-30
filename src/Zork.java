import java.util.*;
public class Zork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Which way would you like to go?");
		Scanner scn = new Scanner(System.in);
		char dir= 'N';
		String room_dir="N";
		int room_num=1;
		int rooms = 0;
		boolean secret = false;
		double []money = new double[8];
		double total= 0;
		Random rand = new Random();
		int rand_char=rand.nextInt(8);
		boolean[] rand_array= new boolean[8];
		rand_array[rand_char]=true;
		double char_total=0;
		for(int i = 0; i < 8 ; i++)
		{
			money[i]=rand.nextInt(1000);
		}
		
		//Zork Extension Assignment
		/*while(dir != 'Q')
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
				total+=money[0];
				money[0]=0.0;
				rooms++;
				if(rand_array[room_num-1]==true)
				{
				char_total= total;
				total=0.0;
				}
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
				total+=money[1];
				money[1]=0.0;
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
				total+=money[2];
				money[2]=0.0;
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
				total+=money[3];
				money[3]=0.0;
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
				total+=money[4];
				money[4]=0.0;
				rooms++;
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
				total+=money[5];
				money[5]=0.0;
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
				total+=money[6];
				money[6]=0.0;
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
				total+=money[7];
				money[7]=0.0;
				rooms++;
			}
			for(int i=0;i<8;i++)
			{	
				rand_array[i]=false;
			}
			
		}*/
		
		//Zork: Get Lamp 
		boolean lamp=false;
		
		int rand_lamp=rand.nextInt(8);
		boolean[] lamp_array= new boolean[8];
		lamp_array[rand_lamp]=true;
		while(!room_dir.equals("Q"))
		{
			if (room_num == 1) 
			{
				System.out.println("You are standing in the foyer of an old house.");
				System.out.println("You see a dead scorpion.");
				if(lamp_array[0]==true)
				{
					System.out.println("Enter 'Get lamp' ");
					String lamp_string=scn.next();
					if(lamp_string.toLowerCase().equals("get lamp"))
					{
						lamp=true;
					}
					if(lamp==true)
					{
						System.out.println("Foyer - also has a spider web made from pure silk containing gold coins which the user can take");
					}
				}
				System.out.println("You can enter 'Front Room' or 'N' or press Q to quit");
			
				room_dir = scn.next();
				if(room_dir.toLowerCase().equals("front room")||room_dir.toLowerCase().equals("n"))
				{
					room_num=2;
				}
				total+=money[0];
				money[0]=0.0;
				rooms++;
				if(rand_array[room_num-1]==true)
				{
				char_total= total;
				total=0.0;
				}
			}
			else if(room_num == 2)
			{
				System.out.println("You are standing in the front room.");
				System.out.println("You see a piano.");
				if(lamp_array[1]==true)
				{
					System.out.println("Enter 'Get lamp' ");
					String lamp_string=scn.next();
					if(lamp_string.toLowerCase().equals("get lamp"))
					{
						lamp=true;
					}
					if(lamp==true)
					{
						System.out.println("Front room - the piano has the sheet music for your favorite song. Allow the user to play the song");
					}
				}
				System.out.println("You can enter 'Foyer' using 'S' or 'Kitchen'using 'W' or 'Library' using 'E' or press Q to quit");
				dir = scn.next().charAt(0);
				if(room_dir.toLowerCase().equals("foyer")||room_dir.toLowerCase().equals("s"))
				{
					room_num=1;
					
				}
				
				else if(room_dir.toLowerCase().equals("kitchen")||room_dir.toLowerCase().equals("w"))
				{
					room_num=3;
					
				}
				else if(room_dir.toLowerCase().equals("library")||room_dir.toLowerCase().equals("e"))
				{
					room_num=4;
					
				}
				total+=money[1];
				money[1]=0.0;
				rooms++;
			}
			else if(room_num == 3)
			{
				System.out.println("You are standing in the library.");
				System.out.println("You see spiders.");
				if(lamp_array[2]==true)
				{
					System.out.println("Enter 'Get lamp' ");
					String lamp_string=scn.next();
					if(lamp_string.toLowerCase().equals("get lamp"))
					{
						lamp=true;
					}
					if(lamp==true)
					{
						System.out.println("Library- there is scroll on the wall with a secret message.");
					}
				}
				System.out.println("You can enter the 'front room' using 'e' or the 'dining room' using 'n' or press Q to quit");
				dir = scn.next().charAt(0);
				if(room_dir.toLowerCase().equals("front room")||room_dir.toLowerCase().equals("e"))
				{
					room_num=2;
				}
				
				else if(room_dir.toLowerCase().equals("dining room")||room_dir.toLowerCase().equals("n"))
				{
					room_num=5;
				}
				total+=money[2];
				money[2]=0.0;
				rooms++;
			}
			else if(room_num == 4)
			{
				System.out.println("You are standing in the kitchen.");
				System.out.println("You see bats.");
				if(lamp_array[3]==true)
				{
					System.out.println("Enter 'Get lamp' ");
					String lamp_string=scn.next();
					if(lamp_string.toLowerCase().equals("get lamp"))
					{
						lamp=true;
					}
					if(lamp==true)
					{
						System.out.println("kitchen -there refrigerator is full of your favorite food/drink");
					}
				}
				System.out.println("You can enter the 'front room' using 'w' or the 'parlor' using 'n' or press Q to quit");
				dir = scn.next().charAt(0);
				if(room_dir.toLowerCase().equals("front room")||room_dir.toLowerCase().equals("w"))
				{
					room_num=2;
				}
				else if(room_dir.toLowerCase().equals("parlor")||room_dir.toLowerCase().equals("n"))
				{
					room_num=7;
				}
				total+=money[3];
				money[3]=0.0;
				rooms++;
			}
			else if(room_num == 5)
			{
				System.out.println("You are standing in the dining room.");
				System.out.println("You see dust and an empty box.");
				if(lamp_array[4]==true)
				{
					System.out.println("Enter 'Get lamp' ");
					String lamp_string=scn.next();
					if(lamp_string.toLowerCase().equals("get lamp"))
					{
						lamp=true;
					}
					if(lamp==true)
					{
						System.out.println("Dining Room - the box is not actually empty, it contains an Amazon gift card which you can take.");
					}
				}
				System.out.println("You can enter the 'front library' using 's' press Q to quit");
				dir = scn.next().charAt(0);
				if(room_dir.toLowerCase().equals("library")||room_dir.toLowerCase().equals("s"))
				{
					room_num=3;
				}
				total+=money[4];
				money[4]=0.0;
				rooms++;
			}
			else if(room_num == 6)
			{
				System.out.println("You are standing in the vault.");
				System.out.println("You see 3 walking skeletons.");
				if(lamp_array[5]==true)
				{
					System.out.println("Enter 'Get lamp' ");
					String lamp_string=scn.next();
					if(lamp_string.toLowerCase().equals("get lamp"))
					{
						lamp=true;
					}
					if(lamp==true)
					{
						
					}
				}
				System.out.println("You can enter the 'parlor' using 'e' or press Q to quit");
				dir = scn.next().charAt(0);
				
				int num = 1+rand.nextInt(4);
				if(num == 4 || secret == true)
				{
					room_num=8;
					secret = true;
				}
				
				else if(room_dir.toLowerCase().equals("parlor")||room_dir.toLowerCase().equals("e"))
				{
					room_num=7;
				}
				total+=money[5];
				money[5]=0.0;
				rooms++;
			}
			else if(room_num == 7)
			{
				System.out.println("You are standing in the parlor.");
				System.out.println("You see a treasure chest.");
				if(lamp_array[6]==true)
				{
					System.out.println("Enter 'Get lamp' ");
					String lamp_string=scn.next();
					if(lamp_string.toLowerCase().equals("get lamp"))
					{
						lamp=true;
					}
					if(lamp==true)
					{
						System.out.println("Parlor - also has a portrait of your favorite movie star and tickets to their latest movie which you can take in case you ever get out of the  house");
					}
				}
				System.out.println("You can  enter the 'vault' using 'w' or to the 'kitchen' using 's' or press Q to quit");
				dir = scn.next().charAt(0);
				if(room_dir.toLowerCase().equals("vault")||room_dir.toLowerCase().equals("w"))
				{
					room_num=6;
				}
				
				else if(room_dir.toLowerCase().equals("kitchen")||room_dir.toLowerCase().equals("s"))
				{
					room_num=4;
				}
				total+=money[6];
				money[6]=0.0;
				rooms++;
			}
			else if(room_num == 8)
			{
				System.out.println("You are standing in the secret room.");
				System.out.println("You see piles of gold.");
				if(lamp_array[7]==true)
				{
					System.out.println("Enter 'Get lamp' ");
					String lamp_string=scn.next();
					if(lamp_string.toLowerCase().equals("get lamp"))
					{
						lamp=true;
					}
					if(lamp==true)
					{
						System.out.println("Secret Room - contains a map of the house along with the piles of gold.");
					}
				}
				System.out.println("You can enter the 'vault' using'w' or press Q to quit");
				dir = scn.next().charAt(0);
				if(room_dir.toLowerCase().equals("vault")||room_dir.toLowerCase().equals("w"))
				{
					room_num=6;
				}
				total+=money[7];
				money[7]=0.0;
				rooms++;
			}
			
			for(int i=0;i<8;i++)
			{	
				rand_array[i]=false;
			}
		}
		System.out.println( "the number of rooms visited: "+rooms);
		int num = 1+rand.nextInt(4);
		if(rooms %num == 0 )
		{
			System.out.println("You will be followed by a ghost");
		}
		System.out.println("Your total amount is : " +total);
		System.out.println("The total character amount is : " +char_total);
		
	}

}
