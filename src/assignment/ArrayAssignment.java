package assignment;


import java.util.Scanner;


public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int varArgs;
		//addMatrix();
		System.out.println("========AVERAGE ARRAY========");
		//averageArray();
		System.out.println("========MULTIPLY ARRAY========");
		mulitplyMatrix();
		System.out.println("========VARIABLE ARGUMENT========");
		System.out.println("Enter a number you want displayed");
		//varArgs = userInput.nextInt();
		//variableArgs(varArgs);
		userInput.close();
	}
	
	
	
	private static void averageArray() {
		
		float[] testArray = new float[5];
		float average = 0f;
		int totalNumbers = 0;
		int sum = 0;
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.print("Enter 5 numbers :\n||");
		
		
		for(int i = 0; i <testArray.length;i++)
		{
			
			testArray[i] = userInput.nextFloat();
			System.out.print("||");
		}
		
		userInput.close();
		System.out.println("============\n");
		
		for(float index : testArray)
		{
			totalNumbers++;
			sum += index;	
		}
		
		System.out.println("Average is : "+ (average = sum/totalNumbers));
		
		userInput.close();
	}
	
	private static void irregularArraySample() {
		
		int[][] irregArray = new int [3][];
		
		for (int i=0; i<3; i++)
		  irregArray[i] = new int [i*2+1];

		
		for (int i=0; i<3; i++)
		  for (int j=0; j<irregArray[i].length; j++)
		    irregArray[i][j] = i*3+j;
	}
	
	private static void variableArgs(int a) {
		
		for(int i = 0; i<a; i++)
		{
			for(int j = i-1; j<a; j++)
			{
				System.out.print(a);
			}
			System.out.println("-------");

		}
	}
	
	private static void addMatrix() {
		
		float[][] firstMatrix = new float[3][3];
		float[][] secondMatrix = new float[3][3];
		float[][] addedMatrix = new float [3][3];
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter 9 numbers for your first array :\n||");
		
	// FIRST ARRAY
		
		for(int i = 0; i <3;i++)
		{
			for(int j = 0; j<3;j++) {
			
				firstMatrix[i][j] = userInput.nextFloat();
				System.out.print("||");
			}
			
			System.out.print("Row : "+i+"\n||");
		}
		
	/*==================================================================*/
		
		System.out.print("Enter 9 numbers for your second array :\n||");
		
	//SECOND ARRAY
		
		for(int i = 0; i <3;i++)
		{
			for(int j = 0; j<3;j++) {
			
			secondMatrix[i][j] = userInput.nextFloat();
			System.out.print("||");
			}
			System.out.print("Row : "+i+"\n||");
		}
		
		System.out.println("Value of both Matrices added : ");
		
		for(int i = 0; i <3;i++)
		{
			for(int j = 0; j<3;j++) {
			
			addedMatrix[i][j] = firstMatrix[i][j]+secondMatrix[i][j];
			System.out.print(addedMatrix[i][j] + " ");
			}
			System.out.println("");
		}
		
		userInput.close();
		
		
	}

	private static void mulitplyMatrix()
	{
		float[][] firstMatrix = new float[2][3];
		float[][] secondMatrix = new float[3][4];
		float[][] multiMatrix = new float [2][4];
		float result = 0f;
		int multiMatrixIndex = 0;
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.print("Enter 6 numbers for your first array :\n||");
		
	// FIRST ARRAY
		
		for(int i = 0; i <2;i++)
		{
			for(int j = 0; j<3;j++) {
			
				firstMatrix[i][j] = userInput.nextFloat();
				System.out.print("||");
			}
			
			System.out.print("Row : "+i+"\n||");
		}
		
	/*==================================================================*/
		
		System.out.print("Enter 12 numbers for your second array :\n||");
		
	//SECOND ARRAY
		
		for(int i = 0; i <3;i++)
		{
			for(int j = 0; j<4;j++) {
			
			secondMatrix[i][j] = userInput.nextFloat();
			System.out.print("||");
			}
			System.out.print("Row : "+i+"\n||");
		}
		
		System.out.println("Value of both Matrices added : ");
		
		
		for(int h = 0; h <2; h++)
		{
			multiMatrixIndex = 0;
			
			for(int i = 0; i <4;i++)
			{
				result = 0;
				
				for(int j=0; j<3;j++) {
				
					
						result = result + firstMatrix[h][j]*secondMatrix[j][i];
	
					
					
				}
				if(multiMatrixIndex<4)
					{multiMatrix[h][multiMatrixIndex]=result;
					System.out.print(multiMatrix[h][multiMatrixIndex]+" ");}

					multiMatrixIndex++;
				
				
				
			}
			System.out.println("");
		}	
			userInput.close();
			System.out.println("");
		}
}
	


