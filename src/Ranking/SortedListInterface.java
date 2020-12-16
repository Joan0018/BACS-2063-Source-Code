/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ranking;


/**
 *
 * @author Lee Ling
 */
public interface SortedListInterface<T extends Comparable<T>> {
    
    public boolean add(T newEntry);
    
    public boolean remove(T anEntry);
    
    public boolean contains(T anEntry);
    
    public T getEntry(int givenPosition);
    
    public int getPosition(T anEntry);
    
    public int getLength();

    public void clear();

    public boolean isEmpty();
    
    public String toString();
    
    public void desc();
}
