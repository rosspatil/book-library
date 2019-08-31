package com.seed.library.utility;

import java.util.Comparator;

import com.seed.library.Book;

public class CompareBookByName implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		return b1.getName().compareTo(b2.getName());
	}

}
