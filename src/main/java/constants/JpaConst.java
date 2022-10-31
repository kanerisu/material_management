package constants;

/**
 * DB関連の項目値を定義するインターフェース
 * ※インターフェースに定義した変数はpublic static final 修飾子がついているとみなされる
 */

public interface JpaConst {

    //persistence-unit名
    String PERSISTENCE_UNIT_NAME="material_management";

    //データ取得数の最大値
    int ROW_PER_PAGE=15; //1ページに表示するレコードの数

    //アイテムテーブル
    String TABLE_ITE="items"; //テーブル名
    //アイテムテーブルカラム
    String ITE_COL_ID="id"; //id
    String ITE_COL_NAME="name"; //アイテム名
    String ITE_COL_PICTURE="picture"; //写真
    String ITE_COL_MATERIAL_NAME_1="material_name_1"; //素材名1
    String ITE_COL_MATERIAL_NAME_2="material_name_2"; //素材名2
    String ITE_COL_MATERIAL_NAME_3="material_name_3"; //素材名3
    String ITE_COL_MATERIAL_NAME_4="material_name_4"; //素材名4
    String ITE_COL_MATERIAL_NAME_5="material_name_5"; //素材名5
    String ITE_COL_MATERIAL_NAME_6="material_name_6"; //素材名6
    String ITE_COL_PERCENTAGE_1="percentage_1"; //割合1
    String ITE_COL_PERCENTAGE_2="percentage_2"; //割合2
    String ITE_COL_PERCENTAGE_3="percentage_3"; //割合3
    String ITE_COL_PERCENTAGE_4="percentage_4"; //割合4
    String ITE_COL_PERCENTAGE_5="percentage_5"; //割合5
    String ITE_COL_PERCENTAGE_6="percentage_6"; //割合6

    //素材テーブル
    String TABLE_MAT="materials"; //テーブル名
    //素材テーブルカラム
    String MAT_COL_ID="id"; //id
    String MAT_COL_MATERIAL_NAME="material_name"; //素材名
    String MAT_COL_CONTENT="content"; //素材の内容

    //中間テーブル
    String TABLE_ITE_MAT="items_materials"; //テーブル名
    //中間テーブルカラム
    String ITE_MAT_ID="id"; //id
    String ITE_MAT_ITE_ID="items_id"; //アイテムテーブルのid
    String ITE_MAT_MAT_ID="materials_id"; //素材テーブルのid

    //Entity名
    String ENTITY_ITE="item"; //アイテム
    String ENTITY_MAT="material"; //素材
    String ENTITY_ITE_MAT="item_material"; //

    //JPQLパラメータ
    String JPQL_PARM_ITEM="item"; //アイテム

    //NamedQueryのNameとquery

    //全てのアイテムをidの降順に取得する
    String Q_ITE_GET_ALL=ENTITY_ITE+".getAll"; //name
    String Q_ITE_GET_ALL_DEF="SELECT e FROM Item AS e ORDER BY e.id DESC"; //query

    //全てのアイテムの件数を取得する
    String Q_ITE_COUNT=ENTITY_ITE+".count";
    String Q_ITE_COUNT_DEF="SELECT COUNT(e) FROM Item AS e";

}

