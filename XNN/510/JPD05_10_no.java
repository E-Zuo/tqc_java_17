import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class JPD05 {

	public static void main(String[] args) {
		try {

			String title = "The Little Prince";
			String content = "To me, you are still nothing more than a little boy who is just like a hundred thousand other little boys. And I have no need of you. And you, on your part, have no need of me. To you, I am nothing more than a fox like a hundred thousand other foxes. But if you tame me, then we shall need each other. To me, you will be unique in all the world. To you, I shall be unique in all the world.";
			// TO DO

			Scanner sc = new Scanner(System.in);
			File f = new File("write.txt");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			// TO DO




		} catch (Exception ex) {
			System.out.print("error");
			return;
		}
	}
}
