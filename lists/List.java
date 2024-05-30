package lists;

import java.util.Arrays;

/**
 * List class provides an implementation for storing heterogenus items.
 * Implements a python like list that stores every kind of object.
 * Provides methods to add, get, delete and update elements
 * Provides method to display the entire list
 */
public class List {
	private Object[] list;
	int size;

	public List() {
		list = new Object[1];
		size = 0;
	}

	public int size() {
		return size;
	}

	public void add(Object element) {
		if (size == list.length) {
			list = Arrays.copyOf(list, list.length + 1);
		}
		list[size++] = element;
	}

	public void delete(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index Out of range");
		}
		for (int i = index; i < size - 1; i++) {
			list[i] = list[i + 1];
		}
		list[--size] = null;
		list = Arrays.copyOf(list, list.length - 1);
	}

	public Object get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index Out of range");
		}
		return list[index];
	}

	public void update (int index, Object element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index Out of range");
		}
		list[index] = element;
	}

	public void display() {
		System.out.print('[');
		for (int i = 0; i < size; i++) {
			Object element = this.get(i);
			if (element instanceof String) {
				System.out.print('"' + element.toString() + '"');
			} else if (element instanceof Character) {
				System.out.print("'" + element.toString() + "'");
			} else {
				System.out.print(element.toString());
			}
			if (i < size - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(']');
	}
}