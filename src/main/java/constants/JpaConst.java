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
    String ITE_MAT_PERCENTAGE="percentage"; //割合

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
    
    //全ての割合を降順に取得する
    String Q_ITE_MAT_GET_ALL=ENTITY_ITE_MAT+".getAll";
    String Q_ITE_MAT_GET_ALL_DEF="SELECT e FROM Item_material AS e ORDER BY e.percentage DESC";

}

