package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import constants.JpaConst;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 素材データのDTOモデル
 *
 */
@Table(name=JpaConst.TABLE_MAT)

@Getter //全てのクラスフィールドについてgetterを自動生成する
@Setter //全てのクラスフィールドについてsetterを自動生成する
@NoArgsConstructor //引数なしのコンストラクタを自動生成する
@AllArgsConstructor //全てのクラスフィールドを引数に持つ引数ありコンストラクタを自動生成する
@Entity

public class Material {

    /**
     * id
     */
    @Id
    @Column(name=JpaConst.MAT_COL_ID)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    /**
     * 素材の名前
     */
    @Column(name=JpaConst.MAT_COL_MATERIAL_NAME,nullable=false)
    private String material_name;

    /**
     * 内容
     */
    @Column(name=JpaConst.MAT_COL_CONTENT,nullable=false)
    private String content;

}
