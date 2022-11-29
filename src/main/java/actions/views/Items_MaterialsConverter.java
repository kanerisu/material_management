package actions.views;

import java.util.ArrayList;
import java.util.List;

import models.Item_material;

/**
 * 中間テーブルのDTOモデル⇔Viewモデルの変換を行うクラス
 *
 */

public class Items_MaterialsConverter {

    /**
     * ViewモデルのインスタンスからDTOモデルのインスタンスを作成する
     * @param imv Items_MterialsViewのインスタンス
     * @return Item_materialのインスタンス
     */
    public static Item_material toModel(Items_MaterialsView imv) {

        return new Item_material(
                imv.getId(),
                imv.getItems_id(),
                imv.getMaterials_id(),
                imv.getPercentage());
    }

    /**
     * DTOモデルのインスタンスからViewモデルのインスタンスを作成する
     * @param im Item_materialのインスタンス
     * @return Items_MaterialsViewのインスタンス
     */
    public static Items_MaterialsView toView(Item_material im) {

        if(im==null) {
            return null;
        }

        return new Items_MaterialsView(
                im.getId(),
                im.getItems_id(),
                im.getMaterials_id(),
                im.getPercentage());
    }

    /**
     * DTOモデルのリストからViewモデルのリストを作成する
     * @param list DTOのモデルリスト
     * @return Viewモデルのリスト
     */
    public static List<Items_MaterialsView> toViewList(List<Item_material> list){
        List<Items_MaterialsView> imvs=new ArrayList<>();

        for(Item_material im:list) {
            imvs.add(toView(im));
        }

        return imvs;
    }

    /**
     * Viewモデルの全フィールドの内容をDTOモデルのフィールドにコピーする
     * @param im DTOモデル（コピー先）
     * @param imv Viewモデル（コピー元）
     */
    public static void copyViewToModel(Item_material im,Items_MaterialsView imv) {
        im.setId(imv.getId());
        im.setItems_id(imv.getItems_id());
        im.setMaterials_id(imv.getMaterials_id());
        im.setPercentage(imv.getPercentage());
    }

}
