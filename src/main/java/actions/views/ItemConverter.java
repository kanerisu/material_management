package actions.views;

import java.util.ArrayList;
import java.util.List;

import models.Item;

/**
 * アイテムデータのDTOモデル⇔Viewモデルの変換を行うクラス
 *
 */

public class ItemConverter {

    /**
     * ViewモデルのインスタンスからDTOモデルのインスタンスを作成する
     * @param iv ItemViewのインスタンス
     * @param Itemのインスタンス
     */
    public static Item toModel(ItemView iv) {

        return new Item(
                iv.getId(),
                iv.getName(),
                iv.getPicture());
    }

    /**
     * DTOモデルのインスタンスからViewモデルのインスタンスを作成する
     * @param i Itemのインスタンス
     * @return ItemViewのインスタンス
     */
    public static ItemView toView(Item i) {

        if(i==null) {
            return null;
        }

        return new ItemView(
                i.getId(),
                i.getName(),
                i.getPicture());
    }

    /**
     * DTOモデルのリストからViewモデルのリストを作成する
     * @param list DTOモデルのリスト
     * @param Viewモデルのリスト
     */
    public static List<ItemView> toViewList(List<Item> list){
        List<ItemView> ivs=new ArrayList<>();

        for(Item i:list) {
            ivs.add(toView(i));
        }

        return ivs;
    }

    /**
     * Viewモデルの全フィールドの内容をDTOモデルのフィールドにコピーする
     * @param i DTOモデル（コピー先）
     * @param iv Viewモデル（コピー元）
     */
    public static void copyViewToModel(Item i,ItemView iv) {
        i.setId(iv.getId());
        i.setName(iv.getName());
        i.setPicture(iv.getPicture());
    }

}
