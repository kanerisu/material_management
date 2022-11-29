package actions.views;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 素材について画面の入力値・出力値を扱うViewモデル
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MaterialView {

    /**
     * id
     */
    private Integer id;

    /**
     * 素材の名前
     */
    private String material_name;

    /**
     * 内容
     */
    private String content;

}
