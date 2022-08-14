package dataStructure;

import java.util.Objects;

public  class Vector implements List {

    private String [] list = new String[10];
    private int count;
    private boolean isEmpty = true;
    @Override
    public void add(String item) {
        isEmpty = false;
            list[count] = item;
            count++;
    }

    @Override
    public void remove(int id) {
        list[id] = null;
        count--;
    }

    @Override
    public void remove(String item) {
        for(int i = 0; i < list.length; i++){
            if(Objects.equals(list[i], item)){
                list[i] = null;
            }
        }
        count--;
    }

    @Override
    public String get(int id) {
        return list[id];
    }

    @Override
    public void add(int id, String item) {
        isEmpty = false;
        for(int i = list.length -1; i > id; i--){
            list[i] = list[i - 1];
        }
        list[id] = item;
        count++;
    }

    @Override
    public void clear() {
        for(int i = 0; i < list.length; i++){
            list[i] = null;
            isEmpty = true;
        }
        count = 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public boolean contains(String anotherItem) {
        for(String s : list){
            if(Objects.equals(s, anotherItem)){
                return true;
            }
        }
            return false;
    }

    @Override
    public void set(int id, String item) {
        list[id] = item;
        count++;
    }

}
