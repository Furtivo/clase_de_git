package kaban;

import java.util.Arrays;


public class Dashboard implements IDashboard {

	private int size;
	private transient Tarea[] tareas;
	private transient int modCount = 0;

	/**
	 * Inserts the specified task at the specified position in this list. Shifts
	 * the task currently at that position (if any) and any subsequent tasks to
	 * the right (adds one to their indices).
	 */
	public boolean agregar(Tarea tarea) {
		ensureCapacity(size + 1);
		tareas[size++] = tarea;
		return true;
	}

	public void ensureCapacity(int minCapacity) {
		modCount++;
		int oldCapacity = tareas.length;
		if (minCapacity > oldCapacity) {
			int newCapacity = (oldCapacity * 3) / 2 + 1;
			if (newCapacity < minCapacity)
				newCapacity = minCapacity;
			// minCapacity is usually close to size, so this is a win:
			tareas = Arrays.copyOf(tareas, newCapacity);
		}
	}

	public boolean remover(Tarea tarea) {
		if (tarea == null) {
			for (int index = 0; index < size; index++)
				if (tareas[index] == null) {
					fastRemove(index);
					return true;
				}
		} else {
			for (int index = 0; index < size; index++)
				if (tarea.equals(tareas[index])) {
					fastRemove(index);
					return true;
				}
		}
		return false;
	}

	/**
	 * Private remove method that skips bounds checking and does not return the
	 * value removed.
	 * 
	 */
	private void fastRemove(int index) 
	{
		modCount++;
		int numMoved = size - index - 1;
		if (numMoved > 0)
			System.arraycopy(tareas, index + 1, tareas, index, numMoved);
		tareas[--size] = null; // Let gc do its work
	}
	public void clear() 
	{
		modCount++;
		// Let gc do its work
		for (int i = 0; i < size; i++)
			tareas[i] = null;

		size = 0;
	}
	public Dashboard(int initialCapacity) 
	{
		super();
		if (initialCapacity < 0)
			throw new IllegalArgumentException("Illegal Capacity: "
					+ initialCapacity);
		this.tareas = new Tarea[initialCapacity];
	}

	public Dashboard() {
		this(10);
	}
}

