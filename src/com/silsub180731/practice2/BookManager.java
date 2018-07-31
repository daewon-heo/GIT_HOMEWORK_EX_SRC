package com.silsub180731.practice2;

import java.util.ArrayList;

public class BookManager {
	private ArrayList<Book> bookList;
	
	public BookManager(){
		bookList = new ArrayList<Book>();
	}
	
	public BookManager(ArrayList<Book> bookList){
		this.bookList = bookList;
	}
	
	public void addBook(Book book){
		System.out.println(book.toString());
		bookList.add(book);
	}
	
	public void deleteBook(String title){
		for(int i = 0; i < bookList.size(); i++){
			if(title.equals(((Book) bookList.get(i)).getTitle())){
				bookList.remove(i);
			}
		}
	}
	
	public int searchBook(String bTitle){
		int index = -1;
		for(int i = 0; i < bookList.size(); i++){
			if(bTitle.equals(((Book) bookList.get(i)).getTitle())){
				index = i;
			}
		}
		return index;
	}
	
	public void printBook(int index){
		System.out.println(bookList.get(index).toString());
	}
	
	public void displayAll(){
		for(int i = 0 ; i < bookList.size(); i++){
			System.out.println(bookList.get(i).toString());
		}
	}
	
	public Book[] sortedBookList(){
		bookList.sort(new AscCategory());
		Book[] books = new Book[bookList.size()];
		books = bookList.toArray(books);
		return books;
	}
	
	public void printBookList(Book[] br){
		for(Book book : br){
			System.out.println(book.toString());
		}
	}
}
