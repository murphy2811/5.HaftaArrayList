package Dizilistesi;

import java.util.ArrayList;

public class ArrayLİst {

	public static void main(String[] args) {

		ArrayList<String>item= new ArrayList<>();
		item.add("red");  //0. indeks
		item.add("yellow"); //1. indeks
		item.add(0,"green"); //0. indekse yeni atama yaptık
		
		//0. indekse yeni bir eleman atayınca tüm elemanlar bir indeks sonrasına kaydı
		
		for(String renk : item) {
			System.out.print(" " + renk);
			
		}
		item.remove("red");
		System.out.println(" ");
		//red elemanını sildik
		for(String renk : item) {
			
			System.out.print(" " + renk);
		}
		
		System.out.println("");
		System.out.print(item.get(1));
		
		
		System.out.println(item.contains("red") ? "evet var  " :"hayir yok"); //icinde red var mi 
		
		
		
		
		
		
	}

}
