package actions.views;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 中間テーブルについて画面の入力値・出力値を扱うViewモデル
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Items_MaterialsView {

    /**
     * id
     */
    private Integer id;

    /**
     * アイテムテーブルのid
     */
    private Integer items_id;

    /**
     * 素材テーブルのid
     */
    private Integer materials_id;

    /**
     * 割合
     */
    private Integer percentage;

}
