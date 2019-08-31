package com.seed.library.utility;

import java.util.Comparator;

import com.seed.library.Book;

public class CompareBookByPrice implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		if(b1.getPrice()>b2.getPrice()){
			return 1;
		}else if(b1.getPrice()<b2.getPrice()){
			return -1;
		}else{
			return 0;
		}
	}

}
