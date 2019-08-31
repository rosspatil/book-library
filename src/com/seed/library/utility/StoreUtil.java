package com.seed.library.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.seed.library.Book;

public class StoreUtil<T> {
	
	List<T> record=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	
	public void addRecord(Book book){		
		
		record.add((T) book);
		
	}
	
	public void getRecord(){
		
		for (T book : record) {
			System.out.println(book);
		}
		
	}
	
	public int getNoOfRecords(){
		return record.size();
		
	}
	
	
	public static void sortByName(StoreUtil str){
		CompareBookByName cmpName=new CompareBookByName();
		Collections.sort(str.record,cmpName);
		
	}
	
	public static void sortByPrice(StoreUtil str){
		
		CompareBookByPrice cmpPrice=new CompareBookByPrice();
		Collections.sort(str.record,cmpPrice);
	}

}
