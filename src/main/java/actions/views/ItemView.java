package actions.views;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * アイテムについて画面の入力・出力値を扱うViewモデル
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ItemView {

    /**
     * id
     */
    private Integer id;

    /**
     * アイテム名
     */
    private String name;

    /**
     * 写真
     */
    private String picture;

}
