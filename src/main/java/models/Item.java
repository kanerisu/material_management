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
 * アイテムデータのDTOモデル
 *
 */
@Table(name=JpaConst.TABLE_ITE)
@NamedQueries({
    @NamedQuery(
            name=JpaConst.Q_ITE_GET_ALL,
            query=JpaConst.Q_ITE_GET_ALL_DEF),
    @NamedQuery(
            name=JpaConst.Q_ITE_COUNT,
            query=JpaConst.Q_ITE_COUNT_DEF)
})

@Getter //全てのクラスフィールドについてgetterを自動生成する
@Setter //全てのクラスフィールドについてSetterを自動生成する
@NoArgsConstructor //引数なしのコンストラクタを自動生成する
@AllArgsConstructor //全てのクラスフィールドを引数に持つ引数ありコンストラクタを自動生成する
@Entity

public class Item {

    /**
     * id
     */
    @Id
    @Column(name=JpaConst.ITE_COL_ID)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    /**
     * アイテム名
     */
    @Column(name=JpaConst.ITE_COL_NAME,nullable=false)
    private String name;

    /**
     * 写真
     */
    @Column(name=JpaConst.ITE_COL_PICTURE,nullable=false)
    private String picture;

}
