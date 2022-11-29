package actions.views;

import java.util.ArrayList;
import java.util.List;

import models.Material;

/**
 * 素材データのDTOモデル⇔Viewモデルの変換を行うクラス
 *
 */

public class MaterialConverter {

    /**
     * ViewモデルのインスタンスからDTOモデルのインスタンスを作成する
     * @param mv MaterialViewのインスタンス
     * @return Materialのインスタンス
     */
    public static Material toModel(MaterialView mv) {

        return new Material(
                mv.getId(),
                mv.getMaterial_name(),
                mv.getContent());

    }
    /**
     * DTOモデルのインスタンスからViewモデルのインスタンスを作成する
     * @param m Materialのインスタンス
     * @return MaterialViewのインスタンス
     */
    public static MaterialView toView(Material m) {
        if(m==null) {
            return null;
        }
        return new MaterialView(
                m.getId(),
                m.getMaterial_name(),
                m.getContent());
    }

    /**
     * DTOモデルのリストからViewモデルのリストを作成する
     * @param list DTOモデルのリスト
     * @return Viewモデルのリスト
     */
    public static List<MaterialView> toViewList(List<Material> list){
        List<MaterialView> mvs=new ArrayList<>();

        for(Material m:list) {
            mvs.add(toView(m));
        }
        return mvs;
    }

    /**
     * Viewモデルの全フィールドの内容をDTOモデルのフィールドにコピーする
     * @param m DTOモデル（コピー先）
     * @param mv Viewモデル（コピー元）
     */
    public static void copyViewToModel(Material m,MaterialView mv) {
        m.setId(mv.getId());
        m.setMaterial_name(mv.getMaterial_name());
        m.setContent(mv.getContent());
    }


}
