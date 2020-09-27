package list;

import model.Product;

import java.util.ArrayList;

public class List implements metod {
    private ArrayList<Product> lists;

    public List() {
        this.lists = new ArrayList<>();
    }



    @Override
    public void add(int id,String name,long price) {
        lists.add(new Product(id,name,price));
    }

    @Override
    public void upDate(int inputID,String newName,long newPrice) {

        for (Product list: lists) {
            if (inputID == list.getiD()){
                list.setName(newName);
                list.setPrice(newPrice);
            }else {
                System.out.println("Sản phẩm này không có!");
            }

        }


    }


    @Override
    public void remove(int inputID) {
        for (Product listiD : lists) {
           if (inputID == listiD.getiD()){
               lists.remove(inputID);
           }
           else System.out.println("iD sản phẩm này không có");
        }

    }

    @Override
    public void displayList() {
        for (Product list: lists) {
            System.out.println(list);
        }
    }

    @Override
    public void seachProduct(String nameseach) {
        for (Product name: lists) {
            if (nameseach.equals(name.getName())){
                System.out.println(name);
            }
        }

    }

    @Override
    public void sort() {

    }
}
