package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import constants.JpaConst;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *中間テーブルデータのDTOモデル
 */
@Table(name=JpaConst.TABLE_ITE_MAT)
@NamedQueries({
    @NamedQuery(
            name=JpaConst.Q_ITE_MAT_GET_ALL,
            query=JpaConst.Q_ITE_MAT_GET_ALL_DEF)
})

@Getter //全てのクラスフィールドについてgetterを自動生成する
@Setter //全てのクラスフィールドについてsetterを自動生成する
@NoArgsConstructor //引数なしのコンストラクタを自動生成する
@AllArgsConstructor //全てのクラスフィールドを引数に持つ引数ありコンストラクタを自動生成する
@Entity

public class Item_material {

    /**
     * id
     */
    @Id
    @Column(name=JpaConst.ITE_MAT_COL_ID)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    /**
     * アイテムテーブルのid
     */
    @Column(name=JpaConst.ITE_MAT_ITE_COL_ID)
    private Integer items_id;

    /**
     * 素材テーブルのid
     */
    @Column(name=JpaConst.ITE_MAT_MAT_COL_ID)
    private Integer materials_id;

    /**
     * 割合
     */
    @Column(name=JpaConst.ITE_MAT_COL_PERCENTAGE)
    private Integer percentage;

}
