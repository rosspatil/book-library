package com.seed.library;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.seed.library.utility.PrintUtil;
import com.seed.library.utility.StoreUtil;

public class LibraryMain {
	public static void main(String[] args) {
		Book book=null;
		StoreUtil<Book> str=new StoreUtil<>();

		Set<String> authors=null;
		Scanner sc=new Scanner(System.in);
		while(true){

			System.out.println("***** Book Library *****");
			System.out.println("1.Add book\n2.Get number of books\n3.Print list of book\n4.Sort by name\n5.Sort by price");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:{
				authors=new HashSet<>();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter id:");
				int id=sc.nextInt();
				System.out.println("Enter number of authors:");
				int ch1=sc.nextInt();
				for (int i = 0; i < ch1; i++) {
					System.out.println("Enter Author name:");
					authors.add(sc.next());
				}

				System.out.println("Enter price:");
				int price=sc.nextInt();
				book=new Book(id, name, authors, price);
				str.addRecord(book);
				break;
			}
			case 2:
				System.out.println("Total books:"+str.getNoOfRecords());
				break;
			case 3:
				PrintUtil.printRecord(str);
				break;
			case 4:
				StoreUtil.sortByName(str);
				PrintUtil.printRecord(str);
				break;
			case 5:
				StoreUtil.sortByPrice(str);
				PrintUtil.printRecord(str);
				break;
			}
		}
	}
}
