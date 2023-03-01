package Pilha;

import java.util.ArrayList;

public class Stack<T> {
	private T data;
	private ArrayList<T> array;
	
	public Stack() {
		this.array = new ArrayList<T>();
	}
	
	public void push(T data) {
		this.array.add(data);
	}
	
	public T pop() {
		if (this.array.size() == 0) return this.data;
		T popped = this.array.get(this.array.size() - 1);
		this.array.remove(this.array.size() - 1);
		return popped;
	}
	
	public T top() {
		return this.array.get(this.array.size() - 1);
	}
	
	public String getArrayStack() {
		String arrayStack = "";
		
		for (T data : this.array) {
			arrayStack += data + "  ";
		}
		
		return arrayStack;
	}
}
