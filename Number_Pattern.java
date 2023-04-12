package Pattern;

public class Number_Pattern 
{

	public static void main(String[] args) 
	{
		
		
		
		
		System.out.println("\npattern-1\n");
		
		/*
1    
12   
123  
1234 
12345
		 */

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
					System.out.print(j+1);
				else
					System.out.print(" ");

			}
			System.out.println();

		}
System.out.println("\npattern-2\n");
		
		/*
1    
22   
333  
4444 
55555

		 */

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
					System.out.print(i+1);
				else
					System.out.print(" ");

			}
			System.out.println();

		}
		
		System.out.println("\npattern-3\n");
		/*
12345
2345 
345  
45   
5  

		 */

		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if(j+i<=4)
					System.out.print(j+i+1);
				else
				     System.out.print(" ");
			}
		 System.out.println();
		}
		
		System.out.println("\npattern-4\n");
		/*
5    
54   
543  
5432 
54321

		 */

		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
					System.out.print(5-j);
				else
				    System.out.print(" ");
			
			}
		 System.out.println();
		}
		
		System.out.println("\npattern-5\n");
		/*
5    
45   
345  
2345 
12345

		 */

		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
					System.out.print(5+(j-i));
				else
				    System.out.print(" ");
			
			}
		 System.out.println();
		}
		
		System.out.println("\npattern-6\n");
		/*
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5

		 */

		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if(j+i>=4)
					System.out.print(i+1+" ");
				else
				    System.out.print(" ");
			
			}
		 System.out.println();
		}
		
		System.out.println("\npattern-7\n");
		/*
1    
21   
321  
4321 
54321

		 */

		
		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
				 System.out.print(1-(j-i));
				else
					System.out.print(" ");
				
			}
			
		 System.out.println();
		}
		
		
		System.out.println("\npattern-8\n");
		/*
1    
23   
345  
4567 
56789

		 */

		int cnt1=1;
		for(int i=0; i<5; i++)
		{
			int cnt2=cnt1;
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
				{
					System.out.print(cnt2);
				   cnt2++;
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			cnt1++;
		 System.out.println();
		}
		System.out.println("\npattern-9\n");
		/*
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 

		 */
		int cnt2=5;
		for(int i=0; i<5; i++)
		{
			int cnt=cnt2;
			for(int j=0; j<5; j++)
			{
				if(j+i>=4)
				{
					System.out.print(cnt+" ");
				   cnt++;
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			cnt2--;
		 System.out.println();
		
		}
		
		
		
		System.out.println("\npattern-10\n");
		/*
12345
 1234
  123
   12
    1
   12
  123
 1234
12345


		 */
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i>=0 && i<=4)
					System.out.print(j-i+1);
				else if(j+i>=8 && i>4)
				System.out.print(j+i-7);
				else
				System.out.print(" ");
					
			}
			System.out.println();
		}
		
		
		System.out.println("\npattern-11\n");
		/*
12345
1234 
123  
12   
1    
12   
123  
1234 
12345

		 */
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i<=4 || j-i<=-4)
					System.out.print(j+1);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("\npattern-12\n");
		/*
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 

		 */
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i>=0 || j+i>=8)
					System.out.print(j+1+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("\npattern-13\n");
		/*
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 

		 */
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i>=0 || j+i>=9)
					{
					if(i<=5)
					System.out.print(j+1+" ");
					else
						System.out.print(j+1+" ");
					}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("\npattern-14\n");
		/*
1    
12   
123  
1234 
12345
1234 
123  
12   
1 

		 */
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i<=8 && j-i<=-0)
					System.out.print(j+1);
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-15\n");
		/*
1        
22       
333      
4444     
55555    
666666   
7777777  
88888888 
999999999

		 */

		for(int i=0; i<9; i++)
		{
			
			for(int j=0; j<9; j++)
			{
				if(j-i<=0)
					System.out.print(i+1);
				else
				    System.out.print(" ");
			
			}
		 System.out.println();
		}
		
		System.out.println("\npattern-16\n");
		/*
1        
12       
123      
1234     
12345    
123456   
1234567  
12345678 
123456789


		 */

		for(int i=0; i<9; i++)
		{
			
			for(int j=0; j<9; j++)
			{
				if(j-i<=0)
					System.out.print(j+1);
				else
				    System.out.print(" ");
			
			}
		 System.out.println();
		}
		
		System.out.println("\npattern-17\n");
		/*
9        
88       
777      
6666     
55555    
444444   
3333333  
22222222 
111111111

		 */

		for(int i=0; i<9; i++)
		{
			
			for(int j=0; j<9; j++)
			{
				if(j-i<=0)
					System.out.print(9-i);
				else
				    System.out.print(" ");
			
			}
		 System.out.println();
		}
		
		System.out.println("\npattern-18\n");
		/*
9        
98       
987      
9876     
98765    
987654   
9876543  
98765432 
987654321


		 */

		for(int i=0; i<9; i++)
		{
			
			for(int j=0; j<9; j++)
			{
				if(j-i<=0)
					System.out.print(9-j);
				else
				    System.out.print(" ");
			
			}
		 System.out.println();
		}
		
		System.out.println("\npattern-19\n");
		/*
        1
       12
      123
     1234
    12345
   123456
  1234567
 12345678
123456789


		 */
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j+i>=8)
				System.out.print(j+i-7);
				else
				System.out.print(" ");
					
			}
			System.out.println();
		}
		
		System.out.println("\npattern-20\n");
		/*
        1 
       2 2 
      3 3 3 
     4 4 4 4 
    5 5 5 5 5 
   6 6 6 6 6 6 
  7 7 7 7 7 7 7 
 8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9 


		 */
		int cnt5=1;
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if( j+i>=8)
				{
					System.out.print(cnt5+" ");
					
				}
				
				else
					System.out.print(" ");
			}
			cnt5++;
		 System.out.println();
		}
		
		
		System.out.println("\npattern-21\n");
		/*

9 9 9 9 9 9 9 9 9 
 8 8 8 8 8 8 8 8 
  7 7 7 7 7 7 7 
   6 6 6 6 6 6 
    5 5 5 5 5 
     4 4 4 4 
      3 3 3 
       2 2 
        1

		 */
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j-i>=0)
					System.out.print(9-i+" ");
				else
					System.out.print(" ");

			}
			System.out.println();
		} 

		System.out.println("\npattern-22\n");
		/*

        1 
       2 2 
      3 3 3 
     4 4 4 4 
    5 5 5 5 5 
   6 6 6 6 6 6 
  7 7 7 7 7 7 7 
 8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9 

		 */
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j+i>=8)
					System.out.print(i+1+" ");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
		
		System.out.println("\npattern-23\n");
		/*
        1 
       1 2 
      1 2 3 
     1 2 3 4 
    1 2 3 4 5 
   1 2 3 4 5 6 
  1 2 3 4 5 6 7 
 1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 8 9  

		 */
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j+i>=8)
					System.out.print(j+i-7+" ");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
		
		
		System.out.println("\npattern-24\n");
		/*
    
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
 4 4 4 4 
  3 3 3 
   2 2 
    1   

		 */
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i>=4 && j-i>=-4)
				 {
					 if(i<=4)
					    System.out.print(i+1+" ");
					 else
						System.out.print(9-i+" ");
				 }
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-25\n");
		/*
1        1
12      21
123    321
1234  4321
1234554321


		 */
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(j-i<=0 || j+i>=9)
				{
					if(j<=4)
					System.out.print(j+1);
					else
					System.out.print(10-j);
				}
				else
					System.out.print(" ");
			}
			
		 System.out.println();
		}
		
		
		System.out.println("\npattern-26\n");
		
		System.out.println("Using counter\n");
		/*
1        1
12      21
123    321
1234  4321
1234554321


		 */
		int temp1=1;
		for(int i=0; i<5; i++)
		{
			int temp=1;
			int temp2=temp1; 
			for(int j=0; j<10; j++)
			{
				if(j-i<=0 || j+i>=9)
				{
					if(j<=4)
					System.out.print(temp++);
					else
					System.out.print(temp2--);
				}
				else
					System.out.print(" ");
			}
			temp1++;
		 System.out.println();
		}
		System.out.println("\npattern-27\n");
		
		/*
1        1
22      22
333    333
4444  4444
5555555555


		 */
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(j-i<=0 || j+i>=9)
				{
					if(j<=4)
					System.out.print(i+1);
					else
					System.out.print(i+1);
				}
				else
					System.out.print(" ");
			}
			
		 System.out.println();
		}
		System.out.println("\npattern-28\n");
		
		/*
1        1
12      12
123    123
1234  1234
1234512345



		 */
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(j-i<=0 || j+i>=9)
				{
					if(j<=4)
					System.out.print(j+1);
					else
					System.out.print((j+i)-8);
				}
				else
					System.out.print(" ");
			}
			
		 System.out.println();
		}
		
		System.out.println("\npattern-29\n");
		/*
1     
2 3    
4 5 6   
7 8 9 10  
11 12 13 14 15

		 */
		int cnt3=1;
		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
					System.out.print(cnt3++ +" ");
				else
					System.out.print(" ");
			}
			
		 System.out.println();
		}

		System.out.println("\npattern-30\n");
		/*
1     
2 6    
3 7 10   
4 8 11 13  
5 9 12 14 15 

		 */
		int num=1;
		for(int i=0; i<5; i++)
		{
			int D =4;
			int num2=num;
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
				
					System.out.print(num2+" ");
					
				else
					System.out.print(" ");
				num2=num2+D;
				D--;
			}
			num++;
		 System.out.println();
		}
		
		System.out.println("\npattern-31\n");
		/*
1        
121      
12321    
1234321  
123454321

		 */
		int cnt4=1;
		
		for(int i=0; i<5; i++)
		{
			int cnt=cnt4;
			for(int j=0; j<9; j++)
			{
				if(j+i>=4 && j-i<=4)
				{
					System.out.print(cnt);
					if(j<4)
						cnt++;
					else
						cnt--;
				}
				
				else
					System.out.print(" ");
			}
			
		 System.out.println();
		}
		
		
		System.out.println("\npattern-32\n");
		/*
1        
121      
12321    
1234321  
123454321

		 */
		int mid=0;
		
		for(int i=0; i<9; i=i+2)
		{
			int cnt=1;
			for(int j=0; j<9; j++)
			{
				if(j-i<=0)
				{
					if(j<mid)
					System.out.print(cnt++);
					else
						System.out.print(cnt--);
				}
				else
					System.out.print(" ");
			}
			mid++;
		 System.out.println();
		}
		
		System.out.println("\npattern-33\n");
		/*
1        
121      
12321    
1234321  
123454321

		 */
		for(int i=0; i<9; i=i+2)
		{
		int cnt=1;
			for(int j=0; j<9; j++)
			{
				if(j-i<=0)
				{
					System.out.print(cnt);                 
					if(j*2<i) 
						cnt++;
					else
						cnt--;
					               
				}
				else
					System.out.print(" ");
			}
			
		 System.out.println();
		}
		
		
		System.out.println("\npattern-34\n");
		/*
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999

		 */
		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<10; j++)
			{
				for(int k=0; k<3; k++)
				{
					System.out.print(j);
					}
			}
			
		 System.out.println();
		}
		
		
		System.out.println("\npattern-35\n");
		/*
000000000000000000000000000000
111111111111111111111111111111
222222222222222222222222222222
333333333333333333333333333333
444444444444444444444444444444

		 */
		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<10; j++)
			{
				for(int k=0; k<3; k++)
				{
					System.out.print(i);
					}
			}
			
		 System.out.println();
		}
		
		System.out.println("\npattern-36\n");
		/*
10101
10101
10101
10101
10101
		 */
		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if(j%2==0)
				
					System.out.print(1);
				
				else
					System.out.print(0);
			}
			
		 System.out.println();
		}
		
		System.out.println("\npattern-37\n");
		/*
10101
01010
10101
01010
10101
		 */

		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if((j+i)%2==0)
				
					System.out.print(1);
				
				else
					System.out.print(0);
			}
			
		 System.out.println();
		}
		System.out.println("\npattern-38\n");
		/*
1    
10   
101  
1010 
10101
		 */

		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
				{
					if(j%2==0)
					System.out.print(1);
					else
						System.out.print(0);
					
				}
				
				else
					System.out.print(" ");
			}
			
		 System.out.println();
		}	
		
		System.out.println("\npattern-39\n");
		/*
1    
01   
101  
0101 
10101	 */

		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
				{
					if((j-i)%2==0)
					System.out.print(1);
					else
						System.out.print(0);
					
				}
				
				else
					System.out.print(" ");
			}
			
		 System.out.println();
		}	
		
		
		System.out.println("\npattern-40\n");
		/*
10000
01000
00100
00010
00001	 */

		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
					if((j-i)==0)
					 System.out.print(1);
					else
					 System.out.print(0);
			}
			
		 System.out.println();
		}		
		
		System.out.println("\npattern-41\n");
		/*
10000
02000
00300
00040
00005
	 */

		int c=1;
		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
					if((j-i)==0)
					 System.out.print(c++);
					else
					 System.out.print(0);
			}
			
		 System.out.println();
		}		
		
		System.out.println("\npattern-42\n");
		/*
11111
11122
11333
14444
55555
	 */

		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
					if(j+i>=4)
					 System.out.print(i+1);
					else
					 System.out.print(1);
			}
			
		 System.out.println();
		}
		
		System.out.println("\npattern-43\n");
		/*
55555
45555
34555
23455
12345
	 */

		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
					if(j-i<=0)
					 System.out.print(5+(j-i));
					else
					 System.out.print(5);
			}
			
		 System.out.println();
		}
		
		System.out.println("\npattern-44\n");
		/*
55555
54444
54333
54322
54321
	 */

		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
					if(j-i<=0)
					 System.out.print(5-j);
					else
					 System.out.print(5-i);
			}
			
		 System.out.println();
		}												
		
		
	}
}
