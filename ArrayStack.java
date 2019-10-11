public class ArrayStack<T> implements Stack<T>{
	public int top = -1;
	public T[] a;

	public T pop() throws Exception {
		if(empty()) {
			throw new Exception();
		}

		T temp = a[top];
		a[top--] = temp;
		return temp;
	}

	public T peek() throws Exception {
		if(empty()) {
			throw new Exception("It's empty");
		}

		return(a[top]);

	}

	public boolean empty() {
		return (top == -1);
	}

	public void push(T item) {
		a[top++] = item;
	}

	
}