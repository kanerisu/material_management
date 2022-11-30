package services;

import java.util.List;

import actions.views.ItemConverter;
import actions.views.ItemView;
import actions.views.Items_MaterialsConverter;
import actions.views.Items_MaterialsView;
import constants.JpaConst;
import models.Item;
import models.Item_material;

/**
 * アイテムテーブルの操作に関わる処理を行うクラス
 */

public class ItemService extends ServiceBase{

    /**
     * 指定されたページ数の一覧画面に表示するデータを取得し、ItemViewのリストで返却する
     * @param page ページ数
     * @return 表示するページのリスト
     */
    public List<ItemView> getPerpage(int page){
        List<Item> items=em.createNamedQuery(JpaConst.Q_ITE_GET_ALL,Item.class)
                .setFirstResult(JpaConst.ROW_PER_PAGE*(page-1))
                .setMaxResults(JpaConst.ROW_PER_PAGE)
                .getResultList();

        return ItemConverter.toViewList(items);
    }

    /**
     * アイテムテーブルのデータの件数を取得し、返却する
     * @return アイテムテーブルのデータの件数
     */
    public long countAll() {
        long iteCount=(long) em.createNamedQuery(JpaConst.Q_ITE_COUNT,Long.class)
                .getSingleResult();

        return iteCount;
    }


    /**
     * idを条件に取得したデータをItemViewのインスタンスで返却する
     * @param id
     * @return 取得したデータのインスタンス
     */
    public ItemView findOne(int id) {
        Item i=findOneInternal(id);
        return ItemConverter.toView(i);
    }

    /**
     * idを条件に取得したデータをItem_Materialsのインスタンスで返却する
     * @param id
     * @return 取得したデータのインスタンス
     */
    public Items_MaterialsView findOnes(int id) {
        Item_material im=findOneInternals(id);
        return Items_MaterialsConverter.toView(im);
    }

    /**
     * idを条件にデータを1件取得し、Itemのインスタンスで返却する
     * @param id
     * @return 取得データのインスタンス
     */
    private Item findOneInternal(int id) {
        Item i=em.find(Item.class,id);

        return i;
    }

    /**
     * idを条件にデータを1件取得し、Item_materialのインスタンスで返却する
     * @param id
     * @return 取得データのインスタンス
     */

    private Item_material findOneInternals(int id) {
        Item_material im=em.find(Item_material.class,id);

        return im;
    }

    /**
     * アイテムデータを1件登録する
     * @param iv アイテムデータ
     * @return 登録結果
     */
    private void create(ItemView iv) {

        em.getTransaction().begin();
        em.persist(ItemConverter.toModel(iv));
        em.getTransaction().commit();
    }

    /**
     * 割合を1件登録する
     * @param imv 割合データ
     * @return 登録結果
     */
    private void create(Items_MaterialsView imv) {

        em.getTransaction().begin();
        em.persist(Items_MaterialsConverter.toModel(imv));
        em.getTransaction().commit();
    }

    /**
     * アイテムデータを更新する
     * @param iv 画面から入力されたアイテムの登録内容
     */
    private void update(ItemView iv) {

        em.getTransaction().begin();
        Item i=findOneInternal(iv.getId());
        ItemConverter.copyViewToModel(i,iv);
        em.getTransaction().commit();
    }

    /**
     * 割合データを更新する
     * @param imv 画面から入力された割合の登録内容
     */
    private void update(Items_MaterialsView imv) {

        em.getTransaction().begin();
        Item_material im=findOneInternals(imv.getId());
        Items_MaterialsConverter.copyViewToModel(im, imv);
        em.getTransaction().commit();
    }

}

