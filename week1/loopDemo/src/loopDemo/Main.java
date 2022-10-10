package loopDemo.src.loopDemo;

public class Main {
	
public static void main(String[] args) {
		
		//for
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For loop is over.");
		
		//while
        int i = 1;
        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While is over");

        //do-while
        int j = 2;
        do{
            System.out.println(j);
            j+=2;
        } while(j<10);
        System.out.println("Do-while loop is over.");

	}

}
