package fr.mds.designpattern.singeton.entities;

import java.util.ArrayList;
import java.util.List;

public class EntitiesList {

    private EntitiesList() {

        List<Entity1> result = new ArrayList<Entity1>();

        for (int i = 0; i < 20; i++) {
            Entity1 e1 = new Entity1();
            e1.setId(i);
            e1.setData("data " + i);
            result.add(e1);
        }

        this.list= result;
        this.id = list.size() - 1;
    }

    private static EntitiesList INSTANCE = null;
    private List list;
    private int id;

    public static synchronized EntitiesList getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new EntitiesList();
        }
        return INSTANCE;
    }


    public List getList() {
        return this.list;
    }

    public int getListSize() {
        return this.list.size();
    }

    public void add() {
        this.id++;
        Entity1 e = new Entity1();
        e.setId(this.id);
        e.setData("data " + this.id);
        this.list.add(e);
    }

    public void remove(int id) {
       //Pas fini :)
    }

}
