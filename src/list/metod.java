package list;

import model.Product;

public interface metod {
    void add(int id,String name,long price);
    void upDate(int index,String newName,long newPrice);
    void remove(int index);
    void displayList();
    void seachProduct(String name);
    void sort();
}
