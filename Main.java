import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Main {

	public final static int COLS = 20;
	public final static int ROWS = 10;
	public final static int NEXT_SEAT = 4;
	public static void main(String[] args) throws IOException {
		System.out.println(seater(args[0]));
	}
	public static String seater(String file) throws IOException {
		
	boolean[][] seats = new boolean[ROWS][COLS];
	BufferedReader br = new BufferedReader(new FileReader(file));
	String line;
	int currRow = 0;
	int total_missed =0;
	String rvString = "";
	
	FileWriter writer = new FileWriter("C:\\Users\\ragha\\eclipse-workspace\\Walmart_HW\\src\\output.txt");
		while ((line = br.readLine()) != null) {
			int count = 0;
			String[] infoStrings = line.split(" ");
			currRow = Integer.parseInt(infoStrings[0].substring(1));

			do {
				if(count == Integer.parseInt(infoStrings[1]))
					break;
				writer.write("R00"+currRow+" " );
				rvString+="R00"+currRow+" ";
				for (int i =0; i<=COLS-NEXT_SEAT;i++) {
					if(!seats[currRow][i]) {
						if(count ==Integer.parseInt(infoStrings[1]) -1||i+NEXT_SEAT>=COLS
								) {
							writer.write((char) (65 +currRow)+ ""+(i+1)+" ");
							rvString+=(char) (65 +currRow)+ ""+(i+1)+" ";
						}
						else {
							writer.write((char)(65 +currRow) + ""+(i+1)+", ");
							rvString+=(char) (65 +currRow)+ ""+(i+1)+", ";
						}
						for(int z =0; z<4;z++)
							seats[currRow][i+z] = true;

						if(currRow!=ROWS&&currRow+1!=ROWS) {
							seats[currRow+1][i] = true;
						}
						if(currRow!=0&&currRow-1!=0) {
							seats[currRow-1][i] = true;
						}
						count++;
						if(count == Integer.parseInt(infoStrings[1]))
							break;
						
					}
				}
				currRow++;
				writer.write("\n");
				rvString+="\n";
			}
			while (currRow<ROWS);
			if(currRow>=ROWS) {
				total_missed+=Integer.parseInt(infoStrings[1]) -count;
			}
			

				


		}	

		writer.close();
		br.close();
		writer.close();
		return rvString;
		
	}
	


}
