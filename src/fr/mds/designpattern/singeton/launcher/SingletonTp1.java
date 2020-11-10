package fr.mds.designpattern.singeton.launcher;

import fr.mds.designpattern.singeton.entities.EntitiesList;
import fr.mds.designpattern.singeton.entities.Entity1;

import java.util.ArrayList;
import java.util.List;


/**
*
* @author tactfactory
*
* - Modifier le programme pour :
*   - 1 : permettre d'accéder n'importe où dans le projet à la liste d'Entity1
*   - 2 : faire en sorte que les ajouts, suppresions sur la liste d'Entity1 soient préservés durant l'exécution du
*       programme
*   - 3 : que les id des éléments dans la liste ne soient plus saisissables par le développeur et qu'ils deviennent
*       auto-incrémentés
*/
public class SingletonTp1 {
  public static void main(String[] args) {

    System.out.println(String.format("Nombre d'Entity1 %d", EntitiesList.getInstance().getListSize()));


    EntitiesList.getInstance().add();
    EntitiesList.getInstance().add();
    EntitiesList.getInstance().add();
    EntitiesList.getInstance().add();
    EntitiesList.getInstance().add();
    EntitiesList.getInstance().add();

    System.out.println(EntitiesList.getInstance().getList());

    System.out.println(String.format("Nombre d'Entity1 %d", EntitiesList.getInstance().getListSize()));

    for (Object item : EntitiesList.getInstance().getList()) {
        System.out.println(item);
    }

  }
}
