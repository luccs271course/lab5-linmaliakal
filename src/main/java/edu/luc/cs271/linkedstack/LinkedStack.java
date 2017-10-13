package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // DONE
    topOfStackRef = new Node<>(obj, topOfStackRef);
    return obj;
  }

  @Override
  public E peek() {
    // DONE
    if (isEmpty()) {
      throw new NoSuchElementException ();
    }
    else {
      return topOfStackRef.data;
    }
  }

  @Override
  public E pop() {
    // DONE
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    else {
      E result = topOfStackRef.data;
      topOfStackRef = topOfStackRef.next;
      return result; 
    }
  }

  @Override
  public boolean isEmpty() {
    // DONE
    return topOfStackRef == null;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    // TODO add any instance variable(s) required to support this
    return null;
  }
}
