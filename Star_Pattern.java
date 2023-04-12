package Pattern;

public class Star_Pattern
{

	public static void main(String[] args)
	{


		System.out.println("Star Pattern \n");

		System.out.println("pattern-1\n");
		/* 
output:
		 *****
		 *****
		 *****
		 *****
		 *****

		 */

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print("*");

			}
			System.out.println();

		}


	       System.out.println("\npattern-2\n");

		/* 
output:

		 *    
		 **   
		 ***  
		 **** 
		 *****

		 */


		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}


		System.out.println("\npattern-3\n");

		/* 
output:

		 *****
		 **** 
		 ***  
		 **   
		 *    

		 */

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i<=4)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-4\n");

		/* 
output:

		 *****
		 ****
		 ***
		 **
		 *   

		 */

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i>=0)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}




		System.out.println("\npattern-5\n");

		/* 
output:

		 *
		 **
		 ***
		 ****
		 ***** 

		 */

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i>=4 )
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-6\n");

		/* 
output:


		 *    
		 ***   
		 *****  
		 ******* 
		 *********

		 */

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j+i>=4 && j-i<=4 )
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-7\n");

		/* 
output:

		 *********
		 ******* 
		 *****  
		 ***   
		 * 

		 */

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j+i<=8 && j-i>=0 )
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-8\n");

		/* 
output:
		 *    
		 ***   
		 *****  
		 ******* 
		 *********
		 ******* 
		 *****  
		 ***   
		 *  

		 */

		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if((j+i>=4 && j-i<=4) && (j+i<=12 && j-i>=-4) )
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-9\n");

		/* 
output:


    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *

		 */

		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i>=4 && j-i>=-4)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-10\n");

		/* 
output:

		 *    
		 **   
		 ***  
		 **** 
		 *****
		 **** 
		 ***  
		 **   
		 *

		 */

		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i<=8 && j-i<=-0)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-11\n");

		/* 
output:

		 *****
		 ****
		 ***
		 **
		 *
		 **
		 ***
		 ****
		 *****

		 */

		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i>=8 || j-i>=-0)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}
		System.out.println("\npattern-12\n");


		/* 
output:

		 *****
		 **** 
		 ***  
		 **   
		 *    
		 **   
		 ***  
		 **** 
		 *****

		 */

		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i<=4 || j-i<=-4)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-13\n");

		/* 
output:

		 * * * * * 
		 * * * * 
		 * * * 
		 * * 
		 * 

		 */

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i>=0)
					System.out.print("* ");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-14\n");

		/* 
output:

		 * 
		 * * 
		 * * * 
		 * * * * 
		 * * * * *

		 */

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i>=4 )
					System.out.print("* ");
				else
					System.out.print(" ");

			}
			System.out.println();


		}

		System.out.println("\npattern-15\n");

		/* 
output:

		 * 
		 * * 
		 * * * 
		 * * * * 
		 * * * * * 
		 * * * * 
		 * * * 
		 * * 
		 * 

		 */

		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i>=4 && j-i>=-4)
					System.out.print("* ");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-16\n");

		/* 
output:


		 * * * * * 
		 * * * * 
		 * * * 
		 * * 
		 * 
		 * * 
		 * * * 
		 * * * * 
		 * * * * *  

		 */

		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i>=8 || j-i>=-0)
					System.out.print("* ");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-17\n");

		/* 
output:

		 *********
		 **** ****
		 ***   ***
		 **     **
		 *       *
		 **     **
		 ***   ***
		 **** ****
		 *********  

		 */

		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if((j+i<=4 || j-i<=-4) || (j-i>=4 || j+i>=12))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-18\n");

		/* 
output:

		 *         
		 * * *       
		 * * * * *     
		 * * * * * * *   
		 * * * * * * * * *  

		 */

		for(int i=0; i<9; i=i+2)
		{
			for(int j=0; j<9; j++)
			{
				if(j-i<=0)
					System.out.print("* ");
				else
					System.out.print(" ");

			}
			System.out.println();
		} 

		System.out.println("\npattern-19\n");

		/* 
output:

		* 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
		 */

		for(int i=0; i<9; i=i+2)
		{
			for(int j=0; j<9; j++)
			{
				if(j+i>=8)
					System.out.print("* ");
				else
					System.out.print(" ");

			}
			System.out.println();
		} 

		System.out.println("\npattern-20\n");

		/* 
output:


		 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        *  

		 */

		for(int i=0; i<9; i=i+2)
		{
			for(int j=0; j<9; j++)
			{
				if(j-i>=0)
					System.out.print("* ");
				else
					System.out.print(" ");

			}
			System.out.println();
		} 


		System.out.println("\npattern-21\n");

		/* 
output:

		 
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 

		 */

		for(int i=0; i<18; i=i+2)
		{
			for(int j=0; j<9; j++)
			{
				if( j+i>=8 && j-i>=-8)
					System.out.print("* ");
				else
					System.out.print(" ");

			}
			System.out.println();
		} 

		System.out.println("\npattern-22\n");

		/* 
output:

* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 

		 */

		for(int i=0; i<18; i=i+2)
		{
			for(int j=0; j<9; j++)
			{
				if( j-i>=0 || j+i>=16)
					System.out.print("* ");
				else
					System.out.print(" ");

			}
			System.out.println();
		}

		System.out.println("\npattern-23\n");

		/* 
output:

		 * *      
		 ** **    
		 *** ***  
		 **** **** 

		 */

		for(int i=2; i<9; i=i+2)
		{
			for(int j=0; j<9; j++)
			{
				if(j-i<=0)
				{
					if(j*2==i)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				else
					System.out.print(" ");

			}
			System.out.println();
		} 

		System.out.println("\npattern-24\n");


		/* 
output:

		 *       *
		 **     **
		 ***   ***
		 **** ****
		 *********
		 **** ****
		 ***   ***
		 **     **
		 *       * 

		 */

		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if((j-i<=0 && j+i<=8) || (j+i>=8 && j-i>=0))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-25\n");

		/* 
output:

		 *       *
		 **     **
		 ***   ***
		 **** ****
		 *********

		 */

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j-i<=0 || j+i>=8)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-26\n");

		/* 
output:

		 *********
		 **** ****
		 ***   ***
		 **     **
		 *       *

		 */

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j-i>=4 || j+i<=4)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-27\n");

		/* 
output:

		 *********
		 **** ****
		 ***   ***
		 **     **
		 *       *

		 */

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j-i>=4 || j+i<=4)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}


		

		System.out.println("\npattern-28\n");

		/* 
output:
*****    
 *****   
  *****  
   ***** 
	*****

		 */

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j-i>=0 && j-i<=4)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		System.out.println("\npattern-29\n");

		/* 
output:
    *****
   ***** 
  *****  
 *****   
***** 
		 */

		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if((j+i>=4 && j+i<=8 && i<=4))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}
		
		System.out.println("\npattern-30\n");

		/* 
output:
*****    
 *****   
  *****  
   ***** 
    *****
   ***** 
  *****  
 *****   
*****

		 */

		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if((j-i>=0 && j-i<=4 && i<=4)||(j+i>=8 && j+i<=12 && i>4))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

		
		System.out.println("\npattern-31\n");

		/* 
output:
    *****
   ***** 
  *****  
 *****   
*****    
 *****   
  *****  
   ***** 
    *****

		 */

		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if((j+i>=4 && j+i<=8 && i<=4) || (j-i>=-4 && j-i<=0 && i>4))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}
		
		
		
		System.out.println("\npattern-32\n");

		/* 
output:
 ** ** 
*  *  *
 *   * 
  * *  
   *  
// 6-1
		 */

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<7; j++)
			{
				if((j-i==-1 || j+i==7) || (i==0 && j%3!=0) || (i==1 && j==3))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}
		
		System.out.println("\npattern-33\n");

		/* 
output:
*****    
 *   *   
  *   *  
   *   * 
    *****

		 */

		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<9; j++)
			{
				if((i==0 && j<=4) || (i==4 && j>=4) || j-i==0 || j-i==4)
				
					System.out.print("*");
				
				else
					System.out.print(" ");
			}
			
		 System.out.println();
		}
		

		System.out.println("\npattern-34\n");

		/* 
output:
    *****
   *   * 
  *   *  
 *   *   
*****    


		 */

		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<9; j++)
			{
				if((i==0 && j>=4) || (i==4 && j<=4) || j+i==4 || j+i==8)
				
					System.out.print("*");
				
				else
					System.out.print(" ");
			}
			
		 System.out.println();
		}		
		
		System.out.println("\npattern-35\n");

		/* 
output:
    *
   **
  * *
 *  *
*   *
 *  *
  * *
   **
    *

		 */
		for(int i=0; i<9; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if(j==4 || j+i==4 || j-i==-4)
				
					System.out.print("*");
				
				else
					System.out.print(" ");
			}
			
		 System.out.println();
		}
		
		
		System.out.println("\npattern-36\n");

		/* 
output:
    
*    
**   
* *  
*  * 
*   *
*  * 
* *  
**   
*    


		 */
		for(int i=0; i<9; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if(j==0 || j-i==0 || j+i==8)
				
					System.out.print("*");
				
				else
					System.out.print(" ");
			}
			
		 System.out.println();
		}
		

		System.out.println("\npattern-37\n");

		/* 
output:
    
    *    
   * *   
  *   *  
 *     * 
*       *
 *     * 
  *   *  
   * *   
    *    


		 */
		for(int i=0; i<9; i++)
		{
			
			for(int j=0; j<9; j++)
			{
				if(j+i==4 || j-i==4 || j-i==-4 || j+i==12)
				
					System.out.print("*");
				
				else
					System.out.print(" ");
			}
			
		 System.out.println();
		}
		
		
		System.out.println("\npattern-38\n");

		/* 
output:

*********
 *     * 
  *   *  
   * *   
    *  

 */
		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<9; j++)
			{
				if(i==0 || j-i==0 || j+i==8)
				
					System.out.print("*");
				
				else
					System.out.print(" ");
			}
			
		 System.out.println();
		}
		
		
		System.out.println("\npattern-39\n");

		/* 
output:

    *    
   * *   
  *   *  
 *     * 
*********
 

 */for(int i=0; i<5; i++)
	{
		
		for(int j=0; j<9; j++)
		{
			if(j+i==4 || j-i==4 || i==4)
			
				System.out.print("*");
			
			else
				System.out.print(" ");
		}
		
	 System.out.println();
	}
	
 System.out.println("\npattern-40\n");

	/* 
output:

*****
*  * 
* *  
**   
*



*/

for(int i=0; i<5; i++)
	{
		for(int j=0; j<5; j++)
		{
			if(i==0 || j==0 || j+i==4)
				System.out.print("*");
			else
			System.out.print(" ");
				
		}
		System.out.println();
	}
 
System.out.println("\npattern-41\n");

/* 
output:
*****
 *  *
  * *
   **
    *


*/

for(int i=0; i<5; i++)
{
	for(int j=0; j<5; j++)
	{
		if(i==0 || j==4 || j-i==0)
			System.out.print("*");
		else
		System.out.print(" ");
			
	}
	System.out.println();
}


 System.out.println("\npattern-42\n");

	/* 
output:

----*----
---*-*---
--*-*-*--
-*-*-*-*-
*-*-*-*-*


*/
 
 for(int i=0; i<5; i++)
	{
		for(int j=0; j<9; j++)
		{
			if(j+i>=4 && j-i<=4)
			{
				if((i+j)%2==0)
				System.out.print("*");
				else
					System.out.print("-");
			}
			else
			System.out.print("-");
				
		}
		System.out.println();
	}
	
 
	

System.out.println("\npattern-43\n");

	/* 
output:

*****
 * * 
  *  
 * * 
*****

*/

for(int i=0; i<5; i++)
	{
		for(int j=0; j<5; j++)
		{
			if(i==0 || i==4 || j+i==4 || j-i==0)
				System.out.print("*");
			else
			System.out.print(" ");
				
		}
		System.out.println();
	}
	
	
System.out.println("\npattern-44\n");

/* 
output:

oo*oo
oo*oo
*****
oo*oo
oo*oo

*/

for(int i=0; i<5; i++)
{
	for(int j=0; j<5; j++)
	{
		if(i==2 || j==2)
			System.out.print("*");
		else
		System.out.print("o");
			
	}
	System.out.println();
}
		System.out.println("\nAlphabet star ");
		
		

		System.out.println("\npattern-1\n");

		/* 
output:


		  *** 
		 *   *
		 *   *
		 *****
		 *   *
		 *   *
		 *   *

		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if((i==0 && j>0 && j<4) || (j==0 && i>0) || (j==4 && i>0) || i==3)

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();
		}

		System.out.println("\npattern-2\n");

		/* 
output:

		 **** 
		 *   *
		 *   *
		 **** 
		 *   *
		 *   *
		 **** 

		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if(j==0 || ( (i==0 || i==6 || i==3) && j<4) || (j==4 && i%3!=0))

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}

		System.out.println("\npattern-3\n");


		/* 
output:

		  ****
		 *    
		 *    
		 *    
		 *    
		  **** 

		 */

		for(int i=0; i<6; i++)
		{

			for(int j=0; j<5; j++)
			{
				if(((i==0 || i==5) && j>0) || (j==0 && i>0 && i<5))

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}

		System.out.println("\npattern-4\n");


		/* 
output:

		 ****
		 *   *
		 *   *
		 *   *
		 *   * 
		 **** 

		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if(j==0 || ((i==0 || i==6) && j<4) || (j==4 && i>0 && i<6))

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}

		System.out.println("\npattern-5\n");


		/* 
output:

		 *****
		 *   
		 *
		 ****
		 *  
		 *    
		 ***** 

		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if(j==0 || i==0 || i==6 || (i==3 && j<4))

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-6\n");


		/* 
output:

		 *****
		 *   
		 *
		 ****
		 *  
		 *    
		 * 

		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if(j==0 || i==0 || (i==3 && j<4))

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		
		System.out.println("\npattern-7\n");


		/* 
output:

		  ****
		 *   
		 *
		 *  ***
		 *   *
		 *   * 
		  **** 

		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<6; j++)
			{
				if((i==3 && j>2 && j<6) ||(j==4 && i>2 && i<7) || ((i==0 || i==6) && j>0 && j<5) || (j==0 && i>0 && i<6) )

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-8\n");


		/* 
output:
         *   *
		 *   *
		 *   *
		 *****
		 *   *
		 *   *
		 *   *
		 

		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if(j==0 || j==4 || i==3 )

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-9\n");


		/* 
output:

       ***** 
		 *  
		 *   
		 *
		 *   
		 *   
	   *****    
		 

		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if(j==2 || i==0 || i==6)

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-10\n");


		/* 
output:

       ***** 
		 *  
		 *   
		 *
		 *   
	   * *   
	   ***    
		 

		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if(i==0 || j==2 || (i==6 && j<3) || (i==5 && j<1))

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-11\n");


		/* 
output:
         *   *
		 *  * 
		 * *  
		 **
		 * *	 
		 *  * 
		 *   *
          
		 

		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if(j==0 || j+i==4 || j-i==-2)

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		
		System.out.println("\npattern-12\n");


		/* 
output:
         *   
		 *   
		 *   
		 *
		 *	 
		 * 
		 *****
		 
		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if(j==0 || i==6)

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-13\n");


		/* 
output:
         *     *
		 **   **
		 * * * *
		 *  *  *
		 *	   *
		 *     *
		 *     *
		 
		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<7; j++)
			{
				if(j==0 || j==6 || (j-i==0 && i<4) || (j+i==6 && i<4))

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-14\n");


		/* 
output:
         *     *
		 **    *
		 * *   *
		 *  *  *
		 *   * *
		 *	  **
		 *     *
		
		 
		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<7; j++)
			{
				if(j==0 || j==6 || j-i==0)

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-15\n");


		/* 
output:
 *** 
*   *
*   *
*   *
*   *
*   *
 *** 
		 
		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if(((j==0 || j==4) && i>0 && i<6) ||((i==0 || i==6 ) && j>0 && j<4))

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		
		System.out.println("\npattern-16\n");


		/* 
output:
 *** 
*   *
*   *
****
*  
*  
* 
		 
		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if((j==0  && i>0 ) ||(i==0 && j>0 && j<4) || (j==4 && i<3 && i>0) || (i==3 && j<4))

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-17\n");


		/* 
output:
 *** 
*   *
*   *
*   *
*   *
* * *
 *** 
     *
		 
		 
		 */

		for(int i=0; i<8; i++)
		{

			for(int j=0; j<5; j++)
			{
				if( (j-i==-3 && i>4)|| ((j==0 || j==4) && i>0 && i<6) ||((i==0 || i==6 ) && j>0 && j<4))

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-18\n");


		/* 
output:
 *** 
*   *
*   *
****
*   * 
*   * 
*   *
 

		 
		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if((j==4 && i>3)||(j==0  && i>0 ) ||(i==0 && j>0 && j<4) || (j==4 && i<3 && i>0) || (i==3 && j<4))

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-19\n");


		/* 
output:

		 *****
		 *   
		 *
		 *****
		     *  
		     *    
		 ***** 

		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if(i==0 || i==6 || i==3 || (j==0 && i<4) || (j==4 && i>3))

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-20\n");


		/* 
output:

	   ***** 
		 *  
		 *   
		 *
		 *   
		 *   
	     * 

		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if(i==0 || j==2)

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-21\n");


		/* 
output:

*	*   
*   *
*   *
*   *
*   *
*   *
 *** 
		 */

		for(int i=0; i<7; i++)
		{

			for(int j=0; j<5; j++)
			{
				if(((j==0 || j==4) && i<6)||(i==6 && j>0 && j<4))

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-22\n");


		/* 
output:

*           *
 *		   *
  *       *
   *	 *
    *   *
	 * *
	  * 
	 
	*/
		
		for(int i=0; i<7; i++)
		{

			for(int j=0; j<13; j++)
			{
				if(j-i==0 || j+i==12)

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
	
		System.out.println("\npattern-23\n");


		/* 
output:

		 *     *
		 *     *
		 *     *
		 *	*  *
		 * * * *
		 *     *

	 
	*/
		
		for(int i=0; i<4; i++)
		{

			for(int j=0; j<7; j++)
			{
				if(j==0 || j==6 || j+i==3 || j-i==3)

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-24\n");


		/* 
output:

		*     *
		 *   * 
		  * *
		   *
		  * *
		 *   *
		*     *

	 
	*/
		
		for(int i=0; i<7; i++)
		{

			for(int j=0; j<7; j++)
			{
				if(j+i==6 || j-i==0)

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		System.out.println("\npattern-25\n");


		/* 
output:

		*     *
		 *   * 
		  * *
		   *
		   *
		   *
		   *
		  

	 
	*/
		
		for(int i=0; i<7; i++)
		{

			for(int j=0; j<7; j++)
			{
				if(((j+i==6 || j-i==0)&& i<4)|| (j==3 && i>2))

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		System.out.println("\npattern-26\n");


		/* 
output:

		*******
		     *
		    *
		   *
		  *
		 *
		******* 

	 
	*/
		
		for(int i=0; i<7; i++)
		{

			for(int j=0; j<7; j++)
			{
				if(i==0 || i==6 || j+i==6)

					System.out.print("*");

				else
					System.out.print(" ");
			}

			System.out.println();

		}
	}

}
