package constants;

/**
 * 画面の項目値等を定義するEnumクラス
 *
 */

public enum AttributeConst {

    //フラッシュメッセージ
    FLUSH("flush"),

    //一覧画面共通
    MAX_ROW("maxRow"),
    PAGE("page"),

    //入力フォーム共通
    TOKEN("_token"),
    ERR("errors"),

    //アイテム
    ITEM("item"),
    ITEMS("items"),
    ITE_COUNT("item_count"),
    ITE_ID("id"),
    ITE_NAME("name"),
    ITE_PICTURE("picture"),
    ITE_MATERIAL_NAME1("material_name_1"),
    ITE_MATERIAL_NAME2("material_name_2"),
    ITE_MATERIAL_NAME3("material_name_3"),
    ITE_MATERIAL_NAME4("material_name_4"),
    ITE_MATERIAL_NAME5("material_name_5"),
    ITE_MATERIAL_NAME6("material_name_6"),
    ITE_PERCENTAGE_1("percentage_1"),
    ITE_PERCENTAGE_2("percentage_2"),
    ITE_PERCENTAGE_3("percentage_3"),
    ITE_PERCENTAGE_4("percentage_4"),
    ITE_PERCENTAGE_5("percentage_5"),
    ITE_PERCENTAGE_6("percentage_6"),

    //素材
    MATERIAL("material"),
    MATERIALS("materials"),
    MAT_COUNT("material_count"),
    MAT_ID("id"),
    MAT_MATERIAL_NAME("material_name"),
    MAT_CONTENT("content_msg"),

    //中間テーブル
    ITEM_MATERIAL("item_material"),
    ITEMS_MATERIALS("items_materials"),
    ITE_MAT_ITE_ID("items_id"),
    ITE_MAT_MAT_ID("materials_id");

    private final String text;
    private final Integer i;

    private AttributeConst(final String text) {
        this.text=text;
        this.i=null;
    }

    private AttributeConst(final Integer i) {
        this.text=null;
        this.i=i;
    }

    public String getValue() {
        return this.text;
    }

    public Integer getIntegerValue() {
        return this.i;
    }

}
