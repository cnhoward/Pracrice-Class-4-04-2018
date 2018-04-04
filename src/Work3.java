
public class Work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] numbers = {7, 29, 18, 72, 20, 12};

int small = numbers[0];
int secondsmall = numbers[1];

for (int i = 0; i<=numbers.length-1; i++){
	if ( numbers[i]<small)
		small = numbers[i];
}
		

for (int i = 0; i<=numbers.length-1; i ++){
	if( numbers[i] > small && secondsmall > numbers[i]){
		secondsmall = numbers[i];
	}
		
}






System.out.println(small);
System.out.println(secondsmall);		


	}

}
